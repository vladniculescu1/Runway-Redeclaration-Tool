package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Draws both side-on runway thresholds with respective offsets.
 */
public class SideOnThresholdDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {

        ConstantPositionCalculator positionCalculator = physicalRunway.getConstantPositionCalculator();

        double thresholdWidth = DrawConstants.CONSTANT_WIDTH_SIDE_ON * g2d.getFontMetrics().getHeight();
        int lowerThresholdPosition = positionCalculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
        int higherThresholdPosition = positionCalculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD);

        g2d.setColor(Color.white);
        
        BasicStroke oldStroke = (BasicStroke) g2d.getStroke();
        
        g2d.setStroke(new BasicStroke(oldStroke.getLineWidth() * 2));

        // draw the vertical bars marking the threshold starts
        g2d.draw(new Line2D.Double(lowerThresholdPosition, -thresholdWidth / 2,
                lowerThresholdPosition, thresholdWidth / 2));
        g2d.draw(new Line2D.Double(higherThresholdPosition, -thresholdWidth / 2,
                higherThresholdPosition, thresholdWidth / 2));
        

        // reset graphics to standards
        g2d.setColor(Color.black);
        g2d.setStroke(oldStroke);
    }
}
