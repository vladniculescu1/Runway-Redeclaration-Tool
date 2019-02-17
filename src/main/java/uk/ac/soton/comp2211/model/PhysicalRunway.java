package uk.ac.soton.comp2211.model;

public class PhysicalRunway {

    private LogicalRunway higherThreshold;
    private LogicalRunway lowerThreshold;
    private RunwayDirection runwayDirection;

    public LogicalRunway getHigherThreshold() {
        return higherThreshold;
    }

    public LogicalRunway getLowerThreshold() {
        return lowerThreshold;
    }

    public RunwayDirection getRunwayDirection() {
        return runwayDirection;
    }
}
