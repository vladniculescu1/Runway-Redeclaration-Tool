package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;

import java.awt.*;

/**
 * Draws the strip around the runway.
 */
public class StripDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        var calculator = runwaySelection.getSelectedRunway().getCalculator();

        var stripLength = calculator.getStripLength();
        var stripPosition = calculator.getStripPosition();

        // draw the strip as a filled and labelled rectangle
        DrawUtils.centeredFilledRectangle(g2d, new Color(77, 188, 41),
                stripPosition, stripLength, DrawConstants.STRIP_WIDTH);
        DrawUtils.centeredRectangleWithLabel(g2d, Color.black,
                stripPosition, stripLength, DrawConstants.STRIP_WIDTH, "STRIP");
    }
}
