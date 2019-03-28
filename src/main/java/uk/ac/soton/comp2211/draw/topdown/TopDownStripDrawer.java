package uk.ac.soton.comp2211.draw.topdown;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;

import java.awt.*;

/**
 * Draws the strip around the runway.
 */
public class TopDownStripDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, Boolean flipText) {

        ConstantLengthCalculator lengthCalculator = physicalRunway.getConstantLengthCalculator();
        ConstantPositionCalculator positionCalculator = physicalRunway.getConstantPositionCalculator();

        int stripLength = lengthCalculator.getStripLength();
        int stripPosition = positionCalculator.getStripPosition();

        // draw the strip as a filled and labelled rectangle
        DrawUtils.centeredFilledRectangle(g2d, new Color(43, 166, 32, 172),
                stripPosition, stripLength, DrawConstants.STRIP_WIDTH);
        DrawUtils.centeredRectangleWithLabel(g2d, Color.black,
                stripPosition, stripLength, DrawConstants.STRIP_WIDTH, "STRIP", flipText);
    }
}
