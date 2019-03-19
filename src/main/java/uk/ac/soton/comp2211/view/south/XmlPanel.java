package uk.ac.soton.comp2211.view.south;

import javax.management.Notification;
import javax.swing.*;

/**
 * This panel contains ui elements for the XML import and export.
 */
public class XmlPanel extends JPanel {

    /**
     * Constructs a new XML panel.
     */
    public XmlPanel() {

        this.setBorder(BorderFactory.createTitledBorder("XML"));
        
        // this is just a placeholder label, remove later
        this.add(new JLabel("... content placeholder ..."));
    }
}
