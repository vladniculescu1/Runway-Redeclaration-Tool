package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import javax.swing.text.StyledEditorKit;
import java.awt.*;

/**
 * Draws the clearway of both sides of the side-on runway.
 */
public class SideOnClearwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, boolean flipText) {

        ConstantLengthCalculator lengthCalculator = physicalRunway.getConstantLengthCalculator();
        ConstantPositionCalculator positionCalculator = physicalRunway.getConstantPositionCalculator();

        int clearwayLengthLower = lengthCalculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
        int clearwayPositionLower = positionCalculator.getClearwayPosition(RunwaySide.HIGHER_THRESHOLD);

        int clearwayLengthHigher = lengthCalculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
        int clearwayPositionHigher = positionCalculator.getClearwayPosition(RunwaySide.LOWER_THRESHOLD);

        // draw clearways as rectangles only if they are present
        if (clearwayLengthLower > 0) {
            
            DrawUtils.centeredFilledRectangle(g2d, Color.red, clearwayPositionLower, clearwayLengthLower,
                    DrawConstants.CONSTANT_WIDTH_SIDE_ON);
            
            DrawUtils.centeredRectangleWithLabel(g2d, Color.black, clearwayPositionLower, clearwayLengthLower,
                    DrawConstants.CONSTANT_WIDTH_SIDE_ON, "",flipText);
        }
        if (clearwayLengthHigher > 0) {
            
            DrawUtils.centeredFilledRectangle(g2d, Color.red, clearwayPositionHigher, clearwayLengthHigher,
                    DrawConstants.CONSTANT_WIDTH_SIDE_ON);
            
            DrawUtils.centeredRectangleWithLabel(g2d, Color.black, clearwayPositionHigher, clearwayLengthHigher,
                    DrawConstants.CONSTANT_WIDTH_SIDE_ON, "",flipText);
        }
    }
}
