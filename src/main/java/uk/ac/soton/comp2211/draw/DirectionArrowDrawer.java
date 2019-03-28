package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the take-off/landing direction arrow for both views.
 */
public class DirectionArrowDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        
        RunwaySide side = physicalRunway.getRunwayDirection();

        ConstantPositionCalculator positionCalculator = physicalRunway.getConstantPositionCalculator();

        String text = "Take-off/Landing Direction";
              
        int distance = (int) (1.1 * g2d.getFontMetrics().stringWidth(text));
        int startX = positionCalculator.getStripPosition() + 4 * distance / 10;
                
        switch (side) {
            case LOWER_THRESHOLD:
                DrawUtils.solidLabelledDistance(g2d, startX, distance, -10.5, text);
                break;
            case HIGHER_THRESHOLD:
                DrawUtils.solidLabelledDistance(g2d, startX + distance, -distance, -10.5, text);
                break;
            default:
                throw new UnsupportedOperationException("Cannot draw take-off/landing line");
        }
    }
}
