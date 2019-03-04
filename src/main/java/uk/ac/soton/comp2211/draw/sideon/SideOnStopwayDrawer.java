package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.draw.shape.ChevronSeries;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the stopways on both sides of the runway.
 */
public class SideOnStopwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        var calculator = physicalRunway.getCalculator();

        var stopwayLengthHigher = calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);
        var stopwayPositionHigher = calculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        var stopwayLengthLower = calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var stopwayPositionLower = calculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

        // draw lower stopway if there is one
        if (stopwayLengthLower > 0) {

            DrawUtils.centeredFilledRectangle(g2d, Color.yellow,stopwayPositionLower,
                    stopwayLengthLower, DrawConstants.CONSTANT_WIDTH_SIDE_ON);

            DrawUtils.centeredRectangleWithLabel(g2d, Color.black, stopwayPositionLower,
                    stopwayLengthLower, DrawConstants.CONSTANT_WIDTH_SIDE_ON, "");
      

        }
        // draw higher stopway if there is one
        if (stopwayLengthHigher > 0) {

            DrawUtils.centeredFilledRectangle(g2d, Color.yellow, stopwayPositionHigher,
                    stopwayLengthHigher, DrawConstants.CONSTANT_WIDTH_SIDE_ON);

            DrawUtils.centeredRectangleWithLabel(g2d, Color.black, stopwayPositionHigher,
                    stopwayLengthHigher, DrawConstants.CONSTANT_WIDTH_SIDE_ON, "");

        }

        // reset color to black
        g2d.setColor(Color.black);

    }

}
