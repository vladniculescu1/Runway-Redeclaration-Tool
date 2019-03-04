package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Draws the runway.
 */
public class RunwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        var calculator = physicalRunway.getCalculator();
        var visualisationLength = calculator.getTotalVisualisationLength();

        var runwayLength = calculator.getRunwayLength();
        var runwayWidth = DrawConstants.RUNWAY_WIDTH * g2d.getFontMetrics().getHeight();
        var runwayPosition = calculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);

        // draw runway as a filled gray rectangle
        g2d.setColor(Color.lightGray);
        Rectangle2D runway = new Rectangle2D.Double(runwayPosition, - (runwayWidth / 2), runwayLength, runwayWidth);
        g2d.fill(runway);

        // reset color to black
        g2d.setColor(Color.black);

        // draw the outline of the runway rectangle
        g2d.draw(runway);
    }
}
