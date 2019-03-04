package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.draw.shape.*;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Draws both runway thresholds with respective offsets.
 */
public class SideOnThresholdDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        var calculator = physicalRunway.getCalculator();

        var thresholdWidth = DrawConstants.CONSTANT_WIDTH_SIDE_ON * g2d.getFontMetrics().getHeight();
        var lowerThresholdPosition = calculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
        var higherThresholdPosition = calculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD);

        var lowerRunwayPosition = calculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);
        var higherRunwayPosition = calculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);

        var lowerDisplacedThresholdLength = calculator.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);
        var higherDisplacedThresholdLength = calculator.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);

        g2d.setColor(Color.white);
        
        var oldStroke = (BasicStroke) g2d.getStroke();
        
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
