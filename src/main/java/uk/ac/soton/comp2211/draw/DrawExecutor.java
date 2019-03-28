package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.model.RunwaySelection;

import java.awt.*;
import java.util.List;

/**
 * This class holds the current runway selection and a list of all drawers. In order to draw the current selection
 * on the panel, the method executeDrawers should be called.
 */
public class DrawExecutor {

    private List<Drawer> drawers;
    private List<Drawer> distanceDrawers;
    private RunwaySelection runwaySelection;

    /**
     * Instatiate a new DrawExecutor with the given list of drawers and a runway selection.
     *
     * @param drawers list of drawers used to draw
     * @param distanceDrawers list of drawers that may be drawn above the runway instead of below
     * @param runwaySelection current runway selection
     */
    public DrawExecutor(List<Drawer> drawers, List<Drawer> distanceDrawers, RunwaySelection runwaySelection) {
        this.drawers = drawers;
        this.distanceDrawers = distanceDrawers;
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
        if (runwaySelection.hasSelectedRunway()) {
            this.setupGraphics(g2d, panelWidth, panelHeight);
            this.drawers.forEach(drawer -> drawer.draw(g2d, runwaySelection.getSelectedRunway()));

            double verticalOffset = panelHeight * 2.5;

            if (runwaySelection.hasObstacleSouth()) {
                g2d.translate(0,-verticalOffset);
            }
            this.distanceDrawers.forEach(drawer -> drawer.draw(g2d, runwaySelection.getSelectedRunway()));

            if (runwaySelection.hasObstacleSouth()) {
                g2d.translate(0,verticalOffset); //?
            }
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
        ConstantLengthCalculator calculator = runwaySelection.getSelectedRunway().getConstantLengthCalculator();

        // the margin around the draw display according to the font size
        double margin = g2d.getFontMetrics().getHeight() * DrawConstants.DRAW_MARGIN;

        // the total length (in metres) of all elements that need to be visualised
        int visualisationLength = calculator.getTotalVisualisationLength();

        // the width of the drawing
        int drawWidth = panelWidth;

        // additional margin used to centre the drawing
        int centreMargin = 0;

        // if the panel is too wide and lacks height to draw everything, adjust drawWidth and centreMargin
        if (panelWidth > panelHeight * 1.5) {
            drawWidth = (int) (panelHeight * 1.5);
            centreMargin = (panelWidth - drawWidth) / 2;
        }

        // set font size according to total visualisation length
        g2d.setFont(g2d.getFont().deriveFont((float) visualisationLength / 40));

        // move the origin down to the extended centre line and add some margin
        g2d.translate(margin + centreMargin, (double) panelHeight / 2);

        // the factor by which the both axes are scaled in order to visualise the specified total length
        double axesScaleFactor = (drawWidth - 2 * margin) / visualisationLength;
        g2d.scale(axesScaleFactor, axesScaleFactor);

        // set stroke according to visualisation length
        g2d.setStroke(new BasicStroke((float) visualisationLength / 500));

        // set draw color to black
        g2d.setColor(Color.BLACK);
    }

    public void addDrawer(Drawer drawer) {
        this.drawers.add(drawer);
    }

    /**
     * Removes a given drawer given a class.
     * @param clazz the class of the drawer that will be removed
     */
    public void removeDrawerByClass(Class<? extends Drawer> clazz) {
        this.drawers.removeIf(drawer -> drawer.getClass() == clazz);
    }

}
