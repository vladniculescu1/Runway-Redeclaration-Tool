package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the threshold designators, i.e. the runway heading and position on each side of the runway.
 */
public class SideOnDesignatorDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        var calculator = physicalRunway.getCalculator();

        var lowerThresholdPosition = calculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
        var lowerThresholdLetter = physicalRunway.getLowerThreshold().getLocation().toString();
        var lowerThresholdNumber = physicalRunway.getLowerThreshold().getHeadingAsString();

        var higherThresholdPosition = calculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD);
        var higherThresholdLetter = physicalRunway.getHigherThreshold().getLocation().toString();
        var higherThresholdNumber = physicalRunway.getHigherThreshold().getHeadingAsString();

        var originalTransform = g2d.getTransform();

        // get the font size for the designators
        var fontHeight = g2d.getFontMetrics().getHeight();


        // draw the designators for the lower threshold
        g2d.drawString(lowerThresholdNumber, lowerThresholdPosition - fontHeight / 2, (int) (fontHeight * 1.1));
        g2d.drawString(lowerThresholdLetter, lowerThresholdPosition - fontHeight / 4, (int) (fontHeight * 2));

        // draw the designators for the higher threshold
        g2d.drawString(higherThresholdNumber, higherThresholdPosition - fontHeight / 2, (int) (fontHeight * 1.1));
        g2d.drawString(higherThresholdLetter, higherThresholdPosition - fontHeight / 4, (int) (fontHeight * 2));

        // reset back to defaults
        g2d.setTransform(originalTransform);

    }
}
