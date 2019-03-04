package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.PhysicalRunway;

import java.awt.*;

/**
 * Draws the cleared and graded areas around the runway.
 */
public class SurroundingsDrawer implements Drawer {

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {

        var calculator = physicalRunway.getCalculator();

        // set colour for cleared and graded areas
        g2d.setColor(new Color(44, 149, 32, 172));

        // draw the cleared and graded area as a polygon
        Polygon clearedGraded = new Polygon();

        clearedGraded.addPoint(calculator.getStripPosition(),
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(calculator.getStripPosition() + 210,
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(calculator.getStripPosition() + 360,
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_OUTER));

        clearedGraded.addPoint(calculator.getStripPosition() + calculator.getStripLength() - 360,
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_OUTER));

        clearedGraded.addPoint(calculator.getStripPosition() + calculator.getStripLength() - 210,
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(calculator.getStripPosition() + calculator.getStripLength(),
                (int) (g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(calculator.getStripPosition() + calculator.getStripLength(),
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(calculator.getStripPosition() + calculator.getStripLength() - 210,
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(calculator.getStripPosition() + calculator.getStripLength() - 360,
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_OUTER));

        clearedGraded.addPoint(calculator.getStripPosition() + 360,
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_OUTER));

        clearedGraded.addPoint(calculator.getStripPosition() + 210,
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        clearedGraded.addPoint(calculator.getStripPosition(),
                (int) (-g2d.getFontMetrics().getHeight() * DrawConstants.CLEARED_GRADED_POSITION_INNER));

        // draw the polygon
        g2d.fill(clearedGraded);

        // reset colour
        g2d.setColor(Color.black);

    }
}
