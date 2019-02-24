package uk.ac.soton.comp2211.model;

import uk.ac.soton.comp2211.Observable;
import uk.ac.soton.comp2211.calculator.*;
import uk.ac.soton.comp2211.Observer;

import java.util.HashSet;
import java.util.Set;


/**
 * The physical runway which is a basis for the logical runway.
 */
public class PhysicalRunway implements Observable {

    private LogicalRunway higherThreshold;
    private LogicalRunway lowerThreshold;
    private RunwaySide runwayDirection;
    private RunwayMode runwayMode;

    private Set<Observer> observers;

    /**
     * The PhysicalRunway constructor.
     * @param higherThreshold the logical runway with the higher heading
     * @param lowerThreshold the logical runway with the lower heading
     * @param runwayDirection indicates whether landing/takeoff is towards the lower or higher threshold
     * @param runwayMode indicates whether a runway is for landing or take-off
     */
    public PhysicalRunway(LogicalRunway higherThreshold, LogicalRunway lowerThreshold,
                          RunwaySide runwayDirection,RunwayMode runwayMode) {
        this.higherThreshold = higherThreshold;
        this.lowerThreshold = lowerThreshold;
        this.runwayDirection = runwayDirection;
        this.runwayMode = runwayMode;
        this.observers = new HashSet<>();
    }

    public LogicalRunway getHigherThreshold() {
        return higherThreshold;
    }

    public LogicalRunway getLowerThreshold() {
        return lowerThreshold;
    }

    public RunwaySide getRunwayDirection() {
        return runwayDirection;
    }

    public RunwayMode getRunwayMode() {
        return runwayMode;
    }

    public Calculator getCalculator() {
        return new Calculator(this);
    }

    public void setRunwayDirection(RunwaySide runwayDirection) {
        this.runwayDirection = runwayDirection;
        this.observers.forEach(Observer::notifyUpdate);
    }

    public void setRunwayMode(RunwayMode runwayMode) {
        this.runwayMode = runwayMode;
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
