package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.*;

public class Calculator {

    private PhysicalRunway physicalRunway;
    private int testRESAValue = 240;
    private int testBlastProtectionValue = 60;
    private  int testStripValue = 60;

    public Calculator(PhysicalRunway physicalRunway) {
        this.physicalRunway = physicalRunway;
    }

    public int getToda(RunwaySide side) {
        switch (side){
            case LOWER_THRESHOLD:
                return getTora(side)+getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return getTora(side)+getClearwayLength(RunwaySide.LOWER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    public int getTora(RunwaySide side) {
        return 3700;
    }

    public int getAsda(RunwaySide side) {
        if(getLogicalRunwayForSide(RunwaySide.HIGHER_THRESHOLD).hasRunwayObstacle() || getLogicalRunwayForSide(RunwaySide.LOWER_THRESHOLD).hasRunwayObstacle()){
            return getTora(side);
        }
        switch (side){
            case LOWER_THRESHOLD:
                return getTora(side)+getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return getTora(side)+getStopwayLength(RunwaySide.LOWER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    public int getLda(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);
        RunwayObstacle runwayObstacle = runway.getRunwayObstacle();
        if(runwayObstacle.getThresholdDistance()<getRunwayLength()/2){
            //Plane landing over obstacle
            int temporaryThresholdLength=(runwayObstacle.getObstacle().getHeight()*50)+testStripValue;
            if(temporaryThresholdLength<testBlastProtectionValue){
                temporaryThresholdLength=testBlastProtectionValue;
            }
            return runway.getOriginalLda()-runwayObstacle.getThresholdDistance()-temporaryThresholdLength;
        }else{
            //Plane landing towards obstacle
            return runwayObstacle.getThresholdDistance()-testRESAValue-testStripValue;
        }
    }

    /**
     * Calculates the length of the stopway on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getStopwayLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalAsda() - logicalRunway.getOriginalTora();
    }

    /**
     * Calculates the position of the stopway on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getStopwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                        - this.getStopwayLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    /**
     * Calculates the length of the clearway on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getClearwayLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalToda() - logicalRunway.getOriginalTora();
    }

    /**
     * Calculates the position of the clearway on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getClearwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                        - this.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    /**
     * Calculates the length of the margin on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getRunwayMarginLength(RunwaySide side) {
        if (this.getClearwayLength(side) > 60) {
            return this.getClearwayLength(side);
        } else {
            return this.getStopwayLength(side) + 60;
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
     * Calculates the starting position of the runway on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
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

    /**
     * Calculates the length of the strip.
     *
     * @return the calculated value
     */
    public int getStripLength() {
        return 60 + this.getStopwayLength(RunwaySide.LOWER_THRESHOLD) + this.getRunwayLength()
                + this.getStopwayLength(RunwaySide.HIGHER_THRESHOLD) + 60;
    }

    /**
     * Calculates the starting position of the strip.
     *
     * @return the calculated value
     */
    public int getStripPosition() {
        return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD) - this.getStopwayLength(RunwaySide.LOWER_THRESHOLD)
                - 60;
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
     * Calculates the position of the displaced threshold on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getThresholdPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                        + this.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD)
                        - this.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    /**
     * Calculates the length of all elements that need to be visualised.
     *
     * @return the calculated value
     */
    public int getTotalVisualisationLength() {
        return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD)
                + this.getRunwayMarginLength(RunwaySide.HIGHER_THRESHOLD);
    }

    /**
     * Calculates the logical runway for a given runway side.
     *
     * @param side the runway side
     * @return the logical runway for the specified runway side
     */
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
