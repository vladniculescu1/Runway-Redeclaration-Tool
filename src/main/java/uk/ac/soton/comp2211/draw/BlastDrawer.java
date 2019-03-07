package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

public class BlastDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {

        if (physicalRunway.hasObstacle()) {

            var positionCalculator = physicalRunway.getDynamicPositionCalculator();
            var lengthCalculator = physicalRunway.getConstantLengthCalculator();

            var obstacleSide = physicalRunway.getObstacleSide();
            var blastStart = positionCalculator.getBlastProtectionPosition();
            var blast = lengthCalculator.getBlastProtection();

            if (obstacleSide == physicalRunway.getRunwayDirection()) {


                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.labelledDistance(g2d, blastStart, blast, DrawConstants.ASDA_POSITION, "BLAST", 0.75F);
                } else {
                    DrawUtils.labelledDistance(g2d, blastStart, -blast, DrawConstants.ASDA_POSITION, "BLAST", 0.75F);
                }

            } else {

                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.labelledDistance(g2d, blastStart + blast, -blast, DrawConstants.ASDA_POSITION, "BLAST", 0.75F);
                } else {
                    DrawUtils.labelledDistance(g2d, blastStart - blast, blast, DrawConstants.ASDA_POSITION, "BLAST", 0.75F);
                }


            }


        }

    }
}
