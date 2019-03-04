package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the clearway of both sides of the runway.
 */
public class SideOnClearwayDrawer implements Drawer {

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
            
            DrawUtils.centeredFilledRectangle(g2d, Color.red, clearwayPositionLower, clearwayLengthLower,
                    DrawConstants.CONSTANT_WIDTH_SIDE_ON);
            
            DrawUtils.centeredRectangleWithLabel(g2d, Color.black, clearwayPositionLower, clearwayLengthLower,
                    DrawConstants.CONSTANT_WIDTH_SIDE_ON, "");
        }
        if (clearwayLengthHigher > 0) {
            
            DrawUtils.centeredFilledRectangle(g2d, Color.red, clearwayPositionHigher, clearwayLengthHigher,
                    DrawConstants.CONSTANT_WIDTH_SIDE_ON);
            
            DrawUtils.centeredRectangleWithLabel(g2d, Color.black, clearwayPositionHigher, clearwayLengthHigher,
                    DrawConstants.CONSTANT_WIDTH_SIDE_ON, "");
        }
    }
}
