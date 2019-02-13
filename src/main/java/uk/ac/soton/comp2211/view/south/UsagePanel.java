package uk.ac.soton.comp2211.view.south;

import javax.swing.*;

/**
 * This panel contains elements for the runway usage, which is either landing or take-off.
 */
public class UsagePanel extends JPanel {


    /**
     * Constructs a new usage panel.
     */
    public UsagePanel() {

        this.setBorder(BorderFactory.createTitledBorder("Usage"));

        // this is just a placeholder label, remove later
        this.add(new JLabel("... content placeholder ..."));
    }

}
