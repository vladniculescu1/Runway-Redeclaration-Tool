package uk.ac.soton.comp2211.view;

import javax.swing.*;
import java.awt.*;

/**
 * The main frame of the application, showing the main panel.
 */
public class MainFrame extends JFrame {

    /**
     * Constructs a new main window using the main application panel.
     *
     * @param mainPanel the main application panel
     */
    public MainFrame(MainPanel mainPanel) {

        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Runway Redeclaration Tool");
        this.setPreferredSize(new Dimension(1200, 800));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
