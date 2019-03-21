package uk.ac.soton.comp2211.draw.topdown;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.ConstantPositionCalculator;
import uk.ac.soton.comp2211.draw.DrawConstants;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;

import java.awt.*;

/**
 * Draws the cleared and graded areas around the runway.
 */
public class TopDownSurroundingsDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {

        ConstantPositionCalculator positionCalculator = physicalRunway.getConstantPositionCalculator();
        ConstantLengthCalculator lengthCalculator = physicalRunway.getConstantLengthCalculator();

        // set colour for cleared and graded areas
        g2d.setColor(new Color(44, 149, 32, 172));

        // draw the cleared and graded area as a polygon
        Polygon clearedGraded = new Polygon();

        clearedGraded.addPoint(positionCalculator.getStripPosition(),
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(positionCalculator.getStripPosition() + 210,
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(positionCalculator.getStripPosition() + 360,
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_OUTER));

        clearedGraded.addPoint(positionCalculator.getStripPosition() + lengthCalculator.getStripLength() - 360,
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_OUTER));

        clearedGraded.addPoint(positionCalculator.getStripPosition() + lengthCalculator.getStripLength() - 210,
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(positionCalculator.getStripPosition() + lengthCalculator.getStripLength(),
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(positionCalculator.getStripPosition() + lengthCalculator.getStripLength(),
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(positionCalculator.getStripPosition() + lengthCalculator.getStripLength() - 210,
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(positionCalculator.getStripPosition() + lengthCalculator.getStripLength() - 360,
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_OUTER));

        clearedGraded.addPoint(positionCalculator.getStripPosition() + 360,
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_OUTER));

        clearedGraded.addPoint(positionCalculator.getStripPosition() + 210,
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(positionCalculator.getStripPosition(),
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        // draw the polygon
        g2d.fill(clearedGraded);

        // reset colour
        g2d.setColor(Color.black);

    }
}
