package uk.ac.soton.comp2211.draw;

import java.awt.Color;
import java.awt.Graphics2D;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

public class ObstacleDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        if (runwaySelection.getSelectedRunway().getHigherThreshold().hasRunwayObstacle()) {
            RunwaySide side = runwaySelection.getSelectedRunway().getRunwayDirection();
            Calculator calc = runwaySelection.getSelectedRunway().getCalculator();

            int leftX = calc.getObstaclePosition();
            int length = runwaySelection.getSelectedRunway().getHigherThreshold()
                    .getRunwayObstacle().getObstacle().getLength();
            
            DrawUtils.centeredRectangleWithLabel(g2d, Color.RED, leftX, length, 3, "Obstacle");

        }
    }
}
