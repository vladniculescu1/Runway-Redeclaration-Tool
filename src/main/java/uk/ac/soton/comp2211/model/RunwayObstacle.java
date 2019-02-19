package uk.ac.soton.comp2211.model;

/**
 * The one obstacle that is on one runway.
 * Can have one obstacle on the runway at any one time.
 */
public class RunwayObstacle {

    private int thresholdDistance;
    private int centreLineDistance;

    /**
     * The RunwayObstacle constructor.
     * Combines an obstacle and a runway together by its threshold and centre-line distances
     * @param thresholdDistance the distance of the threshold
     * @param centreLineDistance the distance from the object to the centre line of the runway
     */
    public RunwayObstacle(int thresholdDistance, int centreLineDistance) {
        this.thresholdDistance = thresholdDistance;
        this.centreLineDistance = centreLineDistance;
    }

    public int getThresholdDistance() {
        return thresholdDistance;
    }

    public int getCentreLineDistance() {
        return centreLineDistance;
    }
}
