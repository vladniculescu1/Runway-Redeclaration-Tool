package uk.ac.soton.comp2211.model;

import uk.ac.soton.comp2211.calculator.*;


/**
 * The physical runway which is a basis for the logical runway.
 */
public class PhysicalRunway {

    private LogicalRunway higherThreshold;
    private LogicalRunway lowerThreshold;
    private RunwaySide runwayDirection;
    private RunwayMode runwayMode;

    /**
     * The PhysicalRunway constructor.
     * @param higherThreshold the logical runway with the higher heading
     * @param lowerThreshold the logical runway with the lower heading
     * @param runwayDirection indicates whether landing/takeoff is towards the lower or higher threshold
     * @param runwayMode indicates whether a runway is for landing or take-off
     */
    public PhysicalRunway(LogicalRunway higherThreshold, LogicalRunway lowerThreshold,
                          RunwaySide runwayDirection,RunwayMode runwayMode) {
        this.higherThreshold = higherThreshold;
        this.lowerThreshold = lowerThreshold;
        this.runwayDirection = runwayDirection;
        this.runwayMode = runwayMode;
    }

    public LogicalRunway getHigherThreshold() {
        return higherThreshold;
    }

    public LogicalRunway getLowerThreshold() {
        return lowerThreshold;
    }

    public RunwaySide getRunwayDirection() {
        return runwayDirection;
    }

    public RunwayMode getRunwayMode() {
        return runwayMode;
    }

    public Calculator getCalculator(RunwaySide side) {
        return new Calculator(this, side);
    }

}
