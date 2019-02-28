package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the TODA value onto the runway.
 */
public class TodaDrawer implements Drawer {
    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        RunwaySide side = runwaySelection.getSelectedRunway().getRunwayDirection();
        Calculator calc = runwaySelection.getSelectedRunway().getCalculator();

        int startX = calc.getTakeOffObstacleOffset(side);
        int distance = calc.getToda(side);


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
