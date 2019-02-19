package uk.ac.soton.comp2211.model;

import java.util.List;
import java.util.Set;

/**
 * The set of available obstacles available to the user (in storage). No two obstacles can be the same.
 */
public class ObstacleStorage {

    private Set<Obstacle> obstacles;

    public ObstacleStorage(Set<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public Set<Obstacle> getObstacles() {
        return obstacles;
    }
}
