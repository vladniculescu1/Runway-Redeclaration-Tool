package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the stopways on both sides of the side-on runway.
 */
public class SideOnStopwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {

        ConstantLengthCalculator lengthCalculator = physicalRunway.getConstantLengthCalculator();
        ConstantPositionCalculator positionCalculator = physicalRunway.getConstantPositionCalculator();

        int stopwayLengthHigher = lengthCalculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);
        int stopwayPositionHigher = positionCalculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        int stopwayLengthLower = lengthCalculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        int stopwayPositionLower = positionCalculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

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
