package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

public class SlopeDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {

        if (physicalRunway.hasObstacle()) {

            var positionCalculator = physicalRunway.getDynamicPositionCalculator();
            var lengthCalculator = physicalRunway.getDynamicLengthCalculator();

            var obstacleSide = physicalRunway.getObstacleSide();
            var slopeStart = positionCalculator.getSlopePosition();
            var slope = lengthCalculator.getSlopeCalculation();

            if (obstacleSide == physicalRunway.getRunwayDirection()) {


                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.labelledDistance(g2d, slopeStart, slope, DrawConstants.LDA_POSITION, "TOCS", 0.75F);
                } else {
                    DrawUtils.labelledDistance(g2d, slopeStart, -slope, DrawConstants.LDA_POSITION, "TOCS", 0.75F);
                }

            } else {

                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.labelledDistance(g2d, slopeStart + slope, -slope, DrawConstants.TORA_POSITION, "TOCS", 0.75F);
                } else {
                    DrawUtils.labelledDistance(g2d, slopeStart - slope, slope, DrawConstants.TORA_POSITION, "TOCS", 0.75F);
                }


            }


        }


    }
}
