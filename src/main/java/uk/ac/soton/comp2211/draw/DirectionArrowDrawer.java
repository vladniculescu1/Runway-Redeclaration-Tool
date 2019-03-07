package uk.ac.soton.comp2211.draw;

import java.awt.Graphics2D;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * Draws the take-off/landing direction arrow for both views.
 */
public class DirectionArrowDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        
        RunwaySide side = physicalRunway.getRunwayDirection();

        var positionCalculator = physicalRunway.getConstantPositionCalculator();
        var startX = positionCalculator.getStripPosition() + 100;
        String text = "Take-off/Landing Direction";
        
        
        //var distance = g2d.getFontMetrics().stringWidth(text);
        
        var distance = (int) DrawConstants.DESIGNATOR_FONTSIZE * 1300;
        
        
        switch (side) {
            case LOWER_THRESHOLD:
                DrawUtils.solidLabelledDistance(g2d, startX, distance, -8, text);
                break;
            case HIGHER_THRESHOLD:
                DrawUtils.solidLabelledDistance(g2d, startX + distance, -distance, -8, text);
                break;
            default:
                throw new UnsupportedOperationException("Cannot draw take-off/landing line");
        }
    }
}
