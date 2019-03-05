package uk.ac.soton.comp2211.draw.sideon;

import java.awt.Color;
import java.awt.Graphics2D;

import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.PhysicalRunway;

/**
 * Draws the obstacle onto the side-on runway.
 *
 */
public class SideOnObstacleDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
   
        if (physicalRunway.getHigherThreshold().hasRunwayObstacle()) {
            DynamicPositionCalculator calc = physicalRunway.getDynamicPositionCalculator();
            
            double height = (double) physicalRunway.getHigherThreshold().getRunwayObstacle()
                    .getObstacle().getHeight() / 6;
            int leftX = calc.getObstaclePosition();
            int length = physicalRunway.getHigherThreshold()
                    .getRunwayObstacle().getObstacle().getLength();
            
          
            DrawUtils.uncenteredRectangleWithLabel(g2d, Color.RED, leftX,  
                    height / 2.0 + DrawConstants.CONSTANT_WIDTH_SIDE_ON * 0.5,
                    length, height, "Obstacle");
        }
    }
}
