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
        var visualisationLength = calculator.getTotalVisualisationLength();

        var stripLength = calculator.getStripLength();
        var stripWidth = visualisationLength * (DrawConstants.STRIP_WIDTH_PERCENTAGE / 100);
        var stripPosition = calculator.getStripPosition();

        // draw the strip as a filled and labelled rectangle
        DrawUtils.centeredFilledRectangle(g2d, new Color(77, 188, 41), stripPosition, stripLength, stripWidth);
        DrawUtils.centeredRectangleWithLabel(g2d, Color.black, stripPosition, stripLength, stripWidth, "STRIP");
    }
}
