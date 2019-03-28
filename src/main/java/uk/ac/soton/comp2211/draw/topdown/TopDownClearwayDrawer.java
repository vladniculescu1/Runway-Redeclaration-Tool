package uk.ac.soton.comp2211.draw.topdown;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the clearway of both sides of the runway.
 */
public class TopDownClearwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, Boolean flipText) {

        ConstantLengthCalculator lengthCalculator = physicalRunway.getConstantLengthCalculator();
        ConstantPositionCalculator positionCalculator = physicalRunway.getConstantPositionCalculator();

        int clearwayLengthLower = lengthCalculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
        int clearwayPositionLower = positionCalculator.getClearwayPosition(RunwaySide.HIGHER_THRESHOLD);

        int clearwayLengthHigher = lengthCalculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
        int clearwayPositionHigher = positionCalculator.getClearwayPosition(RunwaySide.LOWER_THRESHOLD);

        // draw clearways as labelled rectangles only if they are present
        if (clearwayLengthLower > 0) {
            DrawUtils.centeredRectangleWithLabel(g2d, Color.red, clearwayPositionLower, clearwayLengthLower,
                    DrawConstants.CLEARWAY_WIDTH, "CWY",flipText);
        }
        if (clearwayLengthHigher > 0) {
            DrawUtils.centeredRectangleWithLabel(g2d, Color.red, clearwayPositionHigher, clearwayLengthHigher,
                    DrawConstants.CLEARWAY_WIDTH, "CWY",flipText);
        }
    }
}
