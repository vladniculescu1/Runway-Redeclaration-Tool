package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.RunwaySelection;

import java.awt.*;
import java.util.List;

/**
 * This class holds the current runway selection and a list of all drawers. In order to draw the current selection
 * on the panel, the method executeDrawers should be called.
 */
public class DrawExecutor {

    private List<Drawer> drawers;
    private RunwaySelection runwaySelection;

    /**
     * Instatiate a new DrawExecutor with the given list of drawers and a runway selection.
     *
     * @param drawers list of drawers used to draw
     * @param runwaySelection current runway selection
     */
    public DrawExecutor(List<Drawer> drawers, RunwaySelection runwaySelection) {
        this.drawers = drawers;
        this.runwaySelection = runwaySelection;
    }

    /**
     * Setup graphics and execute all drawers.
     *
     * @param g2d the graphics2d object used for drawing
     * @param panelWidth the width of the draw display panel
     * @param panelHeight the height of the draw display panel
     */
    public void executeDrawers(Graphics2D g2d, int panelWidth, int panelHeight) {
        this.setupGraphics(g2d, panelWidth, panelHeight);
        if (runwaySelection.hasSelectedRunway()) {
            this.drawers.forEach(drawer -> drawer.draw(g2d, runwaySelection));
        }
    }

    /**
     * Configure the margin, scaling, font size, stroke size and stroke colour.
     *
     * @param g2d the graphics2d object that will be configured
     * @param panelWidth the width of the panel
     * @param panelHeight the height of the panel
     */
    private void setupGraphics(Graphics2D g2d, int panelWidth, int panelHeight) {
        Calculator calculator = runwaySelection.getSelectedRunway().getCalculator();

        var margin = panelWidth * (DrawConstants.DRAW_MARGIN_PERCENTAGE / 100);

        // move the origin down to the extended centreline and add some margin
        g2d.translate(margin, panelHeight / 2);

        // scale the axis according to panel width/height, margin and strip length
        var visualisationLength = calculator.getTotalVisualisationLength();
        var axisScaleFactor = (double) (panelWidth - 2 * margin) / visualisationLength;
        g2d.scale(axisScaleFactor, axisScaleFactor);

        // set font in relation to total visualisation length
        g2d.setFont(g2d.getFont().deriveFont((float) visualisationLength / 40));

        // set draw color to black
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(visualisationLength / 500));
    }
}
