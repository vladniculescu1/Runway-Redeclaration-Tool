package uk.ac.soton.comp2211.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;


public abstract class DistanceDrawer implements Drawer {

    /**
     * Displays a length name and value onto the GUI.
     *
     * @param g2d the graphics2d object used for drawing
     * @param startX the start position of the line/value
     * @param distance the value of the distance (ASDA,TORA,TODA,LDA)
     * @param height the y-cordinate of the line
     * @param text the name of the value
     */
    public void drawDistance(Graphics2D g2d, int startX, int distance, int height, String text) {
        float[] dash1 = new float[1];
        dash1[0] = 25.0f;


        Font font = g2d.getFont();
        g2d.setFont(font.deriveFont((float) font.getSize() * 0.7f));

        g2d.drawLine(startX, height + 20, startX, height - 20);
        g2d.drawLine(startX + distance, height + 20, startX + distance, height - 20);
        g2d.drawString(text, (startX + startX + distance) / 2, height);

        BasicStroke stroke = (BasicStroke) g2d.getStroke();
        g2d.setStroke(new BasicStroke(stroke.getLineWidth(),
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                10.0f, dash1, 0.0f));
        drawArrowLine(g2d,startX,height,startX + distance,height,30,20);

        g2d.drawString(String.valueOf(Math.abs(distance)) + "m", (startX + startX + distance) / 2, height + 70);

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
    private void drawArrowLine(Graphics g, int x1, int y1, int x2, int y2, int d, int h) {
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
