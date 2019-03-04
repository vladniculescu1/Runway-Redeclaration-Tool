package uk.ac.soton.comp2211.draw;

import java.awt.Color;
import java.awt.Graphics2D;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.RunwaySelection;

/**
 * Draws the obstacle onto the runway.
 *
 */
public class ObstacleDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        if (runwaySelection.getSelectedRunway().getHigherThreshold().hasRunwayObstacle()) {
            Calculator calc = runwaySelection.getSelectedRunway().getCalculator();

            int leftX = calc.getObstaclePosition();
            int length = runwaySelection.getSelectedRunway().getHigherThreshold()
                    .getRunwayObstacle().getObstacle().getLength();
            double offsetY = 0;
            if (runwaySelection.getSelectedRunway().getHigherThreshold()
                    .getRunwayObstacle().getCentreLineDistance() != 0) {
                offsetY = 1.5 + runwaySelection.getSelectedRunway().getHigherThreshold()
                        .getRunwayObstacle().getCentreLineDistance() / 30;
            }
            
            DrawUtils.uncenteredRectangleWithLabel(g2d, Color.RED, leftX, offsetY, length, 3, "Obstacle");

        }
    }
}
