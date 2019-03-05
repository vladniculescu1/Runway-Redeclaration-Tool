package uk.ac.soton.comp2211.draw;

import java.awt.Color;
import java.awt.Graphics2D;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;

/**
 * Draws the obstacle onto the runway.
 *
 */
public class ObstacleDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        if (physicalRunway.hasObstacle()) {
            DynamicPositionCalculator calc = physicalRunway.getDynamicPositionCalculator();

            int leftX = calc.getObstaclePosition();
            int length = physicalRunway.getObstacle().getLength();
            double offsetY = 0;
            if (physicalRunway.getRunwayObstacle().getCentreLineDistance() != 0) {
                offsetY = 1.5 + physicalRunway.getRunwayObstacle().getCentreLineDistance() / 30;
            }
            
            DrawUtils.uncenteredRectangleWithLabel(g2d, Color.RED, leftX, offsetY, length, 3, "Obstacle");

        }
    }
}
