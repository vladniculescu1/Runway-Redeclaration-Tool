package uk.ac.soton.comp2211.view.south.southSouth;

import javax.swing.*;
import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.view.south.ExportPanel;
import uk.ac.soton.comp2211.view.south.ImportPanel;
import uk.ac.soton.comp2211.view.south.southNorth.SouthNorthPanel;
import uk.ac.soton.comp2211.view.south.southSouth.DirectionPanel;
import uk.ac.soton.comp2211.view.south.southSouth.SouthSouthPanel;
import uk.ac.soton.comp2211.view.south.southSouth.XmlPanel;

/**
 * This panel contains all panels that are placed in the south of the main application window.
 */
public class SouthSouthPanel extends JPanel {

    /**
     * Constructs a new southSouth panel and places the supplied child panels inside.
     * @param directionPanel the direction Panel
     * @param exportPanel export XML panel
     * @param importPanel import XML panel
     */
    public SouthSouthPanel(DirectionPanel directionPanel, ExportPanel exportPanel, ImportPanel importPanel) {

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(directionPanel).fillX().cell(exportPanel).fillX().cell(importPanel).fillX();
        gridBag.done();
    }
}
