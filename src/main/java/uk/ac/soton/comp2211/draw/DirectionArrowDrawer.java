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

        String text = "Take-off/Landing Direction";

        int totalLength = physicalRunway.getConstantLengthCalculator().getTotalVisualisationLength();
        int textLength = (int) (1.1 * g2d.getFontMetrics().stringWidth(text));

        int startX = totalLength/2 - textLength/2;
                
        switch (side) {
            case LOWER_THRESHOLD:
                DrawUtils.solidLabelledDistance(g2d, startX, textLength, -10.5, text);
                break;
            case HIGHER_THRESHOLD:
                DrawUtils.solidLabelledDistance(g2d, startX + textLength, -textLength, -10.5, text);
                break;
            default:
                throw new UnsupportedOperationException("Cannot draw take-off/landing line");
        }
    }
}
