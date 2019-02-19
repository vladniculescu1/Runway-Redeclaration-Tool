package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;

import java.awt.*;

/**
 * Represents a drawer which draws some element (such as the runway) on the display panel.
 */
public interface Drawer {

    /**
     * Draw a certain shape on the panel using the supplied graphics object and runway selection.
     * @param g2d the graphics object used for drawing
     * @param runwaySelection the current runway selection
     */
    void draw(Graphics2D g2d, RunwaySelection runwaySelection);
}
