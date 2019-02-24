package uk.ac.soton.comp2211;

import uk.ac.soton.comp2211.Observer;


public interface Observable {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

}
