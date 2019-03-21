package uk.ac.soton.comp2211;

public interface Observable {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

}
