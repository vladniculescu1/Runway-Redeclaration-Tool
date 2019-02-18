package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;

import java.awt.*;

public interface Drawer {
    void draw(Graphics2D g2d, RunwaySelection runwaySelection);
}
