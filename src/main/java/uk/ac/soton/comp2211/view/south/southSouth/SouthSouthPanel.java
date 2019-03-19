package uk.ac.soton.comp2211.view.south.southSouth;

import javax.swing.*;
import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.view.south.southNorth.SouthNorthPanel;
import uk.ac.soton.comp2211.view.south.southSouth.DirectionPanel;
import uk.ac.soton.comp2211.view.south.southSouth.SouthSouthPanel;
import uk.ac.soton.comp2211.view.south.southSouth.XmlPanel;

/**
 * This panel contains all panels that are placed in the south of the main application window.
 */
public class SouthSouthPanel extends JPanel {

    /**
     *
     * @param directionPanel
     * @param xmlPanel
     */
    public SouthSouthPanel(DirectionPanel directionPanel, XmlPanel xmlPanel) {

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(directionPanel).fillX().cell(xmlPanel).fillX();
        gridBag.done();
    }
}
