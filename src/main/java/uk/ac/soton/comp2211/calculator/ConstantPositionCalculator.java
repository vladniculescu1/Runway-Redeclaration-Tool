package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * Calculator Class for all runway positions that will
 * not change when an object is added.
 */
public class ConstantPositionCalculator extends Calculator {

    private ConstantLengthCalculator constantLengthCalculator;

    /**
     * Constructor for the Constant Position Calculator.
     * @param physicalRunway the physical runway associated with this calculator.
     */
    public ConstantPositionCalculator(PhysicalRunway physicalRunway) {
        super(physicalRunway);
        this.constantLengthCalculator = physicalRunway.getConstantLengthCalculator();
    }

    /**
     * Calculates the position of the stopway on the opposite side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getStopwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                        - constantLengthCalculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    /**
     * Calculates the position of the clearway on the opposite side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getClearwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                        - constantLengthCalculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }
    /**
     * Calculates the starting position of the runway on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */

    public int getRunwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return constantLengthCalculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return constantLengthCalculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD)
                        + constantLengthCalculator.getRunwayLength();
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    /**
     * Calculates the starting position of the strip.
     *
     * @return the calculated value
     */

    public int getStripPosition() {
        return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                - constantLengthCalculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD)
                - constantLengthCalculator.getStripMargin();
    }
    /**
     * Calculates the position of the displaced threshold on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */

    public int getThresholdPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                        + constantLengthCalculator.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD)
                        - constantLengthCalculator.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }
}
