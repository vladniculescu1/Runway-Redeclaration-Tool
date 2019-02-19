package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the stopways on both sides of the runway.
 */
public class StopwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        var calculator = runwaySelection.getSelectedRunway().getCalculator();
        var visualisationLength = calculator.getTotalVisualisationLength();

        var stopwayLengthLower = calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);
        var stopwayWidth = visualisationLength * (DrawConstants.RUNWAY_WIDTH_PERCENTAGE / 100);
        var stopwayPositionLower = calculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        var stopwayLengthHigher = calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var stopwayPositionHigher = calculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

        g2d.setColor(Color.blue);

        if (stopwayLengthHigher > 0) {
            DrawUtils.centeredRectangleWithLabel(g2d, stopwayPositionHigher, stopwayLengthHigher,
                    stopwayWidth, "SWY");
        }
        if (stopwayLengthLower > 0) {
            DrawUtils.centeredRectangleWithLabel(g2d, stopwayPositionLower, stopwayLengthLower,
                    stopwayWidth, "SWY");
        }

        g2d.setColor(Color.black);

    }
}
