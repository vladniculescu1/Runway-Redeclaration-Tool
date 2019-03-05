package uk.ac.soton.comp2211.draw;

import java.awt.Graphics2D;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

public class DirectionArrowDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        
        RunwaySide side = physicalRunway.getRunwayDirection();
        
        switch (side) {
            case LOWER_THRESHOLD:
                DrawUtils.solidLabelledDistance(g2d, 0, 1300, -10, "Take-off/Landing Direction");
                break;
            case HIGHER_THRESHOLD:
                DrawUtils.solidLabelledDistance(g2d, 1300, -1300, -10, "Take-off/Landing Direction");
                break;
            default:
                throw new UnsupportedOperationException("Cannot draw take-off/landing line");
        }
    }
}
