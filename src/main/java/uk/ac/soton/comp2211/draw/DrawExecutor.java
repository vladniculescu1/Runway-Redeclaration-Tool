package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.model.RunwaySelection;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * This class holds the current runway selection and a list of all drawers. In order to draw the current selection
 * on the panel, the method executeDrawers should be called.
 */
public class DrawExecutor {

    private List<Drawer> drawers;
    private List<Drawer> distanceDrawers;
    private RunwaySelection runwaySelection;

    private Map<Class<? extends Drawer>, Boolean> drawerEnabled;

    /**
     * Instantiate a new DrawExecutor with the given list of drawers and a runway selection.
     *
     * @param drawers list of drawers used to draw
     * @param distanceDrawers list of drawers that may be drawn above the runway instead of below
     * @param runwaySelection current runway selection
     */
    public DrawExecutor(List<Drawer> drawers, List<Drawer> distanceDrawers, RunwaySelection runwaySelection) {
        this.drawers = drawers;
        this.distanceDrawers = distanceDrawers;
        this.runwaySelection = runwaySelection;
        drawerEnabled = new HashMap<>();
        this.drawers.forEach(drawer -> drawerEnabled.put(drawer.getClass(), true));
        this.distanceDrawers.forEach(drawer -> drawerEnabled.put(drawer.getClass(), true));
    }

    /**
     * Setup graphics and execute all drawers.
     *
     * @param g2d the graphics2d object used for drawing
     * @param panelWidth the width of the draw display panel
     * @param panelHeight the height of the draw display panel
     * @param rotate whether to flip the text
     */
    public void executeDrawers(Graphics2D g2d, int panelWidth, int panelHeight, Boolean rotate) {
        if (runwaySelection.hasSelectedRunway()) {
            this.setupGraphics(g2d, panelWidth, panelHeight);

            this.drawers.stream()
                .filter(drawer -> this.drawerEnabled.get(drawer.getClass()))
                .forEach(drawer -> drawer.draw(g2d, this.runwaySelection.getSelectedRunway(), rotate)
                );

            double verticalOffset = (DrawConstants.STRIP_WIDTH / 2 + DrawConstants.RUNWAY_WIDTH / 2)
                    * g2d.getFontMetrics().getHeight();

            if (runwaySelection.hasObstacleSouth()) {
                g2d.translate(0,-verticalOffset);
            }

            this.distanceDrawers.stream()
                .filter(drawer -> this.drawerEnabled.get(drawer.getClass()))
                .forEach(drawer -> drawer.draw(g2d, runwaySelection.getSelectedRunway(), rotate)
                );

            if (runwaySelection.hasObstacleSouth()) {
                g2d.translate(0,verticalOffset);
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
        if (panelWidth > panelHeight * 1.45) {
            drawWidth = (int) (panelHeight * 1.45);
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

    /**
     * Enables drawer by class. Throws an exception if drawer for this class doesn't exist.
     *
     * @param clazz the class of the drawer to be enabled
     */
    public void enableDrawer(Class<? extends Drawer> clazz) {
        if (this.drawerExists(clazz)) {
            this.drawerEnabled.put(clazz, true);
        } else {
            throw new IllegalArgumentException("Instance of class " + clazz + " is not in drawers");
        }
    }

    public void addDrawer(Drawer drawer) {
        this.drawers.add(drawer);
    }

    /**
     * Disables drawer by class. Throws an exception if drawer for this class doesn't exist.
     *
     * @param clazz the class of the drawer to be disabled
     */
    public void disableDrawer(Class<? extends Drawer> clazz) {
        if (this.drawerExists(clazz)) {
            this.drawerEnabled.put(clazz, false);
        } else {
            throw new IllegalArgumentException("Instance of class " + clazz + " is not in drawers");
        }
    }

    private boolean drawerExists(Class<? extends Drawer> clazz) {
        return Stream.concat(this.drawers.stream(), this.distanceDrawers.stream())
                .anyMatch(drawer -> drawer.getClass() == clazz);
    }

}
