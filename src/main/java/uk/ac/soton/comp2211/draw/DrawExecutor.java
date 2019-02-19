package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.Calculator;
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
        this.setupGraphics(g2d, panelWidth, panelHeight);
        this.drawers.forEach(drawer -> drawer.draw(g2d, runwaySelection));
    }

    private void setupGraphics(Graphics2D g2d, int panelWidth, int panelHeight) {
        Calculator calculator = runwaySelection.getSelectedRunway().getCalculator();

        // set resposive margin
        double margin;
        if (panelWidth < 600) {
            margin = panelWidth * (DrawConstants.DRAW_MARGIN_PERCENTAGE / 100);
        } else {
            margin = panelWidth * ((DrawConstants.DRAW_MARGIN_PERCENTAGE - 2) / 100);
        }

        // move the origin down to the extended centreline and add some margin
        g2d.translate(margin, panelHeight / 2);

        // scale the axis according to panel width/height, margin and strip length
        var visualisationLength = calculator.getTotalVisualisationLength();
        var axisScaleFactor = (double) (panelWidth - 2 * margin) / visualisationLength;
        g2d.scale(axisScaleFactor, axisScaleFactor);

        // set responsive font size
        if (panelWidth < 600) {
            g2d.setFont(g2d.getFont().deriveFont(150f));
        } else {
            g2d.setFont(g2d.getFont().deriveFont(100f));
        }

        // set draw color to black
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(5));
    }
}
