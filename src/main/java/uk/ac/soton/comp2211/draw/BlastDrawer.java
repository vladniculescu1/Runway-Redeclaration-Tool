package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the blast protection distance if an obstacle is present.
 */
public class BlastDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, boolean flipText) {

        if (physicalRunway.hasObstacle()) {

            DynamicPositionCalculator positionCalculator = physicalRunway.getDynamicPositionCalculator();
            ConstantLengthCalculator lengthCalculator = physicalRunway.getConstantLengthCalculator();

            RunwaySide obstacleSide = physicalRunway.getObstacleSide();
            int blastStart = positionCalculator.getBlastProtectionPosition();
            int blast = lengthCalculator.getBlastProtection();

            if (obstacleSide == physicalRunway.getRunwayDirection()) {


                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.dashedLabelledDistance(g2d, blastStart, blast, DrawConstants.ASDA_POSITION, "BLAST",
                            0.75F, flipText);
                } else {
                    DrawUtils.dashedLabelledDistance(g2d, blastStart, -blast, DrawConstants.ASDA_POSITION, "BLAST",
                            0.75F, flipText);
                }

            } else {

                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.dashedLabelledDistance(g2d, blastStart + blast, -blast, DrawConstants.ASDA_POSITION,
                            "BLAST", 0.75F, flipText);
                } else {
                    DrawUtils.dashedLabelledDistance(g2d, blastStart - blast, blast, DrawConstants.ASDA_POSITION,
                            "BLAST", 0.75F, flipText);
                }


            }


        }

    }
}
