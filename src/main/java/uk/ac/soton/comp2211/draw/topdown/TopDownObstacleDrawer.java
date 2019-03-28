package uk.ac.soton.comp2211.draw.topdown;

import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

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
                offsetY = (DrawConstants.CLEARED_GRADED_POSITION_OUTER
                        * physicalRunway.getRunwayObstacle(obstacleSide).getCentreLineDistance() / 75);
                if (physicalRunway.getRunwayObstacle(obstacleSide).getCentreLineDistance() >= 0) {
                    offsetY += 1.5;
                } else {
                    offsetY -= 1.5;
                }
            }

            Color obstacleOutline = new Color(136, 53, 227);
            Color obstacleFill = new Color(136, 53, 227, 130);

            switch (obstacleSide) {
                case LOWER_THRESHOLD: {
                    DrawUtils.uncenteredRectangleWithLabel(g2d, obstacleOutline, leftX, offsetY,
                            length, 3, "OBS");
                    DrawUtils.uncenteredFilledRectangle(g2d, obstacleFill, leftX, offsetY, length, 3);
                    break;
                }

                case HIGHER_THRESHOLD: {
                    DrawUtils.uncenteredRectangleWithLabel(g2d, obstacleOutline, leftX - length, offsetY,
                            length, 3, "OBS");
                    DrawUtils.uncenteredFilledRectangle(g2d, obstacleFill, leftX - length, offsetY,
                            length, 3);
                    break;
                }

                default:
                    throw new UnsupportedOperationException("Cannot draw obstacle for side " + obstacleSide);
            }

        }
    }
}
