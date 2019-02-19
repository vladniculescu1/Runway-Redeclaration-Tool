package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySelection;

import java.awt.*;
import java.util.List;

public class DrawExecutor {

    private List<Drawer> drawers;
    private RunwaySelection runwaySelection;

    public DrawExecutor(List<Drawer> drawers, RunwaySelection runwaySelection) {
        this.drawers = drawers;
        this.runwaySelection = runwaySelection;
    }

    public void executeDrawers(Graphics2D g2d, int panelWidth, int panelHeight) {
        var drawMargin = 20;
        this.setupGraphics(g2d, panelWidth, panelHeight, drawMargin);
        this.drawers.forEach(drawer -> drawer.draw(g2d, runwaySelection));
    }

    private void setupGraphics(Graphics2D g2d, int panelWidth, int panelHeight, int margin) {
        // move the origin down to the extended centreline and add some margin
        g2d.translate(margin, panelHeight / 2);

        // scale the axis according to panel width/height, margin and strip length
        var totalVisualisationLength = runwaySelection.getSelectedRunway().getCalculator().getTotalVisualisationLength();
        var axisScaleFactor = (double) (panelWidth - 2 * margin) / totalVisualisationLength;
        g2d.scale(axisScaleFactor, 1);

        // set draw color to black
        g2d.setColor(Color.BLACK);
    }
}
