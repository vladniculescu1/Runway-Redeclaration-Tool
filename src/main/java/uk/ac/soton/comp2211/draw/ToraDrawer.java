package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the TORA value onto the runway.
 */
public class ToraDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, boolean flipText) {

        RunwaySide side = physicalRunway.getRunwayDirection();
        DynamicLengthCalculator lengthCalculator = physicalRunway.getDynamicLengthCalculator();
        DynamicPositionCalculator positionCalculator = physicalRunway.getDynamicPositionCalculator();

        int startX = positionCalculator.getTakeOffObstacleOffset(side);
        int distance = lengthCalculator.getTora(side);

        switch (side) {
            case LOWER_THRESHOLD:
                DrawUtils.dashedLabelledDistance(g2d, startX, distance, DrawConstants.TORA_POSITION, "TORA", flipText);
                break;
            case HIGHER_THRESHOLD:
                DrawUtils.dashedLabelledDistance(g2d, startX, -distance, DrawConstants.TORA_POSITION, "TORA", flipText);
                break;
            default:
                throw new UnsupportedOperationException("Cannot draw TORA for side " + side);
        }
    }
}
