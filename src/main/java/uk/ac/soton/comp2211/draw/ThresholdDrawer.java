package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Line2D;

public class ThresholdDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        var calculator = runwaySelection.getSelectedRunway().getCalculator();
        var visualisationLength = calculator.getTotalVisualisationLength();

        var thresholdWidth = visualisationLength * (DrawConstants.RUNWAY_WIDTH_PERCENTAGE / 100);
        var lowerThresholdPosition = calculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
        var higherThresholdPosition = calculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD);

        var lowerRunwayPosition = calculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);
        var higherRunwayPosition = calculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);

        var lowerDisplacedThresholdLength = calculator.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);
        var higherDisplacedThresholdLength = calculator.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);

        g2d.setColor(Color.white);

        g2d.draw(new Line2D.Double(lowerThresholdPosition, -thresholdWidth / 2,
                lowerThresholdPosition, thresholdWidth / 2));

        g2d.draw(new Line2D.Double(higherThresholdPosition, -thresholdWidth / 2,
                higherThresholdPosition, thresholdWidth / 2));

        if (lowerDisplacedThresholdLength > 0) {
            g2d.draw(new ArrowSeries(lowerRunwayPosition, thresholdWidth, lowerDisplacedThresholdLength,
                    RunwaySide.LOWER_THRESHOLD));
        }

        if (higherDisplacedThresholdLength > 0) {
            g2d.draw(new ArrowSeries(higherRunwayPosition, thresholdWidth, higherDisplacedThresholdLength,
                    RunwaySide.LOWER_THRESHOLD));
        }

        g2d.setColor(Color.black);

    }
}
