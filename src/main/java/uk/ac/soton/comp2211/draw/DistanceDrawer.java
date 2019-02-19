package uk.ac.soton.comp2211.draw;

import java.awt.*;

public abstract class DistanceDrawer implements Drawer {

    public void drawDistance(Graphics2D g2d, int startX, int distance, int height, String text) {
        float dash1[] = {10.0f};
        g2d.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                10.0f,dash1, 0.0f));
        g2d.drawLine(startX, height, startX+distance ,height);


    }

}
