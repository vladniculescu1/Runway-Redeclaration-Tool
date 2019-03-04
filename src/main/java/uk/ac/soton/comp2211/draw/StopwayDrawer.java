package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.draw.shape.ChevronSeries;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the stopways on both sides of the runway.
 */
public class StopwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        var lengthCalculator = physicalRunway.getConstantLengthCalculator();
        var positionCalculator = physicalRunway.getConstantPositionCalculator();

        var stopwayLengthHigher = lengthCalculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);
        var stopwayPositionHigher = positionCalculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        var stopwayLengthLower = lengthCalculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var stopwayPositionLower = positionCalculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

        // draw lower stopway if there is one
        if (stopwayLengthLower > 0) {

            DrawUtils.centeredFilledRectangle(g2d, Color.lightGray,stopwayPositionLower,
                    stopwayLengthLower, DrawConstants.RUNWAY_WIDTH);

            g2d.setColor(Color.yellow);
            g2d.draw(new ChevronSeries(stopwayPositionLower,
                    DrawConstants.RUNWAY_WIDTH * g2d.getFontMetrics().getHeight(),
                    stopwayLengthLower, RunwaySide.LOWER_THRESHOLD));

            DrawUtils.centeredRectangleWithLabel(g2d, Color.yellow, stopwayPositionLower,
                    stopwayLengthLower, DrawConstants.RUNWAY_WIDTH, "SWY");

        }
        // draw higher stopway if there is one
        if (stopwayLengthHigher > 0) {

            DrawUtils.centeredFilledRectangle(g2d, Color.lightGray, stopwayPositionHigher,
                    stopwayLengthHigher, DrawConstants.RUNWAY_WIDTH);

            g2d.setColor(Color.yellow);
            g2d.draw(new ChevronSeries(stopwayPositionHigher,
                    DrawConstants.RUNWAY_WIDTH * g2d.getFontMetrics().getHeight(),
                    stopwayLengthHigher, RunwaySide.HIGHER_THRESHOLD));

            DrawUtils.centeredRectangleWithLabel(g2d, Color.yellow, stopwayPositionHigher,
                    stopwayLengthHigher, DrawConstants.RUNWAY_WIDTH, "SWY");

        }

        // reset color to black
        g2d.setColor(Color.black);

    }

}
