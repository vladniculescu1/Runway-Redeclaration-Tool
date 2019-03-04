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
        var lengthCalculator = physicalRunway.getConstantLengthCalculator();
        var positionCalculator = physicalRunway.getConstantPositionCalculator();

        var clearwayLengthLower = lengthCalculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
        var clearwayPositionLower = positionCalculator.getClearwayPosition(RunwaySide.HIGHER_THRESHOLD);

        var clearwayLengthHigher = lengthCalculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
        var clearwayPositionHigher = positionCalculator.getClearwayPosition(RunwaySide.LOWER_THRESHOLD);

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
