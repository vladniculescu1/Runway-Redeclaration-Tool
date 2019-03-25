package uk.ac.soton.comp2211.draw.shape;

import java.awt.geom.Path2D;

/**
 * A shape that represents a series of parallel horizontal stripes.
 */
public class Stripes extends Path2D.Double {

    /**
     * Draw a specified number of horizontal stripes of a given length within some total width, at a specified position.
     *
     * @param width the total width (vertical) of all stripes
     * @param length the length of each stripe
     * @param position the starting position (horizontal, i.e. on x axis) of the stripes
     * @param number the total number of the stripes
     */
    public Stripes(double width, double length, double position, int number) {

        double margin = width / number;
        double currentPos = - width / 2 + margin / 2;

        for (int i = 0; i < number; i++) {
            moveTo(position, currentPos);
            lineTo(position + length, currentPos);
            currentPos += margin;
        }

    }
}
