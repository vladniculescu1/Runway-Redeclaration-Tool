package uk.ac.soton.comp2211.model;

import uk.ac.soton.comp2211.Observable;
import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.xml.OptionalAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Chose a runway to be viewed/used.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class RunwaySelection implements Observable, Observer {

    @XmlElement
    @XmlIDREF
    @XmlJavaTypeAdapter(OptionalAdapter.class)
    private Optional<PhysicalRunway> selectedRunway;

    private Set<Observer> observers;

    /**
     * RunwaySelection constructor.
     */
    public RunwaySelection() {
        this.selectedRunway = Optional.empty();
        this.observers = new HashSet<>();
    }

    /**
     * Returns true iff this has a runway with an obstacle that is below the centreline.
     * @return True if obstacle is below centreline, false otherwise.
     */
    public boolean hasObstacleSouth() {
        return (selectedRunway.isPresent()
                && selectedRunway.get().hasObstacle()
                && selectedRunway.get().getLowerThreshold().getRunwayObstacle().getCentreLineDistance() < 0);
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

    public void removeSelectedRunway() {
        this.selectedRunway = Optional.empty();
    }

    @Override
    public void notifyUpdate() {
        this.observers.forEach(Observer::notifyUpdate);
    }

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }
}
