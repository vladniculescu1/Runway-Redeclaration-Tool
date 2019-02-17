package uk.ac.soton.comp2211.model;

import java.util.Set;
import uk.ac.soton.comp2211.view.Observer;


public interface Observable {

    void subscribe(Observer observer);

}
