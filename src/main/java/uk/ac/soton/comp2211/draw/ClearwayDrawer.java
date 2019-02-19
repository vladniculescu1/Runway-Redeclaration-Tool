package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the clearway of both sides of the runway.
 */
public class ClearwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        var calculator = runwaySelection.getSelectedRunway().getCalculator();
        var visualisationLength = calculator.getTotalVisualisationLength();

        var clearwayLengthHigher = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
        var clearwayPositionHigher = calculator.getClearwayPosition(RunwaySide.HIGHER_THRESHOLD);

        var clearwayLengthLower = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
        var clearwayPositionLower = calculator.getClearwayPosition(RunwaySide.LOWER_THRESHOLD);

        var clearwayWidth = visualisationLength * (DrawConstants.CLEARWAY_WIDTH_PERCENTAGE / 100);

        g2d.setColor(Color.red);

        if (clearwayLengthHigher > 0) {
            DrawUtils.centeredRectangleWithLabel(g2d, clearwayPositionHigher, clearwayLengthHigher,
                    clearwayWidth, "CWY");
        }
        if (clearwayLengthLower > 0) {
            DrawUtils.centeredRectangleWithLabel(g2d, clearwayPositionLower, clearwayLengthLower,
                    clearwayWidth, "CWY");
        }

        g2d.setColor(Color.black);
    }
}
