package uk.ac.soton.comp2211.view.south.southNorth;

import javax.swing.*;
import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.view.south.southNorth.SouthNorthPanel;
import uk.ac.soton.comp2211.view.south.southSouth.DirectionPanel;
import uk.ac.soton.comp2211.view.south.southSouth.SouthSouthPanel;
import uk.ac.soton.comp2211.view.south.southSouth.XmlPanel;

/**
 * This panel contains all panels that are placed in the southNorth of the main application window.
 */
public class SouthNorthPanel extends JPanel {

    public SouthNorthPanel(VisibleDistancesPanel visibleDistancesPanel) {

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(visibleDistancesPanel).fillX();
        gridBag.done();
    }
}
