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

        DrawUtils.centeredRectangleWithLabel(g2d, stripPosition, stripLength, stripWidth, "STRIP");
    }
}
