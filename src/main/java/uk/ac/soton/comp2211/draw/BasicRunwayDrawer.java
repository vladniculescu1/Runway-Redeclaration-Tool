package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class BasicRunwayDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        var calculator = runwaySelection.getSelectedRunway().getCalculator();
        var runwayLength = calculator.getRunwayLength();
        var runwayStartPosition = calculator.getMargin(RunwaySide.LOWER_THRESHOLD);

        // draw box for runway
        g2d.draw(new Rectangle2D.Double(runwayStartPosition, - (DrawConstants.RUNWAY_WIDTH / 2), runwayLength,
                DrawConstants.RUNWAY_WIDTH));

        // draw centre line
        Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{100}, 0);
        g2d.setStroke(dashed);
        g2d.draw(new Line2D.Double(runwayStartPosition, 0, runwayLength, 0));
    }
}
