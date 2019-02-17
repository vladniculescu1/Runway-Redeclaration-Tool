package uk.ac.soton.comp2211.model;

import java.util.Optional;

public class RunwayDisplay {

    private DrawMode drawMode;
    private RunwayMode runwayMode;
    private Optional<PhysicalRunway> selectedRunway;

    public DrawMode getDrawMode() {
        return drawMode;
    }

    public RunwayMode getRunwayMode() {
        return runwayMode;
    }

    public boolean hasSelectedRunway() {
        return selectedRunway.isPresent();
    }

    public PhysicalRunway getSelectedRunway() {
        return selectedRunway.get();
    }
}
