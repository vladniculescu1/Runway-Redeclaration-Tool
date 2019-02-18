package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;

import java.awt.*;
import java.util.List;

public class DrawExecutor {

    private List<Drawer> drawers;
    private RunwaySelection runwaySelection;

    public void executeDrawers(Graphics2D g2d, int panelWidth, int panelHeight) {
        this.drawers.forEach(drawer -> drawer.draw(g2d, runwaySelection));
    }
}
