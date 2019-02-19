package uk.ac.soton.comp2211.draw;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Utility class for commonly used shapes.
 */
public class DrawUtils {

    /**
     * Draws a rectangle that is centered around the x axis. Adds a label in the top left corner.
     *
     * @param g2d the graphics object used to draw the shape
     * @param positionX the left position on the x axis
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @param label the label that will be put above the rectangle
     */
    public static void centeredRectangleWithLabel(Graphics2D g2d, double positionX, double length,double width,
                                                  String label) {
        g2d.draw(new Rectangle2D.Double(positionX, - (width / 2),
                length, width));
        g2d.drawString(label, (int) positionX, - (int) (width / 2) - 30);
    }

}
