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
     */
    public RunwaySelection(DrawMode drawMode) {
        this.drawMode = drawMode;
        this.selectedRunway = Optional.empty();
    }

    public DrawMode getDrawMode() {
        return drawMode;
    }

    public void setSelectedRunway(PhysicalRunway physicalRunway) {
        this.selectedRunway = Optional.of(physicalRunway);
    }

    public boolean hasSelectedRunway() {
        return selectedRunway.isPresent();
    }

    public PhysicalRunway getSelectedRunway() {
        return selectedRunway.get();
    }
}
