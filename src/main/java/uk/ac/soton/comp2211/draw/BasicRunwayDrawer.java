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
        var runwayPosition = calculator.getMargin(RunwaySide.LOWER_THRESHOLD);

        var stripLength = calculator.getStripLength();
        var stripPosition = calculator.getStripPosition();

        var clearwayLengthHigher = calculator.getClearway(RunwaySide.HIGHER_THRESHOLD);
        var clearwayPositionHigher = calculator.getClearwayPosition(RunwaySide.HIGHER_THRESHOLD);

        var clearwayLengthLower = calculator.getClearway(RunwaySide.LOWER_THRESHOLD);
        var clearwayPositionLower = calculator.getClearwayPosition(RunwaySide.LOWER_THRESHOLD);

        // draw box for runway
        g2d.draw(new Rectangle2D.Double(runwayPosition, - (DrawConstants.RUNWAY_WIDTH / 2), runwayLength,
                DrawConstants.RUNWAY_WIDTH));

        // draw box for strip
        g2d.draw(new Rectangle2D.Double(stripPosition, - (DrawConstants.STRIP_WIDTH / 2), stripLength,
                DrawConstants.STRIP_WIDTH));

        // draw boxes for clearways
        if (clearwayLengthHigher > 0) {
            g2d.draw(new Rectangle2D.Double(clearwayPositionHigher, - (DrawConstants.CLEARWAY_WIDTH / 2),
                    clearwayLengthHigher, DrawConstants.CLEARWAY_WIDTH));
        }
        if (clearwayLengthLower > 0) {
            g2d.draw(new Rectangle2D.Double(clearwayPositionLower, - (DrawConstants.CLEARWAY_WIDTH / 2),
                    clearwayLengthLower, DrawConstants.CLEARWAY_WIDTH));
        }


        // draw centre line
        Stroke dashed = new BasicStroke(1, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{100}, 0);
        g2d.setStroke(dashed);
        g2d.draw(new Line2D.Double(runwayPosition, 0, runwayLength, 0));



    }
}
