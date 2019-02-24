package uk.ac.soton.comp2211.draw;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Utility class for commonly used shapes.
 */
public class DrawUtils {


    /**
     * Draws a filled rectangle that is centered around the x axis.
     *
     * @param g2d the graphics object used to draw the shape
     * @param positionX the left position on the x axis
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @param fill the colour of the filling
     */
    public static void centeredFilledRectangle(Graphics2D g2d, Color fill,
                                                        double positionX, double length, double width) {
        Rectangle2D rectangle = new Rectangle2D.Double(positionX, - (width / 2), length, width);
        g2d.setColor(fill);
        g2d.fill(rectangle);
        g2d.setColor(Color.black);
    }

    /**
     * Draws a rectangle that is centered around the x axis. Adds a label in the top left corner.
     *
     * @param g2d the graphics object used to draw the shape
     * @param positionX the left position on the x axis
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @param label the label that will be put above the rectangle
     * @param outline the colour of the outline
     */
    public static void centeredRectangleWithLabel(Graphics2D g2d, Color outline,
                                                  double positionX, double length, double width,
                                                  String label) {
        Rectangle2D rectangle = new Rectangle2D.Double(positionX, - (width / 2), length, width);
        g2d.setColor(outline);
        g2d.draw(rectangle);
        var fontHeight = g2d.getFontMetrics().getHeight();
        g2d.drawString(label, (int) positionX, (int) (- (width / 2) - (fontHeight / 4)));
        g2d.setColor(Color.black);
    }

}
