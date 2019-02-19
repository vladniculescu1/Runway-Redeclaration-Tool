package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

public class Calculator {

    private PhysicalRunway physicalRunway;
    private RunwaySide side;

    public Calculator(PhysicalRunway physicalRunway, RunwaySide side) {
        this.physicalRunway = physicalRunway;
        this.side = side;
    }

    public int getToda() {
        return 0;
    }

    public int getTora() {
        return 0;
    }

    public int getAsda() {
        return 0;
    }

    public int getLda() {
        return 0;
    }

    public int getStopway() {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalAsda() - logicalRunway.getOriginalToda();
    }

    public int getClearway() {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalToda() - logicalRunway.getOriginalTora();
    }

    public int getMargin() {
        return 0;
    }

    public int getClearwayPosition() {
        return 0;
    }

    public int getStopwayPosition() {
        return 0;
    }

    private LogicalRunway getLogicalRunwayForSide(RunwaySide side) {
        switch(side) {
            case LOWER_THRESHOLD:
                return physicalRunway.getLowerThreshold();
            case HIGHER_THRESHOLD:
                return physicalRunway.getHigherThreshold();
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }

    }


}
