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
     * @param width the width of the rectangle as a factor of the current font size
     * @param fill the colour of the filling
     */
    public static void centeredFilledRectangle(Graphics2D g2d, Color fill,
                                                        double positionX, double length, double width) {
        width = g2d.getFontMetrics().getHeight() * width;
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
     * @param width the width of the rectangle as a factor of the current font size
     * @param label the label that will be put above the rectangle
     * @param outline the colour of the outline
     */
    public static void centeredRectangleWithLabel(Graphics2D g2d, Color outline,
                                                  double positionX, double length, double width,
                                                  String label) {
        width = g2d.getFontMetrics().getHeight() * width;
        Rectangle2D rectangle = new Rectangle2D.Double(positionX, - (width / 2), length, width);
        g2d.setColor(outline);
        g2d.draw(rectangle);
        var fontHeight = g2d.getFontMetrics().getHeight();
        g2d.drawString(label, (int) positionX, (int) (- (width / 2) - (fontHeight / 4)));
        g2d.setColor(Color.black);
    }

    /**
     * Draws a rectangle that is vertically centred then offset from the x axis. Adds a label in the top left corner.
     *
     * @param g2d the graphics object used to draw the shape
     * @param positionX the left position on the x axis
     * @param positionY the vertical offset (such that increasing positionY moves the rectangle up)
     * @param length the length of the rectangle
     * @param width the width of the rectangle as a factor of the current font size
     * @param label the label that will be put above the rectangle
     * @param outline the colour of the outline
     */
    public static void uncenteredRectangleWithLabel(Graphics2D g2d, Color outline,
                                                  double positionX, double positionY, double length, double width,
                                                  String label) {
        width = g2d.getFontMetrics().getHeight() * width;
        positionY = g2d.getFontMetrics().getHeight() * positionY;
        Rectangle2D rectangle = new Rectangle2D.Double(positionX, - (width / 2) - positionY, length, width);
        g2d.setColor(outline);
        g2d.draw(rectangle);
        var fontHeight = g2d.getFontMetrics().getHeight();
        g2d.drawString(label, (int) positionX, (int) (- (width / 2) - (fontHeight / 4) - positionY));
        g2d.setColor(Color.black);
    }

    /**
     * Displays a length name and value onto the GUI.
     *
     * @param g2d the graphics2d object used for drawing
     * @param startX the start position of the line/value
     * @param distance the value of the distance (ASDA,TORA,TODA,LDA)
     * @param offset the distance from the centre line as a factor of the current font size
     * @param text the name of the value
     */
    public static void labelledDistance(Graphics2D g2d, int startX, int distance, double offset, String text) {
        Font font = g2d.getFont();
        int fontHeight = g2d.getFontMetrics().getHeight();
        int height = (int) (fontHeight * offset);

        g2d.drawLine(startX, height + fontHeight / 4, startX, height - fontHeight / 4);
        g2d.drawLine(startX + distance, height + fontHeight / 4,
                startX + distance, height - fontHeight / 4);
        g2d.drawString(text, (startX + startX + distance) / 2, (int) (height - fontHeight * 0.2));

        BasicStroke stroke = (BasicStroke) g2d.getStroke();
        g2d.setStroke(new BasicStroke(stroke.getLineWidth(),
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_BEVEL,
                0, new float[]{25}, 0));
        drawArrowLine(g2d,startX,height,startX + distance,height, fontHeight / 2, fontHeight / 4);

        g2d.drawString(String.valueOf(Math.abs(distance)) + "m",
                (startX + startX + distance) / 2,  (int) (height + fontHeight * 0.8));

        g2d.setStroke(stroke);
        g2d.setFont(font);
    }

    /**
     * Draw an arrow line between two points.
     * @param g the graphics component.
     * @param x1 x-position of first point.
     * @param y1 y-position of first point.
     * @param x2 x-position of second point.
     * @param y2 y-position of second point.
     * @param d  the width of the arrow.
     * @param h  the height of the arrow.
     */
    private static void drawArrowLine(Graphics g, int x1, int y1, int x2, int y2, int d, int h) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        double sqrt = Math.sqrt(dx * dx + dy * dy);
        double xm = sqrt - d;
        double xn = xm;
        double ym = h;
        double yn = -h;
        double x;
        double sin = dy / sqrt;
        double cos = dx / sqrt;

        x = xm * cos - ym * sin + x1;
        ym = xm * sin + ym * cos + y1;
        xm = x;

        x = xn * cos - yn * sin + x1;
        yn = xn * sin + yn * cos + y1;
        xn = x;


        int[] xpoints = {x2, (int) xm, (int) xn};
        int[] ypoints = {y2, (int) ym, (int) yn};

        g.drawLine(x1, y1, x2, y2);
        g.fillPolygon(xpoints, ypoints, 3);
    }


}
