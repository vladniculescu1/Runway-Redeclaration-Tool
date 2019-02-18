package uk.ac.soton.comp2211.model;

/**
 * The physical runway which is a basis for the logical runway.
 */
import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.calculator.ClearwayValueCalculator;
import uk.ac.soton.comp2211.calculator.RunwayProperty;
import uk.ac.soton.comp2211.calculator.StopwayValueCalculator;

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
                          RunwayDirection runwayDirection,RunwayMode runwayMode) {
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

    /**
     * Factory method for creating a new calculator for a given runway property.
     *
     * @param property the runway property that should be calculated.
     * @return the calculator used to calculate the property.
     */
    public Calculator getCalculator(RunwayProperty property) {

        switch (property) {
            case STOPWAY_LOWER_VALUE:
                return new StopwayValueCalculator(this, RunwaySide.LOWER_THRESHOLD);
            case STOPWAY_HIGHER_VALUE:
                return new StopwayValueCalculator(this, RunwaySide.HIGHER_THRESHOLD);
            case CLEARWAY_LOWER_VALUE:
                return new ClearwayValueCalculator(this, RunwaySide.LOWER_THRESHOLD);
            case CLEARWAY_HIGHER_VALUE:
                return new ClearwayValueCalculator(this, RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new IllegalArgumentException("Calculator for property: " + property + " not defined!");
        }
    }
}
