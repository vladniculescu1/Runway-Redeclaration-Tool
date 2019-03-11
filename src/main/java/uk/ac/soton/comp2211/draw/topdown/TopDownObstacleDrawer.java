package uk.ac.soton.comp2211.draw.topdown;

import java.awt.Color;
import java.awt.Graphics2D;

import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * Draws the obstacle onto the runway.
 *
 */
public class TopDownObstacleDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        if (physicalRunway.hasObstacle()) {
            DynamicPositionCalculator calc = physicalRunway.getDynamicPositionCalculator();

            RunwaySide obstacleSide = physicalRunway.getObstacleSide();
            int leftX = calc.getObstaclePosition();
            int length = physicalRunway.getObstacle().getLength();
            double offsetY = 0;

            if (physicalRunway.getRunwayObstacle(obstacleSide).getCentreLineDistance() != 0) {
                offsetY = 1.5 + (double) physicalRunway.getRunwayObstacle(obstacleSide).getCentreLineDistance() / 30;
            }

            switch (obstacleSide) {
                case LOWER_THRESHOLD: {
                    DrawUtils.uncenteredRectangleWithLabel(g2d, Color.BLUE, leftX, offsetY,
                            length, 3, "OBS");
                    break;
                }

                case HIGHER_THRESHOLD: {
                    DrawUtils.uncenteredRectangleWithLabel(g2d, Color.BLUE, leftX - length, offsetY,
                            length, 3, "OBS");
                    break;
                }

                default:
                    throw new UnsupportedOperationException("Cannot draw obstacle for side " + obstacleSide);
            }

        }
    }
}
