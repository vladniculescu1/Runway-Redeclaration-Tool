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

    /**
     * Constructor for the Dynamic Position Calculator.
     * @param physicalRunway the physical runway associated with this calculator.
     */
    public DynamicPositionCalculator(PhysicalRunway physicalRunway) {
        super(physicalRunway);
        constantPositionCalculator = physicalRunway.getConstantPositionCalculator();
        dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();
    }

    /**
     * Calculates starting positions for Landing Values (LDA) for a given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getLandingObstacleOffest(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);
        if (runway.hasRunwayObstacle()) {
            RunwayObstacle runwayObstacle = runway.getRunwayObstacle();
            if (dynamicLengthCalculator.checkSide(runwayObstacle, side)) {
                //Landing over obstacle
                int temporaryThresholdLength = dynamicLengthCalculator.getSlopeCalculation(runwayObstacle) + stripValue;
                if (temporaryThresholdLength < blastProtectionValue) {
                    temporaryThresholdLength = blastProtectionValue;
                }
                switch (side) {
                    case LOWER_THRESHOLD:
                        return constantPositionCalculator.getThresholdPosition(side)
                                + runwayObstacle.getThresholdDistance()
                                + temporaryThresholdLength;
                    case HIGHER_THRESHOLD:
                        return constantPositionCalculator.getThresholdPosition(side)
                                - runwayObstacle.getThresholdDistance()
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
                                + blastProtectionValue;
                    case HIGHER_THRESHOLD:
                        return constantPositionCalculator.getThresholdPosition(side)
                                - runwayObstacle.getThresholdDistance()
                                - blastProtectionValue;
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
     * Calculates the position of the left side of the obstacle.
     *
     * @return the position of the left side of the obstacle.
     */

    public int getObstaclePosition() {
        return physicalRunway.getLowerThreshold().getRunwayObstacle().getThresholdDistance()
                + constantPositionCalculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
    }
}
