package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * Calculator Class for all runway lengths that will
 * not change when an object is added.
 */
public class ConstantLengthCalculator extends Calculator {
    private ConstantPositionCalculator constantPositionCalculator;

    /**
     * Constructor for the Constant Length Calculator.
     * @param physicalRunway the physical runway associated with this calculator.
     */
    public ConstantLengthCalculator(PhysicalRunway physicalRunway) {
        super(physicalRunway);
        this.constantPositionCalculator = physicalRunway.getConstantPositionCalculator();
    }

    /**
     * Calculates the length of the stopway on the opposite side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */

    public int getStopwayLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalAsda() - logicalRunway.getOriginalTora();
    }
    /**
     * Calculates the length of the clearway on the opposite side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */

    public int getClearwayLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalToda() - logicalRunway.getOriginalTora();
    }
    /**
     * Calculates the length of the margin on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */

    public int getRunwayMarginLength(RunwaySide side) {
        if (this.getClearwayLength(RunwaySide.opposite(side)) > stripValue) {
            return this.getClearwayLength(RunwaySide.opposite(side));
        } else {
            return this.getStopwayLength(RunwaySide.opposite(side)) + stripValue;
        }

    }
    /**
     * Calculates the length of the runway.
     *
     * @return the calculated value
     */

    public int getRunwayLength() {
        // as the tora is the same for both sides of the runway, the side doesn't matter here
        LogicalRunway logicalRunway = physicalRunway.getLowerThreshold();
        return logicalRunway.getOriginalTora();
    }
    /**
     * Calculates the length of the strip.
     *
     * @return the calculated value
     */

    public int getStripLength() {
        return 60 + this.getStopwayLength(RunwaySide.LOWER_THRESHOLD) + this.getRunwayLength()
                + this.getStopwayLength(RunwaySide.HIGHER_THRESHOLD) + stripValue;
    }
    /**
     * Calculates the length of the displaced threshold on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */

    public int getDisplacedThresholdLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalTora() - logicalRunway.getOriginalLda();
    }
    /**
     * Calculates the length of all elements that need to be visualised.
     *
     * @return the calculated value
     */

    public int getTotalVisualisationLength() {
        return constantPositionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD)
                + this.getRunwayMarginLength(RunwaySide.HIGHER_THRESHOLD);
    }
}
