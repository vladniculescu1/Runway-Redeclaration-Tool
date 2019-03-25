package uk.ac.soton.comp2211.view.south;

import org.painlessgridbag.PainlessGridBag;
import org.painlessgridbag.PainlessGridbagConfiguration;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This panel contains ui element for the XML import.
 */
public class ImportPanel extends JPanel {

    public static final String XML_IMPORT_BUTTON_COMMAND = "importXmlButton";

    /**
     * Constructs a new Import panel.
     * @param actionListener (Controller) Performs actions when buttons are pressed.
     */
    public ImportPanel(ActionListener actionListener) {

        this.setBorder(BorderFactory.createTitledBorder("Import"));

        PainlessGridbagConfiguration gridbagConfiguration = new PainlessGridbagConfiguration();
        gridbagConfiguration.setFirstRowTopSpacing(5);
        gridbagConfiguration.setLastRowBottomSpacing(5);

        PainlessGridBag gridBag = new PainlessGridBag(this, gridbagConfiguration,false);

        JButton xmlButton = new JButton("Airport (XML)");
        xmlButton.setActionCommand(XML_IMPORT_BUTTON_COMMAND);
        xmlButton.addActionListener(actionListener);

        gridBag.row().cell(xmlButton).fillX();
        gridBag.done();
    }
}
