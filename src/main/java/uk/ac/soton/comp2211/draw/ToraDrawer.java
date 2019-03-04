package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the TORA value onto the runway.
 */
public class ToraDrawer implements Drawer {
    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        RunwaySide side = physicalRunway.getRunwayDirection();
        Calculator calc = physicalRunway.getCalculator();

        int startX = calc.getTakeOffObstacleOffset(side);
        int distance = calc.getTora(side);

        switch (side) {
            case LOWER_THRESHOLD:
                DrawUtils.labelledDistance(g2d, startX, distance, DrawConstants.TORA_POSITION, "TORA");
                break;
            case HIGHER_THRESHOLD:
                DrawUtils.labelledDistance(g2d, startX, -distance, DrawConstants.TORA_POSITION, "TORA");
                break;
            default:
                throw new UnsupportedOperationException("Cannot draw TORA for side " + side);
        }
    }
}
