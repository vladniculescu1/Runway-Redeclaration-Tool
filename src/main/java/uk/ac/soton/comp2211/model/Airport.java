package uk.ac.soton.comp2211.model;

import java.util.List;
import java.util.Set;

/**
 * The Airport class that defines the individual airports. No two identical physical runways
 */
public class Airport {

    private Set<PhysicalRunway> runways;

    public Airport(Set<PhysicalRunway> runways) {
        this.runways = runways;
    }

    public Set<PhysicalRunway> getRunways() {
        return runways;
    }
}
