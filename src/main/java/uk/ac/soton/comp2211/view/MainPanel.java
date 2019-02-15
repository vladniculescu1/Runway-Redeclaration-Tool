package uk.ac.soton.comp2211.view;

import java.awt.*;
import javax.swing.*;

import uk.ac.soton.comp2211.view.center.DisplayTabbedPane;
import uk.ac.soton.comp2211.view.east.EastPanel;
import uk.ac.soton.comp2211.view.south.SouthPanel;

/**
 * The main panel of the application, containing all other panels.
 */
public class MainPanel extends JPanel {

    /**
     * Constructs the main panel and places supplied child panels.
     *
     * @param displayTabbedPane the panel that will be placed in the centre of the main panel
     * @param eastPanel the panel that will be placed in the east of the main panel
     * @param southPanel the panel that will be place in the south of the main panel
     */
    public MainPanel(DisplayTabbedPane displayTabbedPane, EastPanel eastPanel, SouthPanel southPanel) {

        // add a border of 10 px around the main panel
        this.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));

        // use border layout and add all main components
        this.setLayout(new BorderLayout());
        this.add(displayTabbedPane, BorderLayout.CENTER);
        this.add(eastPanel, BorderLayout.EAST);
        this.add(southPanel, BorderLayout.SOUTH);

    }
}
