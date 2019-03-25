package uk.ac.soton.comp2211.view.south.southnorth;

import javax.swing.*;
import org.painlessgridbag.PainlessGridBag;

/**
 * This panel contains all panels that are placed in the southnorth of the main application window.
 */
public class SouthNorthPanel extends JPanel {

    /**
     * South north Panel constructor.
     * @param visibleDistancesPanel the panel for displaying the checkboxes to change visible distances
     */
    public SouthNorthPanel(VisibleDistancesPanel visibleDistancesPanel) {

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(visibleDistancesPanel).fillX();
        gridBag.done();
    }
}
