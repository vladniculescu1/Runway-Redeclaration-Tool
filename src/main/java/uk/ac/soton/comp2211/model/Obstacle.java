package uk.ac.soton.comp2211.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

/**
 * How an individual obstacle is defined. Includes the name, height and length of the obstacle.
 */
public class Obstacle {

    @NotBlank(message = "Name must not be blank.")
    private String name;
    
    @Range(min = 1, max = 35, message = "Height must be between 1 and 35 inclusive.")
    private int height;
    
    @Range(min = 1, max = 35, message = "Length must be between 1 and 100 inclusive.")
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
