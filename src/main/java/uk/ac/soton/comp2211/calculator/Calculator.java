package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

public abstract class Calculator {
    protected int blastProtectionValue =  300;
    protected int resaValue = 240;
    protected int stripValue = 60;
    protected PhysicalRunway physicalRunway;

    public Calculator(PhysicalRunway physicalRunway) {
        this.physicalRunway = physicalRunway;
    }

    /**
     * Gets the logical runway for the current side.
     * @param side the side to get the logical runway for
     * @return the logical runway for that side
     */
    protected LogicalRunway getLogicalRunwayForSide(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return physicalRunway.getLowerThreshold();
            case HIGHER_THRESHOLD:
                return physicalRunway.getHigherThreshold();
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    /**
     * Calculates the visualisation length of the application.
     * @return the total visualisation length
     */
    public int getTotalVisualisationLength() {
        return physicalRunway.getConstantPositionCalculator().getRunwayPosition(RunwaySide.HIGHER_THRESHOLD)
                + physicalRunway.getConstantLengthCalculator().getRunwayMarginLength(RunwaySide.HIGHER_THRESHOLD);
    }
}