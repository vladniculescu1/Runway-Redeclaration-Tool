package uk.ac.soton.comp2211.draw;

import java.awt.Color;
import java.awt.Graphics2D;

import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;

/**
 * Draws the obstacle onto the runway.
 *
 */
public class ObstacleDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        if (physicalRunway.getHigherThreshold().hasRunwayObstacle()) {
            DynamicPositionCalculator calc = physicalRunway.getDynamicPositionCalculator();

            int leftX = calc.getObstaclePosition();
            int length = physicalRunway.getHigherThreshold()
                    .getRunwayObstacle().getObstacle().getLength();
            double offsetY = 0;
            if (physicalRunway.getHigherThreshold()
                    .getRunwayObstacle().getCentreLineDistance() != 0) {
                offsetY = 1.5 + physicalRunway.getHigherThreshold()
                        .getRunwayObstacle().getCentreLineDistance() / 30;
            }
            
            DrawUtils.uncenteredRectangleWithLabel(g2d, Color.RED, leftX, offsetY, length, 3, "Obstacle");

        }
    }
}
