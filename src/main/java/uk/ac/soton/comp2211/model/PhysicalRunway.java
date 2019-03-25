package uk.ac.soton.comp2211.model;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.model.validate.EqualTora;
import uk.ac.soton.comp2211.model.validate.HeadingDiff;
import uk.ac.soton.comp2211.model.validate.LdaSumCheck;

import javax.xml.bind.annotation.*;
import java.util.Objects;


/**
 * The physical runway which is a basis for the logical runway.
 */
@EqualTora(message = "The TORA of both logical runways must be equal.")
@HeadingDiff(message = "The headings of the logical runways must have a difference of 18.")
@LdaSumCheck(message = "The LDA of both logical runways must sum to at least 500 more than the TORA.")
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
        this.constantLengthCalculator = new ConstantLengthCalculator(this);
        this.constantPositionCalculator = new ConstantPositionCalculator(this);
        this.dynamicLengthCalculator = new DynamicLengthCalculator(this);
        this.dynamicPositionCalculator = new DynamicPositionCalculator(this);
    }

    /**
     * The PhysicalRunway constructor.
     * @param higherThreshold the logical runway with the higher heading
     * @param lowerThreshold the logical runway with the lower heading
     * @param runwayDirection indicates whether landing/takeoff is towards the lower or higher threshold
     */
    public PhysicalRunway(LogicalRunway higherThreshold, LogicalRunway lowerThreshold,
                          RunwaySide runwayDirection) {
        this();
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

    @XmlElement
    @XmlID
    public String getId() {
        return this.toString();
    }

    @Override
    public String toString() {
        return getLowerThreshold().toString() + "/" + getHigherThreshold().toString();
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
        RunwayObstacle runwayObstacle = this.getRunwayObstacle(RunwaySide.LOWER_THRESHOLD);
        if (dynamicLengthCalculator.checkSide(runwayObstacle, RunwaySide.LOWER_THRESHOLD)) {
            return RunwaySide.LOWER_THRESHOLD;
        } else {
            return RunwaySide.HIGHER_THRESHOLD;
        }
    }
}
