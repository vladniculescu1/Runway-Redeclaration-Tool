package uk.ac.soton.comp2211.model;

import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The one obstacle that is on one runway.
 * Can have one obstacle on the runway at any one time.
 */
@XmlRootElement
public class RunwayObstacle {

    @Range(min = -60, max = 500, message = "Threshold must be between -60 and 500 inclusive.")
    @XmlElement
    private int thresholdDistance;

    @Range(min = 0, max = 75, message = "Centreline must be between 0 and 75 inclusive.")
    @XmlElement
    private int centreLineDistance;

    @Valid
    @XmlElement
    private Obstacle obstacle;

    private RunwayObstacle() {
    }

    /**
     * The RunwayObstacle constructor.
     * Combines an obstacle and a runway together by its threshold and centre-line distances
     * @param thresholdDistance the distance of the threshold
     * @param centreLineDistance the distance from the object to the centre line of the runway
     * @param obstacle the obstacle which this runwayObstacle refers to
     */
    public RunwayObstacle(int thresholdDistance, int centreLineDistance, Obstacle obstacle) {
        this.thresholdDistance = thresholdDistance;
        this.centreLineDistance = centreLineDistance;
        this.obstacle = obstacle;
    }

    public int getThresholdDistance() {
        return thresholdDistance;
    }

    public int getCentreLineDistance() {
        return centreLineDistance;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }
}
