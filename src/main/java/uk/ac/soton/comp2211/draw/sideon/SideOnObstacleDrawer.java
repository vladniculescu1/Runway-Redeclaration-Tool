package uk.ac.soton.comp2211.draw.sideon;

import java.awt.Color;
import java.awt.Graphics2D;

import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * Draws the obstacle onto the side-on runway.
 *
 */
public class SideOnObstacleDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
   
        if (physicalRunway.hasObstacle()) {
            
            DynamicPositionCalculator calc = physicalRunway.getDynamicPositionCalculator();
            
            RunwaySide obstacleSide = physicalRunway.getObstacleSide();
            double height = (double) physicalRunway.getObstacle().getHeight() / 6;
            int leftX = calc.getObstaclePosition();
            int length = physicalRunway.getObstacle().getLength();
            
            switch (obstacleSide) {
                case LOWER_THRESHOLD: {
                    DrawUtils.uncenteredRectangleWithLabel(g2d, Color.BLUE, leftX,  
                            height / 2.0 + DrawConstants.CONSTANT_WIDTH_SIDE_ON * 0.5,
                            length, height, "OBS");
                    break;
                }
    
                case HIGHER_THRESHOLD: {
                    DrawUtils.uncenteredRectangleWithLabel(g2d, Color.BLUE, leftX - length,  
                            height / 2.0 + DrawConstants.CONSTANT_WIDTH_SIDE_ON * 0.5,
                            length, height, "OBS");
                    break;
                }
                default:
                    throw new UnsupportedOperationException("Cannot draw obstacle for side " + obstacleSide);
            
            }
        }
    }
}
