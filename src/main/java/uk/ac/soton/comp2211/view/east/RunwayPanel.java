package uk.ac.soton.comp2211.view.east;

import javax.swing.*;

/**
 * This panel contains the settings for the runway. The user can select a runway from a dropdown list, add a
 * runway or delete a runway.
 */
public class RunwayPanel extends JPanel {

    /**
     * Constructs a new runway panel.
     */
    public RunwayPanel() {

        this.setBorder(BorderFactory.createTitledBorder("Runway"));

        // this is just a placeholder label, remove later
        this.add(new JLabel("... content placeholder ..."));
    }
}
