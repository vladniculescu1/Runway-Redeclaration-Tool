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

    public int getStopwayLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalAsda() - logicalRunway.getOriginalTora();
    }

    public int getStopwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD) - this.getStopwayLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }

    }

    public int getClearwayLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalToda() - logicalRunway.getOriginalTora();
    }

    public int getClearwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD) - this.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    public int getRunwayMarginLength(RunwaySide side) {
        if (this.getClearwayLength(side) > 60) {
            return this.getClearwayLength(side);
        } else {
            return this.getStopwayLength(side) + 60;
        }

    }

    public int getRunwayLength() {
        // as the tora is the same for both sides of the runway, the side doesn't matter here
        LogicalRunway logicalRunway = physicalRunway.getLowerThreshold();
        return logicalRunway.getOriginalTora();
    }

    public int getRunwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD) + this.getRunwayLength();
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    public int getStripLength() {
        return 60 + this.getStopwayLength(RunwaySide.LOWER_THRESHOLD) + this.getRunwayLength()
                + this.getStopwayLength(RunwaySide.HIGHER_THRESHOLD) + 60;
    }

    public int getStripPosition() {
        return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD) - this.getStopwayLength(RunwaySide.LOWER_THRESHOLD)
                - 60;
    }

    public int getDisplacedThresholdLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalTora() - logicalRunway.getOriginalLda();
    }

    public int getThresholdPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                        + this.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD)
                        - this.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    public int getTotalVisualisationLength() {
        return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD) + this.getRunwayMarginLength(RunwaySide.HIGHER_THRESHOLD);
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
