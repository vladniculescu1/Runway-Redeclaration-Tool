package uk.ac.soton.comp2211.model;

import uk.ac.soton.comp2211.Observable;
import uk.ac.soton.comp2211.calculator.*;
import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.model.validate.EqualTora;
import uk.ac.soton.comp2211.model.validate.HeadingDiff;

import javax.validation.Valid;
import javax.xml.bind.annotation.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/**
 * The physical runway which is a basis for the logical runway.
 */
@EqualTora(message = "The TORA of both logical runways must be equal.")
@HeadingDiff(message = "The headings of the logical runways must have a difference of 18.")
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class PhysicalRunway {

    @XmlElement
    private LogicalRunway higherThreshold;

    @XmlElement
    private LogicalRunway lowerThreshold;

    @XmlElement
    private RunwaySide runwayDirection;

    private ConstantLengthCalculator constantLengthCalculator;
    private ConstantPositionCalculator constantPositionCalculator;
    private DynamicLengthCalculator dynamicLengthCalculator;
    private DynamicPositionCalculator dynamicPositionCalculator;

    private PhysicalRunway() {
    }

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
        this.constantLengthCalculator = new ConstantLengthCalculator(this);
        this.constantPositionCalculator = new ConstantPositionCalculator(this);
        this.dynamicLengthCalculator = new DynamicLengthCalculator(this);
        this.dynamicPositionCalculator = new DynamicPositionCalculator(this);
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

    @XmlElement
    @XmlID
    public String getId() {
        return this.toString();
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

    public boolean hasObstacle() {
        return this.lowerThreshold.hasRunwayObstacle();
    }

    public Obstacle getObstacle() {
        return this.lowerThreshold.getRunwayObstacle().getObstacle();
    }

    /**
     * Returns the runway obstacle for the specified runway side.
     *
     * @param side side of the runway
     * @return the runway obstacle
     */
    public RunwayObstacle getRunwayObstacle(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.lowerThreshold.getRunwayObstacle();
            case HIGHER_THRESHOLD:
                return this.higherThreshold.getRunwayObstacle();
            default:
                throw new IllegalArgumentException("Cannot get obstacle for side " + side);
        }
    }

    /**
     * Checks the side of the runway obstacle.
     *
     * @return the side of the runway obstacle
     */
    public RunwaySide getObstacleSide() {
        var runwayObstacle = this.getRunwayObstacle(RunwaySide.LOWER_THRESHOLD);
        if (dynamicLengthCalculator.checkSide(runwayObstacle, RunwaySide.LOWER_THRESHOLD)) {
            return RunwaySide.LOWER_THRESHOLD;
        } else {
            return RunwaySide.HIGHER_THRESHOLD;
        }
    }
}
