package uk.ac.soton.comp2211.view.east;

import javax.swing.*;
import java.awt.*;

/**
 * Wraps the DistancePanel into a JScrollPane.
 */
public class DistancePanelContainer extends JPanel {

    /**
     * Wraps the supplied distance panel in a scroll Panel.
     *
     * @param distancesPanel the panel to show the distances
     */
    public DistancePanelContainer(DistancesPanel distancesPanel) {
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createTitledBorder("Distances"));

        JScrollPane scrollPane = new JScrollPane(distancesPanel);

        // need to do this due to rendering issues
        scrollPane.getVerticalScrollBar().addAdjustmentListener(e -> distancesPanel.repaint());

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());

        this.add(scrollPane, BorderLayout.CENTER);
    }

}
