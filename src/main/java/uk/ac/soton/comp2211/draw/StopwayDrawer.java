package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.draw.shape.ChevronSeries;
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

        var stopwayLengthHigher = calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);
        var stopwayWidth = visualisationLength * (DrawConstants.RUNWAY_WIDTH_PERCENTAGE / 100);
        var stopwayPositionHigher = calculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        var stopwayLengthLower = calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var stopwayPositionLower = calculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

        // draw lower stopway if there is one
        if (stopwayLengthLower > 0) {

            DrawUtils.centeredFilledRectangle(g2d, Color.lightGray,stopwayPositionLower,
                    stopwayLengthLower, stopwayWidth);

            g2d.setColor(Color.yellow);
            g2d.draw(new ChevronSeries(stopwayPositionLower, stopwayWidth,
                    stopwayLengthLower, RunwaySide.LOWER_THRESHOLD));

            DrawUtils.centeredRectangleWithLabel(g2d, Color.yellow, stopwayPositionLower,
                    stopwayLengthLower, stopwayWidth, "SWY");

        }
        // draw higher stopway if there is one
        if (stopwayLengthHigher > 0) {

            DrawUtils.centeredFilledRectangle(g2d, Color.lightGray, stopwayPositionHigher,
                    stopwayLengthHigher, stopwayWidth);

            g2d.setColor(Color.yellow);
            g2d.draw(new ChevronSeries(stopwayPositionHigher, stopwayWidth,
                    stopwayLengthHigher, RunwaySide.HIGHER_THRESHOLD));

            DrawUtils.centeredRectangleWithLabel(g2d, Color.yellow, stopwayPositionHigher,
                    stopwayLengthHigher, stopwayWidth, "SWY");

        }

        // reset color to black
        g2d.setColor(Color.black);

    }

}
