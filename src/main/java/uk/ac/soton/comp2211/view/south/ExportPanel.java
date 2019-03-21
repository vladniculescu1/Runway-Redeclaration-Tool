package uk.ac.soton.comp2211.view.south;

import org.painlessgridbag.PainlessGridBag;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This panel contains ui elements for the exportXML.
 */
public class ExportPanel extends JPanel {

    public static final String PNG_EXPORT_BUTTON_COMMAND = "exportPngButton";
    public static final String TXT_EXPORT_BUTTON_COMMAND = "exportTxtButton";
    public static final String XML_EXPORT_BUTTON_COMMAND = "exportXmlButton";

    /**
     * Constructs a new Export panel.
     * @param actionListener (Controller) Performs actions when buttons are pressed.
     */
    public ExportPanel(ActionListener actionListener) {

        this.setBorder(BorderFactory.createTitledBorder("Export status"));

        PainlessGridBag gridBag = new PainlessGridBag(this, false);

        JButton pngButton = new JButton("View (PNG)");
        pngButton.setActionCommand(PNG_EXPORT_BUTTON_COMMAND);
        pngButton.addActionListener(actionListener);
        JButton txtButton = new JButton("Working (TXT)");
        txtButton.setActionCommand(TXT_EXPORT_BUTTON_COMMAND);
        txtButton.addActionListener(actionListener);
        JButton xmlButton = new JButton("Airport (XML)");
        xmlButton.setActionCommand(XML_EXPORT_BUTTON_COMMAND);
        xmlButton.addActionListener(actionListener);


        gridBag.row().cell(pngButton).fillX().cell(txtButton).fillX().cell(xmlButton).fillX();
        gridBag.done();
    }
}
