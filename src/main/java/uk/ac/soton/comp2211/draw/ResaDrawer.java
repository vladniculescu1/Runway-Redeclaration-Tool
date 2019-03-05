package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

public class ResaDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {

        if (physicalRunway.hasObstacle()) {

            var positionCalculator = physicalRunway.getDynamicPositionCalculator();
            var lengthCalculator = physicalRunway.getConstantLengthCalculator();

            var obstacleSide = physicalRunway.getObstacleSide();
            var resaStart = positionCalculator.getResaPosition();
            var resa = lengthCalculator.getResa();

            if (obstacleSide == RunwaySide.opposite(physicalRunway.getRunwayDirection())) {

                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.labelledDistance(g2d, resaStart, -resa, DrawConstants.LDA_POSITION, "RESA", 0.75F);
                } else {
                    DrawUtils.labelledDistance(g2d, resaStart - resa, resa, DrawConstants.LDA_POSITION, "RESA", 0.75F);

                }

            } else {

                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.labelledDistance(g2d, resaStart - resa, resa, DrawConstants.TORA_POSITION, "RESA", 0.75F);
                } else {
                    DrawUtils.labelledDistance(g2d, resaStart, -resa, DrawConstants.TORA_POSITION, "RESA", 0.75F);
                }

            }



        }

    }
}
