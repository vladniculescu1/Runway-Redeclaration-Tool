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
     * @param side the side for which the property should be calculated.
     * @return the calculator used to calculate the property.
     */
    public Calculator getCalculator(RunwayProperty property, RunwaySide side) {

        LogicalRunway logicalRunway;

        switch (side) {
            case LOWER_THRESHOLD:
                logicalRunway = this.lowerThreshold;
                break;
            case HIGHER_THRESHOLD:
                logicalRunway = this.higherThreshold;
                break;
            default:
                throw new IllegalArgumentException("Calculator for side " + side + " not defined!");
        }

        switch (property) {
            case STOPWAY_VALUE:
                return new StopwayValueCalculator(logicalRunway);
            case CLEARWAY_VALUE:
                return new ClearwayValueCalculator(logicalRunway);
            default:
                throw new IllegalArgumentException("Calculator for property " + property + " not defined!");
        }
    }
}
