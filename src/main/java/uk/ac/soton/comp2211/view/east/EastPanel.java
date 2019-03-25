package uk.ac.soton.comp2211.view.east;

import org.painlessgridbag.PainlessGridBag;
import org.painlessgridbag.PainlessGridbagConfiguration;

import java.awt.GridBagConstraints;

import javax.swing.*;

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
        
        PainlessGridbagConfiguration gridbagConfiguration = new PainlessGridbagConfiguration();
        gridbagConfiguration.setLastRowBottomSpacing(0);
        gridbagConfiguration.setFirstRowTopSpacing(0);
        gridbagConfiguration.setLastColumnRightSpacing(0);

        PainlessGridBag gridBag = new PainlessGridBag(this, gridbagConfiguration, false);
        gridBag.row().cell(runwayPanel).fillX();
        gridBag.row().cell(obstaclePanel).fillX();
        gridBag.row().cell(new DistancePanelContainer(distancesPanel)).fillXY();
        gridBag.done();
    }

}
