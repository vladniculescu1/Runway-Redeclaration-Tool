package uk.ac.soton.comp2211;

import uk.ac.soton.comp2211.model.Airport;
import uk.ac.soton.comp2211.model.ObstacleStorage;
import uk.ac.soton.comp2211.model.RunwaySelection;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ApplicationData {

    public ApplicationData(Airport airport, RunwaySelection runwaySelection, ObstacleStorage obstacleStorage) {
        this.airport = airport;
        this.runwaySelection = runwaySelection;
        this.obstacleStorage = obstacleStorage;
    }

    private ApplicationData() {
    }

    @XmlElement
    private Airport airport;

    @XmlElement
    private RunwaySelection runwaySelection;

    @XmlElement
    private ObstacleStorage obstacleStorage;

    public RunwaySelection getRunwaySelection() {
        return runwaySelection;
    }

    public Airport getAirport() {
        return airport;
    }

    public ObstacleStorage getObstacleStorage() {
        return obstacleStorage;
    }
}
