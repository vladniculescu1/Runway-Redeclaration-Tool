package uk.ac.soton.comp2211.draw;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 * Utility class for commonly used shapes.
 */
public class DrawUtils {

    /**
     * Method to create a legend for Side On View.
     * @param g2d the graphics object used to draw the legend
     * @param positionX the left position on x axis
     * @param positionY the left position on y axis
     */
    public static void legend(Graphics2D g2d, double positionX, double positionY) {
        int fontHeight = g2d.getFontMetrics().getHeight();
        Color originalColor = g2d.getColor();

        g2d.setColor(Color.WHITE);
        g2d.fillRect((int) positionX, (int) (positionY - (fontHeight * 11.5)), fontHeight * 6, fontHeight * 3);

        g2d.setColor(originalColor);

        g2d.drawString("Clearway", (int) positionX + (fontHeight * 2), (int) (positionY - (fontHeight * 10.5)));
        g2d.drawString("Stopway", (int) positionX + (fontHeight * 2), (int) (positionY - (fontHeight * 9)));

        g2d.setColor(Color.RED);
        g2d.fillRect((int)positionX + (fontHeight / 2),(int) (positionY - (fontHeight * 11.3)), fontHeight, fontHeight);
        g2d.setColor(Color.YELLOW);
        g2d.fillRect((int)positionX + (fontHeight / 2), (int) (positionY - (fontHeight * 9.8)), fontHeight, fontHeight);

        g2d.setColor(originalColor);
    }


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
        DrawUtils.uncenteredFilledRectangle(g2d, fill, positionX, 0, length, width);
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
     * @param rotate boolean indicating whether the text should be rotated
     */
    public static void centeredRectangleWithLabel(Graphics2D g2d, Color outline,
                                                  double positionX, double length, double width,
                                                  String label, Boolean rotate) {
        DrawUtils.uncenteredRectangleWithLabel(g2d, outline, positionX, 0, length, width, label, rotate);
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
     * @param rotate boolean indicating whether the text should be rotated
     */
    public static void uncenteredRectangleWithLabel(Graphics2D g2d, Color outline,
                                                  double positionX, double positionY, double length, double width,
                                                  String label, Boolean rotate) {
        width = g2d.getFontMetrics().getHeight() * width;
        positionY = g2d.getFontMetrics().getHeight() * positionY;
        Rectangle2D rectangle = new Rectangle2D.Double(positionX, - (width / 2) - positionY, length, width);
        Font font = g2d.getFont();
        g2d.setColor(outline);
        g2d.draw(rectangle);

        if (rotate) {
            AffineTransform affineTransform = new AffineTransform();
            affineTransform.rotate(Math.toRadians(180),
                    g2d.getFontMetrics().stringWidth(label) / 2d,
                    -(g2d.getFontMetrics().getHeight() / 2d));
            g2d.setFont(g2d.getFont().deriveFont(affineTransform));
        }

        double fontHeight = g2d.getFontMetrics().getHeight();
        g2d.drawString(label, (int) positionX, (int) (- (width / 2) - (fontHeight / 4) - positionY));
        g2d.setColor(Color.black);
        g2d.setFont(font);
    }

    /**
     * Draws a filled rectangle that is centered then offset from x axis.
     *
     * @param g2d the graphics object used to draw the shape
     * @param positionX the left position on the x axis
     * @param positionY the vertical offset (such that increasing positionY moves the rectangle up)
     * @param length the length of the rectangle
     * @param width the width of the rectangle as a factor of the current font size
     * @param fill the colour of the filling
     */
    public static void uncenteredFilledRectangle(Graphics2D g2d, Color fill,
                                                 double positionX, double positionY, double length, double width) {
        width = g2d.getFontMetrics().getHeight() * width;
        positionY = g2d.getFontMetrics().getHeight() * positionY;
        Rectangle2D rectangle = new Rectangle2D.Double(positionX, - (width / 2) - positionY, length, width);
        g2d.setColor(fill);
        g2d.fill(rectangle);
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
     * @param rotate boolean indicating whether the text should be rotated
     */
    public static void dashedLabelledDistance(Graphics2D g2d, int startX,
                                              int distance, double offset, String text, Boolean rotate) {
        dashedLabelledDistance(g2d, startX, distance, offset, text, 1, rotate);
    }

    /**
     * Displays a length name and value onto the GUI.
     *
     * @param g2d the graphics2d object used for drawing
     * @param startX the start position of the line/value
     * @param distance the value of the distance (ASDA,TORA,TODA,LDA)
     * @param offset the distance from the centre line as a factor of the current font size
     * @param text the name of the value
     * @param fontSizeFactor a factor for the font size
     * @param rotate boolean indicating whether the text should be rotated
     */
    public static void dashedLabelledDistance(Graphics2D g2d, int startX, int distance, double offset,
                                        String text, float fontSizeFactor, boolean rotate) {
        Font font = g2d.getFont();
        int fontHeight = g2d.getFontMetrics().getHeight();
        int height = (int) (fontHeight * offset);

        String distanceString = Math.abs(distance) + "m";

        g2d.drawLine(startX, height + fontHeight / 4, startX, height - fontHeight / 4);
        g2d.drawLine(startX + distance, height + fontHeight / 4,
                startX + distance, height - fontHeight / 4);


        BasicStroke stroke = (BasicStroke) g2d.getStroke();
        g2d.setStroke(new BasicStroke(stroke.getLineWidth(),
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_BEVEL,
                0, new float[]{25}, 0));

        drawArrowLine(g2d,startX,height,startX + distance,height, fontHeight / 2, fontHeight / 4);

        g2d.setFont(font.deriveFont(font.getSize() * fontSizeFactor));

        int textWidth = g2d.getFontMetrics().stringWidth(text);
        int distanceWidth = g2d.getFontMetrics().stringWidth(distanceString);

        if (rotate) {
            AffineTransform affineTransform = new AffineTransform();
            affineTransform.rotate(Math.toRadians(180),
                    distanceWidth / 2d,
                    -(g2d.getFontMetrics().getHeight() / 4d));
            g2d.setFont(g2d.getFont().deriveFont(affineTransform));
        }

        g2d.drawString(text,
                (startX + startX + distance) / 2 - textWidth / 2, (int) (height - fontHeight * 0.2));
        g2d.drawString(distanceString,
                (startX + startX + distance) / 2 - distanceWidth / 2,  (int) (height + fontHeight * 0.8));

        g2d.setStroke(stroke);
        g2d.setFont(font);
    }
    
    /**
     * Displays a length name and value onto the GUI.
     *
     * @param g2d the graphics2d object used for drawing
     * @param startX the start position of the line/value
     * @param distance the value of the distance
     * @param offset the distance from the centre line as a factor of the current font size
     * @param text the name of the value
     * @param rotate boolean indicating whether the text should be rotated
     */
    public static void solidLabelledDistance(Graphics2D g2d, int startX, int distance,
                                             double offset, String text, Boolean rotate) {
        Font font = g2d.getFont();
        int fontHeight = g2d.getFontMetrics().getHeight();
        int height = (int) (fontHeight * offset);



        g2d.drawLine(startX, height + fontHeight / 4, startX, height - fontHeight / 4);
        g2d.drawLine(startX + distance, height + fontHeight / 4,
                startX + distance, height - fontHeight / 4);

        int distanceWidth = g2d.getFontMetrics().stringWidth(text);

        if (rotate) {
            AffineTransform affineTransform = new AffineTransform();
            affineTransform.rotate(Math.toRadians(180),
                    distanceWidth / 2d,
                    -(g2d.getFontMetrics().getHeight() / 4d));
            g2d.setFont(g2d.getFont().deriveFont(affineTransform));
        }

        g2d.drawString(text,
                (startX + startX + distance) / 2 - distanceWidth / 2,  (int) (height - fontHeight * 0.2));



        drawArrowLine(g2d,startX,height,startX + distance,height, fontHeight / 2, fontHeight / 4);

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
