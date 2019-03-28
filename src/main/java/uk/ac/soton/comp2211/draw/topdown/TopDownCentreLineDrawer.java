package uk.ac.soton.comp2211.draw.topdown;

import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Draws the centre line of the runway as a dashed line.
 */
public class TopDownCentreLineDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, boolean flipText) {

        ConstantPositionCalculator calculator = physicalRunway.getConstantPositionCalculator();

        int lowerThresholdPosition = calculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
        int higherThresholdPosition = calculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD);

        // the start and end positions are different from the threshold positions because the centre line can only
        // start/end after/before the threshold designators
        double startPosition = lowerThresholdPosition
                + 3 * (g2d.getFontMetrics().getHeight() * DrawConstants.DESIGNATOR_FONTSIZE);
        double endPosition = higherThresholdPosition
                - 3 * (g2d.getFontMetrics().getHeight() * DrawConstants.DESIGNATOR_FONTSIZE);

        BasicStroke normal = (BasicStroke) g2d.getStroke();

        // configure the dashed stroke
        Stroke dashed = new BasicStroke(normal.getLineWidth(), BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
                0, new float[]{70}, 0);
        g2d.setStroke(dashed);
        g2d.setColor(Color.white);

        // draw the centre line
        g2d.draw(new Line2D.Double(startPosition, 0, endPosition, 0));

        // reset graphics object back to defaults
        g2d.setColor(Color.black);
        g2d.setStroke(normal);

    }
}
