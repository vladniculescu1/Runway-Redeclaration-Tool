package uk.ac.soton.comp2211.view.south;

import org.painlessgridbag.PainlessGridBag;
import org.painlessgridbag.PainlessGridbagConfiguration;
import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.model.RunwaySelection;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This panel contains ui elements for the exportXML.
 */
public class ExportPanel extends JPanel implements Observer {

    public static final String PNG_EXPORT_BUTTON_COMMAND = "exportPngButton";
    public static final String TXT_EXPORT_BUTTON_COMMAND = "exportTxtButton";
    public static final String XML_EXPORT_BUTTON_COMMAND = "exportXmlButton";

    private RunwaySelection runwaySelection;

    private JButton pngButton;
    private JButton txtButton;
    private JButton xmlButton;

    /**
     * Constructs a new Export panel.
     * @param runwaySelection the runway that is currently selected
     * @param actionListener (Controller) Performs actions when buttons are pressed.
     */
    public ExportPanel(RunwaySelection runwaySelection, ActionListener actionListener) {

        this.setBorder(BorderFactory.createTitledBorder("Export"));

        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;

        PainlessGridbagConfiguration gridbagConfiguration = new PainlessGridbagConfiguration();
        gridbagConfiguration.setFirstRowTopSpacing(5);
        gridbagConfiguration.setLastRowBottomSpacing(5);

        PainlessGridBag gridBag = new PainlessGridBag(this, gridbagConfiguration, false);

        pngButton = new JButton("View (PNG)");
        pngButton.setActionCommand(PNG_EXPORT_BUTTON_COMMAND);
        pngButton.addActionListener(actionListener);

        txtButton = new JButton("Working (TXT)");
        txtButton.setActionCommand(TXT_EXPORT_BUTTON_COMMAND);
        txtButton.addActionListener(actionListener);

        xmlButton = new JButton("Airport (XML)");
        xmlButton.setActionCommand(XML_EXPORT_BUTTON_COMMAND);
        xmlButton.addActionListener(actionListener);

        gridBag.row().cell(pngButton).fillX().cell(txtButton).fillX().cell(xmlButton).fillX();
        gridBag.done();

        this.notifyUpdate();
    }

    @Override
    public void notifyUpdate() {
        if (this.runwaySelection.hasSelectedRunway()) {
            this.pngButton.setEnabled(true);
            this.txtButton.setEnabled(true);
            this.xmlButton.setEnabled(true);
        } else {
            this.pngButton.setEnabled(false);
            this.txtButton.setEnabled(false);
            this.xmlButton.setEnabled(false);
        }
    }
}
