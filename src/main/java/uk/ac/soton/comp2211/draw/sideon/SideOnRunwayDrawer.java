package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Draws the side-on runway.
 */
public class SideOnRunwayDrawer implements Drawer {
    

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        var lengthCalculator = physicalRunway.getConstantLengthCalculator();
        var positionCalculator = physicalRunway.getConstantPositionCalculator();

        var runwayLength = lengthCalculator.getRunwayLength();
        var runwayWidth = DrawConstants.CONSTANT_WIDTH_SIDE_ON * g2d.getFontMetrics().getHeight();
        var runwayPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);

        // draw runway as a filled gray rectangle
        g2d.setColor(Color.lightGray);
        Rectangle2D runway = new Rectangle2D.Double(runwayPosition, - (runwayWidth / 2),
                                                    runwayLength, runwayWidth);
        g2d.fill(runway);

        // reset color to black
        g2d.setColor(Color.black);

        // draw the outline of the runway rectangle
        g2d.draw(runway);
    }
}
