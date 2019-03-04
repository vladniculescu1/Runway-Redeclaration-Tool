package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the clearway of both sides of the runway.
 */
public class ClearwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        var calculator = physicalRunway.getCalculator();

        var clearwayLengthLower = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
        var clearwayPositionLower = calculator.getClearwayPosition(RunwaySide.HIGHER_THRESHOLD);

        var clearwayLengthHigher = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
        var clearwayPositionHigher = calculator.getClearwayPosition(RunwaySide.LOWER_THRESHOLD);

        // draw clearways as labelled rectangles only if they are present
        if (clearwayLengthLower > 0) {
            DrawUtils.centeredRectangleWithLabel(g2d, Color.red, clearwayPositionLower, clearwayLengthLower,
                    DrawConstants.CLEARWAY_WIDTH, "CWY");
        }
        if (clearwayLengthHigher > 0) {
            DrawUtils.centeredRectangleWithLabel(g2d, Color.red, clearwayPositionHigher, clearwayLengthHigher,
                    DrawConstants.CLEARWAY_WIDTH, "CWY");
        }
    }
}
