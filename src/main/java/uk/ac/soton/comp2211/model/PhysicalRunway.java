package uk.ac.soton.comp2211.model;

import uk.ac.soton.comp2211.Observable;
import uk.ac.soton.comp2211.calculator.*;
import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.model.validate.EqualTora;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/**
 * The physical runway which is a basis for the logical runway.
 */
@EqualTora(message = "The TORA of both logical runways must be equal!")
public class PhysicalRunway {

    private LogicalRunway higherThreshold;
    private LogicalRunway lowerThreshold;
    private RunwaySide runwayDirection;
    private ConstantLengthCalculator constantLengthCalculator;
    private ConstantPositionCalculator constantPositionCalculator;
    private DynamicLengthCalculator dynamicLengthCalculator;
    private DynamicPositionCalculator dynamicPositionCalculator;

    /**
     * The PhysicalRunway constructor.
     * @param higherThreshold the logical runway with the higher heading
     * @param lowerThreshold the logical runway with the lower heading
     * @param runwayDirection indicates whether landing/takeoff is towards the lower or higher threshold
     */
    public PhysicalRunway(LogicalRunway higherThreshold, LogicalRunway lowerThreshold,
                          RunwaySide runwayDirection) {
        this.higherThreshold = higherThreshold;
        this.lowerThreshold = lowerThreshold;
        this.runwayDirection = runwayDirection;
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


    @Override
    public String toString() {
        return getLowerThreshold().getHeadingAsString() + getLowerThreshold().getLocation() + "/"
                + getHigherThreshold().getHeadingAsString() + getHigherThreshold().getLocation();
    }

    public void setRunwayDirection(RunwaySide runwayDirection) {
        this.runwayDirection = runwayDirection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhysicalRunway that = (PhysicalRunway) o;
        return Objects.equals(getHigherThreshold(), that.getHigherThreshold())
                && Objects.equals(getLowerThreshold(), that.getLowerThreshold());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHigherThreshold(), getLowerThreshold());
    }

    public ConstantLengthCalculator getConstantLengthCalculator() {
        return constantLengthCalculator;
    }

    public ConstantPositionCalculator getConstantPositionCalculator() {
        return constantPositionCalculator;
    }

    public DynamicLengthCalculator getDynamicLengthCalculator() {
        return dynamicLengthCalculator;
    }

    public DynamicPositionCalculator getDynamicPositionCalculator() {
        return dynamicPositionCalculator;
    }
}
