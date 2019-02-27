package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the ASDA value onto the runway.
 */
public class AsdaDrawer implements Drawer {
    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        RunwaySide side = runwaySelection.getSelectedRunway().getRunwayDirection();
        Calculator calc = runwaySelection.getSelectedRunway().getCalculator();
        var visualisationLength = calc.getTotalVisualisationLength();
        var runwayWidth = visualisationLength * (DrawConstants.RUNWAY_WIDTH_PERCENTAGE / 100);
        var fontHeight = g2d.getFontMetrics().getHeight();

        int startX = calc.getTakeOffObstacleOffset(side);
        int distance = calc.getAsda(side);
        double height = - 1.1 * (runwayWidth / 2) - 5 * fontHeight;

        switch (side) {
            case LOWER_THRESHOLD:
                DrawUtils.drawDistance(g2d, startX, distance, (int) height,"ASDA");
                break;
            case HIGHER_THRESHOLD:
                DrawUtils.drawDistance(g2d, startX, -distance, (int) -height,"ASDA");
                break;
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }

    }
}
