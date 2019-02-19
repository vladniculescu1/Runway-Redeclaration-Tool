package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

public class Calculator {

    private PhysicalRunway physicalRunway;

    public Calculator(PhysicalRunway physicalRunway) {
        this.physicalRunway = physicalRunway;
    }

    public int getToda(RunwaySide side) {
        return 0;
    }

    public int getTora(RunwaySide side) {
        return 0;
    }

    public int getAsda(RunwaySide side) {
        return 0;
    }

    public int getLda(RunwaySide side) {
        return 0;
    }

    public int getStopway(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalAsda() - logicalRunway.getOriginalTora();
    }

    public int getClearwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return 0;
            case HIGHER_THRESHOLD:
                return this.getMargin(RunwaySide.LOWER_THRESHOLD) + this.getRunwayLength();
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    public int getStopwayPosition(RunwaySide side) {

        switch (side) {
            case LOWER_THRESHOLD:
                return this.getMargin(RunwaySide.LOWER_THRESHOLD) - this.getStopway(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getMargin(RunwaySide.LOWER_THRESHOLD) + this.getRunwayLength();
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }

    }

    public int getClearway(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalToda() - logicalRunway.getOriginalTora();
    }

    public int getMargin(RunwaySide side) {
        if (this.getClearway(side) > 60) {
            return this.getClearway(side);
        } else {
            return 60;
        }

    }

    public int getRunwayLength() {
        // as the tora is the same for both sides of the runway, the side doesn't matter here
        LogicalRunway logicalRunway = physicalRunway.getLowerThreshold();
        return logicalRunway.getOriginalTora();
    }

    public int getTotalVisualisationLength() {
        return this.getMargin(RunwaySide.LOWER_THRESHOLD) + this.getRunwayLength()
                + this.getMargin(RunwaySide.HIGHER_THRESHOLD);
    }

    private LogicalRunway getLogicalRunwayForSide(RunwaySide side) {
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
