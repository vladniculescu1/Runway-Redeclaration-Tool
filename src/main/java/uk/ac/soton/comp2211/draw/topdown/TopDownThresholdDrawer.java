package uk.ac.soton.comp2211.draw.topdown;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.draw.shape.ArrowSeries;
import uk.ac.soton.comp2211.draw.shape.Stripes;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Draws both runway thresholds with respective offsets.
 */
public class TopDownThresholdDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, boolean flipText) {

        ConstantLengthCalculator lengthCalculator = physicalRunway.getConstantLengthCalculator();
        ConstantPositionCalculator positionCalculator = physicalRunway.getConstantPositionCalculator();

        double thresholdWidth = DrawConstants.RUNWAY_WIDTH * g2d.getFontMetrics().getHeight();
        int lowerThresholdPosition = positionCalculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
        int higherThresholdPosition = positionCalculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD);

        int lowerRunwayPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);
        int higherRunwayPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);

        int lowerDisplacedThresholdLength = lengthCalculator.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);
        int higherDisplacedThresholdLength = lengthCalculator.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);

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
        BasicStroke oldStroke = (BasicStroke) g2d.getStroke();
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
