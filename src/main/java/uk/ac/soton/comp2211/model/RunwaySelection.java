package uk.ac.soton.comp2211.model;

import java.util.Optional;

/**
 * Chose a runway to be viewed/used.
 */
public class RunwaySelection {

    private DrawMode drawMode;
    private Optional<PhysicalRunway> selectedRunway;

    /**
     * RunwaySelection constructor.
     * @param drawMode the drawing mode; where the drawing is done.
     * @param selectedRunway the runway that is currently selected. It is an instance of PhysicalRunway.
     *                       Optional &lt;PhysicalRunway&gt; used as there can be no runway selected (NULL)
     */
    public RunwaySelection(DrawMode drawMode, Optional<PhysicalRunway> selectedRunway) {
        this.drawMode = drawMode;
        this.selectedRunway = selectedRunway;
    }

    public DrawMode getDrawMode() {
        return drawMode;
    }

    public boolean hasSelectedRunway() {
        return selectedRunway.isPresent();
    }

    public PhysicalRunway getSelectedRunway() {
        return selectedRunway.get();
    }
}
