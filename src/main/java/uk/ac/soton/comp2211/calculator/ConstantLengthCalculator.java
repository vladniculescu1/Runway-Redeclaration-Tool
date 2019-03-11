package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * Calculator Class for all runway lengths that will
 * not change when an object is added.
 */
public class ConstantLengthCalculator extends Calculator {


    private int blastProtectionValue =  300;
    private int resaValue = 240;
    private int stripValue = 60;

    /**
     * Constructor for the Constant Length Calculator.
     * @param physicalRunway the physical runway associated with this calculator.
     */
    public ConstantLengthCalculator(PhysicalRunway physicalRunway) {
        super(physicalRunway);
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
        if (this.getClearwayLength(RunwaySide.opposite(side)) > this.getStripMargin()) {
            return this.getClearwayLength(RunwaySide.opposite(side));
        } else {
            return this.getStopwayLength(RunwaySide.opposite(side)) + this.getStripMargin();
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
        return this.getStripMargin() + this.getStopwayLength(RunwaySide.LOWER_THRESHOLD) + this.getRunwayLength()
                + this.getStopwayLength(RunwaySide.HIGHER_THRESHOLD) + this.getStripMargin();
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

    public int getResa() {
        return this.resaValue;
    }

    public int getBlastProtection() {
        return this.blastProtectionValue;
    }

    public int getStripMargin() {
        return this.stripValue;
    }


}
