package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Draws the runway.
 */
public class RunwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        var calculator = runwaySelection.getSelectedRunway().getCalculator();
        var visualisationLength = calculator.getTotalVisualisationLength();

        var runwayLength = calculator.getRunwayLength();
        var runwayWidth = visualisationLength * (DrawConstants.RUNWAY_WIDTH_PERCENTAGE / 100);
        var runwayPosition = calculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);

        g2d.draw(new Rectangle2D.Double(runwayPosition, - (runwayWidth / 2), runwayLength, runwayWidth));

    }
}
