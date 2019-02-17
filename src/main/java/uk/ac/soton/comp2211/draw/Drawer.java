package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwayDisplay;

import java.awt.*;

public abstract class Drawer {

    protected RunwayDisplay runwayDisplay;

    public abstract void draw(Graphics2D g2d);
}
