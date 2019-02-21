package uk.ac.soton.comp2211.model;

/**
 * How an individual obstacle is defined. Includes the name, height and length of the obstacle.
 */
public class Obstacle{

    private String name;
    private int height;
    private int length;

    /**
     * The Obstacle constructor.
     * @param name the name of the obstacle
     * @param height the height of the obstacles
     * @param length the length of the obstacle
     */
    public Obstacle(String name, int height, int length) {
        this.name = name;
        this.height = height;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
