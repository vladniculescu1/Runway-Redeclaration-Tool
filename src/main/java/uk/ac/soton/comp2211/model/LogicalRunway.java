package uk.ac.soton.comp2211.model;

import java.util.Optional;

public class LogicalRunway {

    private int originalLda;
    private int originalToda;
    private int originalTora;
    private int originalAsda;
    private int heading;
    private ThresholdLocation location;
    private Optional<RunwayObstacle> runwayObstacle;

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

    public ThresholdLocation getLocation() {
        return location;
    }

    public boolean hasRunwayObstacle() {
        return runwayObstacle.isPresent();
    }

    public RunwayObstacle getRunwayObstacle() {
        return runwayObstacle.get();
    }
}
