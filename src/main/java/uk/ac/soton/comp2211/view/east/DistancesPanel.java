package uk.ac.soton.comp2211.view.east;

import javax.swing.*;

/**
 * This panel shows both the original runway distances and the re-calculated runway distances to the user.
 */
public class DistancesPanel extends JPanel {

    /**
     * Constructs a new distances panel.
     */
    public DistancesPanel() {

        this.setBorder(BorderFactory.createTitledBorder("Distances"));

        // this is just a placeholder label, remove later
        this.add(new JLabel("... content placeholder ..."));
    }
}
