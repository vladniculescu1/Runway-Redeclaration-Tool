package uk.ac.soton.comp2211.view.south;

import javax.swing.*;
import org.painlessgridbag.PainlessGridBag;

/**
 * This panel contains all panels that are placed in the south of the main application window.
 */
public class SouthPanel extends JPanel {

    /**
     * Constructs a new south panel and places the supplied child panels inside.
     *
     * @param directionPanel the panel for setting the landing direction
     * @param xmlPanel the panel for importing and exporting xml files
     * @param notificationsPanel the panel for displaying notifications
     */
    public SouthPanel(DirectionPanel directionPanel, XmlPanel xmlPanel,
                      NotificationsPanel notificationsPanel) {

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(directionPanel).fillX().cell(xmlPanel).fillX();
        gridBag.row().cellXRemainder(notificationsPanel).fillX();
        gridBag.done();
    }

}
