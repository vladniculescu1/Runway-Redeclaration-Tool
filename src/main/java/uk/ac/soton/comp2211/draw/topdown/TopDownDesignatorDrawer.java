package uk.ac.soton.comp2211.draw.topdown;

import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 * Draws the threshold designators, i.e. the runway heading and position on each side of the runway.
 */
public class TopDownDesignatorDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, boolean flipText) {

        ConstantPositionCalculator calculator = physicalRunway.getConstantPositionCalculator();

        int lowerThresholdPosition = calculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
        String lowerThresholdLetter = physicalRunway.getLowerThreshold().getLocation().toString();
        String lowerThresholdNumber = physicalRunway.getLowerThreshold().getHeadingAsString();

        int higherThresholdPosition = calculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD);
        String higherThresholdLetter = physicalRunway.getHigherThreshold().getLocation().toString();
        String higherThresholdNumber = physicalRunway.getHigherThreshold().getHeadingAsString();

        AffineTransform originalTransform = g2d.getTransform();

        // change font size for the designators
        Font currentFont = g2d.getFont();
        g2d.setFont(currentFont.deriveFont(currentFont.getSize() * DrawConstants.DESIGNATOR_FONTSIZE));
        int fontHeight = g2d.getFontMetrics().getHeight();

        g2d.setColor(Color.white);

        // rotate 90 degrees clockwise
        g2d.rotate(Math.PI / 2, lowerThresholdPosition, 0);

        // draw the designators for the lower threshold
        g2d.drawString(lowerThresholdLetter, lowerThresholdPosition - fontHeight / 4, (int) (- fontHeight * 1.5));
        g2d.drawString(lowerThresholdNumber, lowerThresholdPosition - fontHeight / 2, (int) (- 2.25 * fontHeight));

        // reset the rotation and rotate 90 degrees anti clockwise
        g2d.setTransform(originalTransform);
        g2d.rotate(- Math.PI / 2, higherThresholdPosition, 0);

        // draw the designators for the higher threshold
        g2d.drawString(higherThresholdLetter, higherThresholdPosition - fontHeight / 4, (int) (- fontHeight * 1.5));
        g2d.drawString(higherThresholdNumber, higherThresholdPosition - fontHeight / 2, (int) (- 2.25 * fontHeight));

        // reset back to defaults
        g2d.setTransform(originalTransform);
        g2d.setFont(currentFont);
        g2d.setColor(Color.black);

    }
}
