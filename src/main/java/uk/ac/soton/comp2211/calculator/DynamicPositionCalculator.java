package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * Calculator Class for all runway positions that will
 * change when an object is added.
 */
public class DynamicPositionCalculator extends Calculator {


    private ConstantPositionCalculator constantPositionCalculator;
    private DynamicLengthCalculator dynamicLengthCalculator;
    private ConstantLengthCalculator constantLengthCalculator;

    /**
     * Constructor for the Dynamic Position Calculator.
     * @param physicalRunway the physical runway associated with this calculator.
     */
    public DynamicPositionCalculator(PhysicalRunway physicalRunway) {
        super(physicalRunway);
        constantPositionCalculator = physicalRunway.getConstantPositionCalculator();
        dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();
        constantLengthCalculator = physicalRunway.getConstantLengthCalculator();
    }

    /**
     * Calculates starting positions for Landing Values (LDA) for a given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getLandingObstacleOffset(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);
        if (runway.hasRunwayObstacle()) {
            RunwayObstacle runwayObstacle = runway.getRunwayObstacle();
            if (dynamicLengthCalculator.checkSide(runwayObstacle, side)) {
                //Landing over obstacle
                int temporaryThresholdLength = dynamicLengthCalculator.getSlopeCalculation()
                        + constantLengthCalculator.getStripMargin();
                if (temporaryThresholdLength < constantLengthCalculator.getBlastProtection()) {
                    temporaryThresholdLength = constantLengthCalculator.getBlastProtection();
                }
                switch (side) {
                    case LOWER_THRESHOLD:
                        return constantPositionCalculator.getThresholdPosition(side)
                                + runwayObstacle.getThresholdDistance()
                                + physicalRunway.getObstacle().getLength()
                                + temporaryThresholdLength;
                    case HIGHER_THRESHOLD:
                        return constantPositionCalculator.getThresholdPosition(side)
                                - runwayObstacle.getThresholdDistance()
                                - physicalRunway.getObstacle().getLength()
                                - temporaryThresholdLength;
                    default:
                        return 0;
                }
            } else {
                //Landing towards obstacle
                return constantPositionCalculator.getThresholdPosition(side);
            }
        } else {
            return constantPositionCalculator.getThresholdPosition(side);
        }
    }

    /**
     * Calculates starting positions for Take-Off values (TORA,TODA,ASDA) for a given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getTakeOffObstacleOffset(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);
        if (runway.hasRunwayObstacle()) {
            RunwayObstacle runwayObstacle = runway.getRunwayObstacle();
            if (dynamicLengthCalculator.checkSide(runwayObstacle, side)) {
                //Take-off away from obstacle
                switch (side) {
                    case LOWER_THRESHOLD:
                        return constantPositionCalculator.getThresholdPosition(side)
                                + runwayObstacle.getThresholdDistance()
                                + physicalRunway.getObstacle().getLength()
                                + constantLengthCalculator.getBlastProtection();
                    case HIGHER_THRESHOLD:
                        return constantPositionCalculator.getThresholdPosition(side)
                                - runwayObstacle.getThresholdDistance()
                                - physicalRunway.getObstacle().getLength()
                                - constantLengthCalculator.getBlastProtection();
                    default:
                        return 0;
                }
            } else {
                //Take-off Towards obstacle
                return constantPositionCalculator.getRunwayPosition(side);
            }
        } else {
            return constantPositionCalculator.getRunwayPosition(side);
        }
    }

    /**
     * Calculates the position of the left side of the obstacle if on the lower side, otherwise the right side of the
     * obstacle.
     *
     * @return the position of the obstacle.
     */
    public int getObstaclePosition() {

        RunwaySide obstacleSide = physicalRunway.getObstacleSide();

        switch (obstacleSide) {
            case LOWER_THRESHOLD:
                return constantPositionCalculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD)
                        + physicalRunway.getRunwayObstacle(RunwaySide.LOWER_THRESHOLD).getThresholdDistance();
            case HIGHER_THRESHOLD:
                return constantPositionCalculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD)
                        - physicalRunway.getRunwayObstacle(RunwaySide.HIGHER_THRESHOLD).getThresholdDistance();
            default:
                throw new UnsupportedOperationException("Cannot get obstacle position for side " + obstacleSide);

        }

    }

    public int getResaPosition() {
        return getSlopePosition();
    }

    public int getBlastProtectionPosition() {
        return getSlopePosition();
    }

    /**
     * Calculates the start position of the TOCS slope.
     *
     * @return start position of TOCS slope
     */
    public int getSlopePosition() {
        RunwaySide obstacleSide = physicalRunway.getObstacleSide();

        switch (obstacleSide) {
            case LOWER_THRESHOLD:
                return this.getObstaclePosition() + physicalRunway.getObstacle().getLength();
            case HIGHER_THRESHOLD:
                return this.getObstaclePosition() - physicalRunway.getObstacle().getLength();
            default:
                throw new UnsupportedOperationException("Cannot calculate slope position for side " + obstacleSide);
        }
    }
}
