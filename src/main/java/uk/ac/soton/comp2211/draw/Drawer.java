package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.PhysicalRunway;

import java.awt.*;

/**
 * Represents a drawer which draws some element (such as the runway) on the display panel.
 */
public interface Drawer {

    /**
     * Draw a certain shape on the panel using the supplied graphics object and runway selection.
     *
     * @param g2d the graphics object used for drawing
     * @param physicalRunway the current selected runway
     * @param flipText whether to flip the text
     */
    void draw(Graphics2D g2d, PhysicalRunway physicalRunway, boolean flipText);
}
