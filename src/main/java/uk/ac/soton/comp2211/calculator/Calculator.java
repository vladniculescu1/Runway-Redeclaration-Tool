package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

public class Calculator {
    protected int blastProtectionValue =  300;
    protected int resaValue = 240;
    protected int stripValue = 60;
    protected PhysicalRunway physicalRunway;

    public Calculator(PhysicalRunway physicalRunway) {
        this.physicalRunway = physicalRunway;
    }

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
}