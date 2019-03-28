package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the TOCS distance if an obstacle is present.
 */
public class TocsDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, Boolean flipText) {

        if (physicalRunway.hasObstacle()) {

            DynamicPositionCalculator positionCalculator = physicalRunway.getDynamicPositionCalculator();
            DynamicLengthCalculator lengthCalculator = physicalRunway.getDynamicLengthCalculator();

            RunwaySide obstacleSide = physicalRunway.getObstacleSide();
            int slopeStart = positionCalculator.getSlopePosition();
            int slope = lengthCalculator.getSlopeCalculation();

            if (obstacleSide == physicalRunway.getRunwayDirection()) {


                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.dashedLabelledDistance(g2d, slopeStart, slope, DrawConstants.LDA_POSITION, "TOCS",
                            0.75F, flipText);
                } else {
                    DrawUtils.dashedLabelledDistance(g2d, slopeStart, -slope, DrawConstants.LDA_POSITION, "TOCS",
                            0.75F, flipText);
                }

            } else {

                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.dashedLabelledDistance(g2d, slopeStart + slope, -slope, DrawConstants.TORA_POSITION,
                            "TOCS", 0.75F, flipText);
                } else {
                    DrawUtils.dashedLabelledDistance(g2d, slopeStart - slope, slope, DrawConstants.TORA_POSITION,
                            "TOCS", 0.75F, flipText);
                }


            }


        }


    }
}
