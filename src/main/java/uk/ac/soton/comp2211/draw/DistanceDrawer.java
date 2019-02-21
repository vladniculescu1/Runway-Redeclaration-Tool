package uk.ac.soton.comp2211.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class DistanceDrawer implements Drawer {

    public void drawDistance(Graphics2D g2d, int startX, int distance, int height, String text) {
        float dash1[] = {25.0f};
        g2d.setStroke(new BasicStroke(10.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                10.0f,dash1, 0.0f));

        g2d.drawLine(startX, height, startX+distance ,height);

        g2d.setStroke(new BasicStroke(10.0f));
        g2d.drawLine(startX,height+20, startX, height-20);
        g2d.drawLine(startX+distance,height+20, startX+distance, height-20);
        g2d.setFont(new Font("TimesRoman", Font.PLAIN, 100));
        g2d.drawString(text, (startX+startX+distance)/2,height);
        g2d.setFont(new Font("TimesRoman", Font.PLAIN, 75));
        g2d.drawString(String.valueOf(Math.abs(distance))+"m", (startX+startX+distance)/2, height+70);
    }

}
