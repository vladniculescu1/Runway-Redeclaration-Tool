package uk.ac.soton.comp2211.model;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.calculator.ClearwayValueCalculator;
import uk.ac.soton.comp2211.calculator.RunwayProperty;
import uk.ac.soton.comp2211.calculator.StopwayValueCalculator;

public class PhysicalRunway {

    private LogicalRunway higherThreshold;
    private LogicalRunway lowerThreshold;
    private RunwaySide runwayDirection;
    private RunwayMode runwayMode;

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
