package uk.ac.soton.comp2211.draw.topdown;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Draws the runway.
 */
public class TopDownRunwayDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, Boolean flipText) {

        ConstantLengthCalculator lengthCalculator = physicalRunway.getConstantLengthCalculator();
        ConstantPositionCalculator positionCalculator = physicalRunway.getConstantPositionCalculator();

        int runwayLength = lengthCalculator.getRunwayLength();
        double runwayWidth = DrawConstants.RUNWAY_WIDTH * g2d.getFontMetrics().getHeight();
        int runwayPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);

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
