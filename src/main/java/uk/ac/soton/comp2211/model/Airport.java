package uk.ac.soton.comp2211.model;

import uk.ac.soton.comp2211.Observable;
import uk.ac.soton.comp2211.Observer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The Airport class that defines the individual airports. No two identical physical runways
 */
public class Airport implements Observable {

    private Set<PhysicalRunway> runways;

    private Set<Observer> observers;

    /**
     * The Airport with a HashSet of runways and observers.
     */
    public Airport() {
        this.runways = new HashSet<>();
        this.observers = new HashSet<>();

    }

    public Set<PhysicalRunway> getRunways() {
        return runways;
    }

    /**
     * Adds a runway (to the airport).
     * @param runway an instance of a PhysicalRunway
     */
    public void addRunway(PhysicalRunway runway) {
        this.runways.add(runway);
        this.observers.forEach(Observer::notifyUpdate);
    }

    public void removeRunway(PhysicalRunway runway) {
        this.runways.remove(runway);
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
