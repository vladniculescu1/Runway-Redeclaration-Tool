package uk.ac.soton.comp2211.view.south;

import org.painlessgridbag.PainlessGridBag;

import javax.swing.*;

/**
 * This panel contains all panels that are placed in the south of the main application window.
 */
public class SouthPanel extends JPanel {

    /**
     * Constructs a new south panel and places the supplied child panels inside.
     *
     * @param directionPanel the panel for setting the landing direction
     * @param exportPanel the panel for exporting various files
     * @param importPanel the panel for importing (xml) files
     */
    public SouthPanel(DirectionPanel directionPanel, ExportPanel exportPanel, ImportPanel importPanel) {

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(directionPanel).fillX().cell(exportPanel).fillX().cell(importPanel).fillX();
        gridBag.done();
    }

}
