package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * Calculator Class for all runway lengths that will
 * change when an object is added.
 */
public class DynamicLengthCalculator extends Calculator {

    private ConstantLengthCalculator constantLengthCalculator;
    private ConstantPositionCalculator constantPositionCalculator;

    /**
     * Constructor for the Dynamic Length Calculator.
     * @param physicalRunway the physical runway associated with this calculator.
     */
    public DynamicLengthCalculator(PhysicalRunway physicalRunway) {
        super(physicalRunway);
        constantLengthCalculator = physicalRunway.getConstantLengthCalculator();
        constantPositionCalculator = physicalRunway.getConstantPositionCalculator();
    }

    /**
     * Calculates the length of the TORA for the given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getTora(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);

        if (!runway.hasRunwayObstacle()) {
            //no obstacle
            return runway.getOriginalTora();
        }
        RunwayObstacle runwayObstacle = runway.getRunwayObstacle();

        if (checkSide(runwayObstacle, side)) {
            //Plane taking-off away from obstacle
            return runway.getOriginalTora()
                    - runwayObstacle.getThresholdDistance()
                    - physicalRunway.getObstacle().getLength()
                    - constantLengthCalculator.getBlastProtection()
                    - constantLengthCalculator.getDisplacedThresholdLength(side);
        } else {
            //Plane taking-off towards obstacle
            int slopeCalculation = getSlopeCalculation();
            if (slopeCalculation < constantLengthCalculator.getResa()) {
                slopeCalculation = constantLengthCalculator.getResa();
            }
            return runwayObstacle.getThresholdDistance()
                    + constantLengthCalculator.getDisplacedThresholdLength(side)
                    - slopeCalculation
                    - constantLengthCalculator.getStripMargin();
        }
    }

    /**
     * Calculates the length of the TODA for the given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getToda(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);

        if (!runway.hasRunwayObstacle()) {
            //no obstacle
            return runway.getOriginalToda();
        }
        RunwayObstacle runwayObstacle = runway.getRunwayObstacle();

        if (checkSide(runwayObstacle, side)) {
            //Plane taking-off away from obstacle
            return getTora(side) + constantLengthCalculator.getClearwayLength(side);
        } else {
            //Plane taking-off towards obstacle
            return getTora(side);
        }
    }

    /**
     * Calculates the length of the ASDA for the given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getAsda(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);

        if (!runway.hasRunwayObstacle()) {
            //no obstacle
            return runway.getOriginalAsda();
        }
        RunwayObstacle runwayObstacle = runway.getRunwayObstacle();

        if (checkSide(runwayObstacle, side)) {
            //Plane taking-off away from obstacle
            return getTora(side) + constantLengthCalculator.getStopwayLength(side);
        } else {
            //Plane taking-off towards obstacle
            return getTora(side);
        }
    }

    /**
     * Calculates the length of the LDA for the given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getLda(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);

        if (!runway.hasRunwayObstacle()) {
            //no obstacle
            return runway.getOriginalLda();
        }
        RunwayObstacle runwayObstacle = runway.getRunwayObstacle();
        int distanceToCurrentThreshold = runwayObstacle.getThresholdDistance();
        int distanceToOppositeThreshold = getLogicalRunwayForSide(RunwaySide.opposite(side))
                .getRunwayObstacle().getThresholdDistance();

        if (distanceToOppositeThreshold > distanceToCurrentThreshold) {
            //Plane landing over obstacle
            int slopeCalculation = getSlopeCalculation() + constantLengthCalculator.getStripMargin();
            if (slopeCalculation < constantLengthCalculator.getBlastProtection()) {
                slopeCalculation = constantLengthCalculator.getBlastProtection();
            }
            return runway.getOriginalLda()
                    - runwayObstacle.getThresholdDistance()
                    - physicalRunway.getObstacle().getLength()
                    - slopeCalculation;
        } else {
            //Plane landing towards obstacle
            return runwayObstacle.getThresholdDistance()
                    - constantLengthCalculator.getResa()
                    - constantLengthCalculator.getStripMargin();
        }
    }

    /**
     * Get the distance to the obstacle for the specified runway side.
     * Obstacle has to be present at the opposite side.
     *
     * @param side the side of the runway the distance should be computed for
     * @return the distance to the obstacle
     */
    public int getObstacleThresholdDistance(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(RunwaySide.opposite(side));
        if (logicalRunway.hasRunwayObstacle()) {
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            var distanceBetweenThresholds = constantPositionCalculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD)
                    - constantPositionCalculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
            return distanceBetweenThresholds - (runwayObstacle.getThresholdDistance()
                    + runwayObstacle.getObstacle().getLength());
        } else {
            throw new IllegalArgumentException("Cannot calculate distance to obstacle because there is no obstacle "
                    + "on side " + side);
        }
    }

    /**
     * calculates the 1/50 slope for an obstacle.
     * @return the slope calculation
     */
    public int getSlopeCalculation() {
        return physicalRunway.getObstacle().getHeight() * 50;
    }

    /**
     * Checks the side of the runway obstacle.
     *
     * @param runwayObstacle the runway obstacle
     * @param side teh runway side
     * @return true if the obstacle is on the specified side, false otherwise
     */
    public boolean checkSide(RunwayObstacle runwayObstacle, RunwaySide side) {
        int distanceToCurrentThreshold = runwayObstacle.getThresholdDistance()
                + constantLengthCalculator.getDisplacedThresholdLength(side);
        int distanceToOppositeThreshold = getLogicalRunwayForSide(RunwaySide.opposite(side))
                .getRunwayObstacle().getThresholdDistance()
                + constantLengthCalculator.getDisplacedThresholdLength(RunwaySide.opposite(side));
        if (distanceToCurrentThreshold < distanceToOppositeThreshold) {
            //closer to current threshold
            return true;
        }
        //closer to opposite threshold
        return false;
    }

}
