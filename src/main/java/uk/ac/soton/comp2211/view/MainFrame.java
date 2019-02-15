package uk.ac.soton.comp2211.view;

import java.awt.*;
import javax.swing.*;

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
        this.setPreferredSize(new Dimension(800, 800));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
