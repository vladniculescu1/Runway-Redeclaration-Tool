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

    private DrawMode drawMode;

    @XmlElement
    // @XmlElementRef(name="physicalRunway", type=PhysicalRunway.class)
    @XmlIDREF
    @XmlJavaTypeAdapter(OptionalAdapter.class)
    private Optional<PhysicalRunway> selectedRunway;

    private Set<Observer> observers;


    private RunwaySelection() {
        this.selectedRunway = Optional.empty();
    }

    /**
     * RunwaySelection constructor.
     * @param drawMode the drawing mode; where the drawing is done.
     */
    public RunwaySelection(DrawMode drawMode) {
        this.drawMode = drawMode;
        this.selectedRunway = Optional.empty();
        this.observers = new HashSet<>();
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
