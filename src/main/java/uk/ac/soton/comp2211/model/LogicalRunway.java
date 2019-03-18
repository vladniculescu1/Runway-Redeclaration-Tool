package uk.ac.soton.comp2211.model;

import org.hibernate.validator.constraints.Range;
import uk.ac.soton.comp2211.model.validate.GreaterThanOrEqual;
import uk.ac.soton.comp2211.xml.OptionalAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Objects;
import java.util.Optional;

/**
 * The various (number) distances that define the runway.
 * Physical runway can be used in both directions, creating two logical runways.
 */

@GreaterThanOrEqual(message = "ASDA must be greater than or equal to TORA",
        baseField = "originalAsda",
        comparisonField = "originalTora")

@GreaterThanOrEqual(message = "TODA must be greater than or equal to TORA",
        baseField = "originalToda",
        comparisonField = "originalTora")

@GreaterThanOrEqual(message = "TORA must be greater than or equal to LDA",
        baseField = "originalTora",
        comparisonField = "originalLda")
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class LogicalRunway {


    @Range(min = 500, max = 5000, message = "LDA must be between 500 and 5000 inclusive.")
    @XmlElement
    private int originalLda;

    @Range(min = 1000, max = 10000, message = "TODA must be between 1000 and 10000 inclusive.")
    @XmlElement
    private int originalToda;

    @Range(min = 1000, max = 5000, message = "TORA must be between 1000 and 5000 inclusive.")
    @XmlElement
    private int originalTora;

    @Range(min = 1000, max = 10000, message = "ASDA must be between 1000 and 10000 inclusive.")
    @XmlElement
    private int originalAsda;

    @Range(min = 0, max = 35, message = "Heading must be between 0 and 35 inclusive.")
    @XmlElement
    private int heading;

    @XmlElement
    private ThresholdLocation location;

    @XmlElement
    @XmlJavaTypeAdapter(OptionalAdapter.class)
    private Optional<RunwayObstacle> runwayObstacle;

    private LogicalRunway() {
        this.runwayObstacle = Optional.empty();
    }

    /**
     * The LogicalRunway constructor.
     * @param originalLda the original LDA value
     * @param originalToda the original TODA value
     * @param originalTora the original TORA value
     * @param originalAsda the original ASDA value
     * @param heading the angular direction of the runway
     * @param location the relative direction (L or R) of the runway when there are several parallel runways.
     */
    public LogicalRunway(int originalLda, int originalToda, int originalTora, int originalAsda,
                         int heading, ThresholdLocation location) {
        this.originalLda = originalLda;
        this.originalToda = originalToda;
        this.originalTora = originalTora;
        this.originalAsda = originalAsda;
        this.heading = heading;
        this.location = location;
        this.runwayObstacle = Optional.empty();
    }

    public int getOriginalLda() {
        return originalLda;
    }

    public int getOriginalToda() {
        return originalToda;
    }

    public int getOriginalTora() {
        return originalTora;
    }

    public int getOriginalAsda() {
        return originalAsda;
    }

    public int getHeading() {
        return heading;
    }

    public String getHeadingAsString() {
        return heading < 10 ? "0" + heading : "" + heading;
    }

    public ThresholdLocation getLocation() {
        return location;
    }

    public boolean hasRunwayObstacle() {
        return runwayObstacle.isPresent();
    }

    public RunwayObstacle getRunwayObstacle() {
        return runwayObstacle.get();
    }
    
    public void removeRunwayObstacle() {
        runwayObstacle = Optional.empty();
    }

    public void setRunwayObstacle(RunwayObstacle runwayObstacle) {
        this.runwayObstacle = Optional.of(runwayObstacle);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogicalRunway that = (LogicalRunway) o;
        return heading == that.heading
                && getLocation() == that.getLocation();
    }

    @Override
    public int hashCode() {
        return Objects.hash(heading, getLocation());
    }
}
