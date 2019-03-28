package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the obstacle onto the side-on runway.
 *
 */
public class SideOnObstacleDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, Boolean flipText) {
   
        if (physicalRunway.hasObstacle()) {
            
            DynamicPositionCalculator calc = physicalRunway.getDynamicPositionCalculator();
            
            RunwaySide obstacleSide = physicalRunway.getObstacleSide();
            double height = (double) physicalRunway.getObstacle().getHeight() / 6;
            int leftX = calc.getObstaclePosition();
            int length = physicalRunway.getObstacle().getLength();

            Color obstacleOutline = new Color(136, 53, 227);
            Color obstacleFill = new Color(136, 53, 227, 130);
            
            switch (obstacleSide) {
                case LOWER_THRESHOLD: {
                    DrawUtils.uncenteredRectangleWithLabel(g2d, obstacleOutline, leftX,
                            height / 2.0 + DrawConstants.CONSTANT_WIDTH_SIDE_ON * 0.5,
                            length, height, "OBS",flipText);
                    DrawUtils.uncenteredFilledRectangle(g2d, obstacleFill, leftX,
                            height / 2.0 + DrawConstants.CONSTANT_WIDTH_SIDE_ON * 0.5, length, height);
                    break;
                }
    
                case HIGHER_THRESHOLD: {
                    DrawUtils.uncenteredRectangleWithLabel(g2d, obstacleOutline, leftX - length,
                            height / 2.0 + DrawConstants.CONSTANT_WIDTH_SIDE_ON * 0.5,
                            length, height, "OBS",flipText);
                    DrawUtils.uncenteredFilledRectangle(g2d, obstacleFill, leftX - length,
                            height / 2.0 + DrawConstants.CONSTANT_WIDTH_SIDE_ON * 0.5, length, height);
                    break;
                }
                default:
                    throw new UnsupportedOperationException("Cannot draw obstacle for side " + obstacleSide);
            
            }
        }
    }
}
