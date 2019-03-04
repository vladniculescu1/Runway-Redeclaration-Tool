package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;

import java.awt.*;

/**
 * Draws the strip around the runway.
 */
public class StripDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        var lengthCalculator = physicalRunway.getConstantLengthCalculator();
        var positionCalculator = physicalRunway.getConstantPositionCalculator();

        var stripLength = lengthCalculator.getStripLength();
        var stripPosition = positionCalculator.getStripPosition();

        // draw the strip as a filled and labelled rectangle
        DrawUtils.centeredFilledRectangle(g2d, new Color(77, 188, 41),
                stripPosition, stripLength, DrawConstants.STRIP_WIDTH);
        DrawUtils.centeredRectangleWithLabel(g2d, Color.black,
                stripPosition, stripLength, DrawConstants.STRIP_WIDTH, "STRIP");
    }
}
