package uk.ac.soton.comp2211.model;

import java.util.Optional;

public class RunwaySelection {

    private DrawMode drawMode;
    private Optional<PhysicalRunway> selectedRunway;

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
