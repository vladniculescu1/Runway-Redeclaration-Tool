package uk.ac.soton.comp2211.draw.topdown;

import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.draw.shape.ArrowSeries;
import uk.ac.soton.comp2211.draw.shape.Stripes;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Draws both runway thresholds with respective offsets.
 */
public class TopDownThresholdDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        var lengthCalculator = physicalRunway.getConstantLengthCalculator();
        var positionCalculator = physicalRunway.getConstantPositionCalculator();

        var thresholdWidth = DrawConstants.RUNWAY_WIDTH * g2d.getFontMetrics().getHeight();
        var lowerThresholdPosition = positionCalculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
        var higherThresholdPosition = positionCalculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD);

        var lowerRunwayPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);
        var higherRunwayPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);

        var lowerDisplacedThresholdLength = lengthCalculator.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);
        var higherDisplacedThresholdLength = lengthCalculator.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);

        g2d.setColor(Color.white);

        // draw the vertical bars marking the threshold starts
        g2d.draw(new Line2D.Double(lowerThresholdPosition, -thresholdWidth / 2,
                lowerThresholdPosition, thresholdWidth / 2));
        g2d.draw(new Line2D.Double(higherThresholdPosition, -thresholdWidth / 2,
                higherThresholdPosition, thresholdWidth / 2));

        // draw arrows in case the thresholds are displaced
        if (lowerDisplacedThresholdLength > 0) {
            g2d.draw(new ArrowSeries(lowerRunwayPosition, thresholdWidth, lowerDisplacedThresholdLength,
                    RunwaySide.LOWER_THRESHOLD));
        }
        if (higherDisplacedThresholdLength > 0) {
            g2d.draw(new ArrowSeries(higherRunwayPosition - higherDisplacedThresholdLength, thresholdWidth,
                    higherDisplacedThresholdLength, RunwaySide.HIGHER_THRESHOLD));
        }

        // increase the thickness of the stroke by 2 for the threshold stripes
        var oldStroke = (BasicStroke) g2d.getStroke();
        g2d.setStroke(new BasicStroke(oldStroke.getLineWidth() * 2));

        // draw the threshold stripes - the length corresponds to the designator font size
        g2d.draw(new Stripes(thresholdWidth / 1.1,
                g2d.getFontMetrics().getHeight() * DrawConstants.DESIGNATOR_FONTSIZE,
                lowerThresholdPosition + thresholdWidth / 20, 10));
        g2d.draw(new Stripes(thresholdWidth / 1.1,
                - g2d.getFontMetrics().getHeight() * DrawConstants.DESIGNATOR_FONTSIZE,
                higherThresholdPosition - thresholdWidth / 20, 10));

        // reset graphics to standards
        g2d.setColor(Color.black);
        g2d.setStroke(oldStroke);

    }
}
