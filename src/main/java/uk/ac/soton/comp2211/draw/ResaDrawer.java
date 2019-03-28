package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the RESA if an obstacle is present.
 */
public class ResaDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, Boolean flipText) {

        if (physicalRunway.hasObstacle()) {

            DynamicPositionCalculator positionCalculator = physicalRunway.getDynamicPositionCalculator();
            ConstantLengthCalculator lengthCalculator = physicalRunway.getConstantLengthCalculator();

            RunwaySide obstacleSide = physicalRunway.getObstacleSide();
            int resaStart = positionCalculator.getResaPosition();
            int resa = lengthCalculator.getResa();

            if (obstacleSide == physicalRunway.getRunwayDirection()) {

                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.dashedLabelledDistance(g2d, resaStart, resa,
                            DrawConstants.TORA_POSITION, "RESA", 0.75F, flipText);
                } else {
                    DrawUtils.dashedLabelledDistance(g2d, resaStart, -resa,
                            DrawConstants.TORA_POSITION, "RESA", 0.75F, flipText);

                }

            } else {

                if (obstacleSide == RunwaySide.LOWER_THRESHOLD) {
                    DrawUtils.dashedLabelledDistance(g2d, resaStart + resa,
                            -resa, DrawConstants.LDA_POSITION, "RESA", 0.75F, flipText);
                } else {
                    DrawUtils.dashedLabelledDistance(g2d, resaStart - resa,
                            resa, DrawConstants.LDA_POSITION, "RESA", 0.75F, flipText);
                }

            }

        }

    }
}
