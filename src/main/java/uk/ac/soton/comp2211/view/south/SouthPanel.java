package uk.ac.soton.comp2211.view.south;

import javax.swing.*;
import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.view.south.southNorth.SouthNorthPanel;
import uk.ac.soton.comp2211.view.south.southSouth.DirectionPanel;
import uk.ac.soton.comp2211.view.south.southSouth.SouthSouthPanel;
import uk.ac.soton.comp2211.view.south.southSouth.XmlPanel;

/**
 * This panel contains all panels that are placed in the south of the main application window.
 */
public class SouthPanel extends JPanel {

    /**
     * Constructs a new south panel and places the supplied child panels inside.
     *
     * @param southNorthPanel Contains the checkbox display values panel
     * @param southSouthPanel Contains the DirectionPanel, NotificationPanel and XmlPanel
     */
    public SouthPanel(SouthNorthPanel southNorthPanel, SouthSouthPanel southSouthPanel) {

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(southNorthPanel).fillX();
        gridBag.row().cell(southSouthPanel).fillX();
        gridBag.done();
    }

}
