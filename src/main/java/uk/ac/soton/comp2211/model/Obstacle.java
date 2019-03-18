package uk.ac.soton.comp2211.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Range;

import java.util.Objects;

/**
 * How an individual obstacle is defined. Includes the name, height and length of the obstacle.
 */
@XmlRootElement
public class Obstacle {

    @NotBlank(message = "Name must not be blank.")
    @XmlElement
    private String name;
    
    @Range(min = 1, max = 35, message = "Height must be between 1 and 35 inclusive.")
    @XmlElement
    private int height;
    
    @Range(min = 1, max = 100, message = "Length must be between 1 and 100 inclusive.")
    @XmlElement
    private int length;

    private Obstacle() {
    }

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

    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obstacle obstacle = (Obstacle) o;
        return Objects.equals(getName(), obstacle.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
