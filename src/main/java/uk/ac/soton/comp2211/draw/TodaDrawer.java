package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the TODA value onto the runway.
 */
public class TodaDrawer implements Drawer {
    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        RunwaySide side = physicalRunway.getRunwayDirection();
        DynamicLengthCalculator lengthCalculator = physicalRunway.getDynamicLengthCalculator();
        DynamicPositionCalculator positionCalculator = physicalRunway.getDynamicPositionCalculator();

        int startX = positionCalculator.getTakeOffObstacleOffset(side);
        int distance = lengthCalculator.getToda(side);


        switch (side) {
            case LOWER_THRESHOLD:
                DrawUtils.labelledDistance(g2d, startX, distance, DrawConstants.TODA_POSITION, "TODA");
                break;
            case HIGHER_THRESHOLD:
                DrawUtils.labelledDistance(g2d, startX, -distance, DrawConstants.TODA_POSITION, "TODA");
                break;
            default:
                throw new UnsupportedOperationException("Cannot draw TODA for side " + side);
        }

    }
}
