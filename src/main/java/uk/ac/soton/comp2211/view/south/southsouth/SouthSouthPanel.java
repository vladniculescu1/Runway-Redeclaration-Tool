package uk.ac.soton.comp2211.view.south.southsouth;

import javax.swing.*;
import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.view.south.ExportPanel;
import uk.ac.soton.comp2211.view.south.ImportPanel;

/**
 * This panel contains all panels that are placed in the south of the main application window.
 */
public class SouthSouthPanel extends JPanel {

    /**
     * Constructs a new southsouth panel and places the supplied child panels inside.
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
