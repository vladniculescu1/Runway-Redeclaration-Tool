package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the ASL value onto the side-on runway.
 */
public class SideOnSlopeDrawer implements Drawer {
    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        
        if (physicalRunway.hasObstacle()) {
            
            RunwaySide side = physicalRunway.getRunwayDirection();
            DynamicLengthCalculator lengthCalculator = physicalRunway.getDynamicLengthCalculator();
            DynamicPositionCalculator positionCalculator = physicalRunway.getDynamicPositionCalculator();
    
            
            
            int startX = positionCalculator.getTakeOffObstacleOffset(side);
            int distance = lengthCalculator.getTora(side);
    
            switch (side) {
                case LOWER_THRESHOLD:
                    // DrawUtils.angledDashedLabelledDistance(g2d, positionCalculator.getObstaclePosition(),
                    // physicalRunway.getObstacle().getHeight(), lengthCalculator.getSlopeCalculation(), 0, "00");
                    g2d.drawLine(positionCalculator.getObstaclePosition(), 0, 2000, 0);
                    break;
                case HIGHER_THRESHOLD:
                    DrawUtils.angledDashedLabelledDistance(g2d, positionCalculator.getObstaclePosition(),
                            physicalRunway.getObstacle().getHeight(), lengthCalculator.getSlopeCalculation(), 0, "000");
                    break;
                default:
                    throw new UnsupportedOperationException("Cannot draw ASL for side " + side);
            }
        }
    }
}
