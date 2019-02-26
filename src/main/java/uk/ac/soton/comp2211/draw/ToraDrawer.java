package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.RunwayMode;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the TORA value onto the runway.
 */
public class ToraDrawer extends DistanceDrawer {
    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {

        if (runwaySelection.getSelectedRunway().getRunwayMode() == RunwayMode.LANDING) {
            return;
        }

        int position = 3;
        RunwaySide side = runwaySelection.getSelectedRunway().getRunwayDirection();
        Calculator calc = runwaySelection.getSelectedRunway().getCalculator();

        int startX = calc.getTakeOffObstacleOffset(side);
        int distance = calc.getTora(side);
        double height = - ((calc.getTotalVisualisationLength() * DrawConstants.VALUE_DISPLAY_HEIGHT_FACTOR) * position);

        switch (side) {
            case LOWER_THRESHOLD:
                drawDistance(g2d, startX, distance, (int) height, "TORA");
                break;
            case HIGHER_THRESHOLD:
                drawDistance(g2d, startX, -distance, (int) -height, "TORA");
                break;
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }
}
