package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the LDA value onto the runway.
 */
public class LdaDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        RunwaySide side = runwaySelection.getSelectedRunway().getRunwayDirection();
        Calculator calc = runwaySelection.getSelectedRunway().getCalculator();

        int startX = calc.getLandingObstacleOffest(side);
        int distance = calc.getLda(side);

        switch (side) {
            case LOWER_THRESHOLD:
                DrawUtils.labelledDistance(g2d, startX, distance, DrawConstants.LDA_POSITION, "LDA");
                break;
            case HIGHER_THRESHOLD:
                DrawUtils.labelledDistance(g2d, startX, -distance, DrawConstants.LDA_POSITION, "LDA");
                break;
            default:
                throw new UnsupportedOperationException("Cannot draw LDA for side " + side);
        }
    }
}
