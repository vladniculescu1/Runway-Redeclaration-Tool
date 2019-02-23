package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

public class DesignatorDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        var runway = runwaySelection.getSelectedRunway();
        var calculator = runway.getCalculator();

        var lowerThresholdPosition = calculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
        var lowerThresholdLetter = runway.getLowerThreshold().getLocation().getLetter();
        var lowerThresholdNumber = runway.getLowerThreshold().getHeading() + "";

        var originalTransform = g2d.getTransform();

        Font currentFont = g2d.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.5F);
        g2d.setFont(newFont);

        g2d.setColor(Color.white);

        g2d.rotate(Math.PI/2, lowerThresholdPosition + g2d.getFontMetrics().getHeight()/5, 0);
        g2d.drawString(lowerThresholdLetter, lowerThresholdPosition, 0);
        g2d.drawString(lowerThresholdNumber, lowerThresholdPosition, - g2d.getFontMetrics().getHeight());


        g2d.setTransform(originalTransform);

        g2d.setFont(currentFont);
        g2d.setColor(Color.black);

    }
}
