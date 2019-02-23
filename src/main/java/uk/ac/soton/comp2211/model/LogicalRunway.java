package uk.ac.soton.comp2211.model;

import org.checkerframework.checker.nullness.Opt;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * The various (number) distances that define the runway.
 * Physical runway can be used in both directions, creating two logical runways.
 */
public class LogicalRunway {

    private int originalLda;
    private int originalToda;
    private int originalTora;
    private int originalAsda;
    private int heading;
    private ThresholdLocation location;
    private Optional<RunwayObstacle> runwayObstacle;

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
        Obstacle obstacle = new Obstacle("Scenario 3",15,0);
        if(heading==9){
            RunwayObstacle runwayObstacle = new RunwayObstacle(150,60,obstacle);
            this.runwayObstacle=Optional.of(runwayObstacle);
        }else{
            RunwayObstacle runwayObstacle = new RunwayObstacle(3203, 60, obstacle);
            this.runwayObstacle= Optional.of(runwayObstacle);
        }
       // this.runwayObstacle = Optional.empty();
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
