package uk.ac.soton.comp2211.view.south;

import javax.swing.*;

/**
 * This panel contains the settings for the landing and take-off direction. The user can switch between landing/
 * taking-off towards the lower/higher threshold.
 */
public class DirectionPanel extends JPanel {

    /**
     * Constructs a new direction panel.
     */
    public DirectionPanel() {

        this.setBorder(BorderFactory.createTitledBorder("Landing/Take-off Direction"));

        // this is just a placeholder label, remove later
        this.add(new JLabel("... content placeholder ..."));
    }
}
