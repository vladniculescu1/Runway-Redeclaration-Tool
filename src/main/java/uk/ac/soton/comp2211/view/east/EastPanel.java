package uk.ac.soton.comp2211.view.east;

import javax.swing.*;

import org.painlessgridbag.PainlessGridBag;

/**
 * This panel contains all panels that are placed in the east of the main application window.
 */
public class EastPanel extends JPanel {

    /**
     * Constructs a new south panel and places the supplied child panels inside.
     *
     * @param runwayPanel the panel containing the runway settings
     * @param obstaclePanel the panel containing the obstacle settings
     * @param distancesPanel the panel showing the runway distances
     */
    public EastPanel(RunwayPanel runwayPanel, ObstaclePanel obstaclePanel, DistancesPanel distancesPanel) {

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(runwayPanel).fillX();
        gridBag.row().cell(obstaclePanel).fillX();
        gridBag.row().cell(distancesPanel).fillXY();
        gridBag.done();
    }

}
