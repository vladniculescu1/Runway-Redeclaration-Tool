package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Draws the centre line of the runway as a dashed line.
 */
public class CentreLineDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        var calculator = runwaySelection.getSelectedRunway().getCalculator();

        var runwayLength = calculator.getRunwayLength();
        var runwayPosition = calculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);

        Stroke normal = g2d.getStroke();

        Stroke dashed = new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
                0, new float[]{100}, 0);
        g2d.setStroke(dashed);
        g2d.draw(new Line2D.Double(runwayPosition, 0, runwayPosition + runwayLength, 0));

        g2d.setStroke(normal);

    }
}
