package uk.ac.soton.comp2211.draw.topdown;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.draw.shape.ChevronSeries;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the stopways on both sides of the runway.
 */
public class TopDownStopwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, boolean flipText) {

        ConstantLengthCalculator lengthCalculator = physicalRunway.getConstantLengthCalculator();
        ConstantPositionCalculator positionCalculator = physicalRunway.getConstantPositionCalculator();

        int stopwayLengthHigher = lengthCalculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);
        int stopwayPositionHigher = positionCalculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        int stopwayLengthLower = lengthCalculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        int stopwayPositionLower = positionCalculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

        // draw lower stopway if there is one
        if (stopwayLengthLower > 0) {

            DrawUtils.centeredFilledRectangle(g2d, Color.lightGray,stopwayPositionLower,
                    stopwayLengthLower, DrawConstants.RUNWAY_WIDTH);

            g2d.setColor(Color.yellow);
            g2d.draw(new ChevronSeries(stopwayPositionLower,
                    DrawConstants.RUNWAY_WIDTH * g2d.getFontMetrics().getHeight(),
                    stopwayLengthLower, RunwaySide.LOWER_THRESHOLD));

            DrawUtils.centeredRectangleWithLabel(g2d, Color.yellow, stopwayPositionLower,
                    stopwayLengthLower, DrawConstants.RUNWAY_WIDTH, "SWY", flipText);

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
                    stopwayLengthHigher, DrawConstants.RUNWAY_WIDTH, "SWY", flipText);

        }

        // reset color to black
        g2d.setColor(Color.black);

    }

}
