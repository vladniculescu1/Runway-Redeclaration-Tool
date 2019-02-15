package uk.ac.soton.comp2211.view.east;

import javax.swing.*;

/**
 * This panel contains the settings for an obstacle. The user can see the current obstacle, assign an obstacle to
 * the runway or remove the obstacle from the runway.
 */
public class ObstaclePanel extends JPanel {

    /**
     * Constructs a new obstacle panel.
     */
    public ObstaclePanel() {

        this.setBorder(BorderFactory.createTitledBorder("Obstacles"));

        // this is just a placeholder label, remove later
        this.add(new JLabel("... content placeholder ..."));
    }
}
