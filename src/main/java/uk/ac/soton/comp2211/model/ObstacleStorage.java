package uk.ac.soton.comp2211.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The set of available obstacles available to the user (in storage). No two obstacles can be the same.
 */
public class ObstacleStorage {

    private Set<Obstacle> obstacles;

    /**
     * Creates this ObstacleStorage with a set of predefined obstacles.
     */
    public ObstacleStorage() {
        obstacles = new HashSet<Obstacle>();
        obstacles.add(new Obstacle("Airbus A319", 12, 34));
        obstacles.add(new Obstacle("Airbus A320", 12, 40));
        obstacles.add(new Obstacle("Airbus A321", 12, 45));
        obstacles.add(new Obstacle("Airbus A330-200ceo", 18, 59));
        obstacles.add(new Obstacle("Airbus A350-800", 18, 61));
        obstacles.add(new Obstacle("Airbus A380", 25, 73));
        obstacles.add(new Obstacle("Boeing 737-700", 13, 34));
        obstacles.add(new Obstacle("Boeing 757", 14, 48));
        obstacles.add(new Obstacle("Boeing 767-300ER", 16, 55));
        obstacles.add(new Obstacle("Boeing 777 200", 19, 64));
        obstacles.add(new Obstacle("Boeing 787 8", 17, 57));
    }

    public Set<Obstacle> getObstacles() {
        return obstacles;
    }
}
