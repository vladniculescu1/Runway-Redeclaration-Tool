package uk.ac.soton.comp2211.view;

import java.awt.*;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class AssignObstacleFrame extends JDialog {

    /**
     *TODO.
     * @param mainFrame TODO 
     */
    public AssignObstacleFrame(MainFrame mainFrame)    {
        super(mainFrame, ModalityType.DOCUMENT_MODAL);
        
        this.setTitle("Assign Obstacle to Runway");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    public void close() {
        this.setVisible(false);
    }
    
    /**
     * TODO.
     * @param assignObstaclePanel TODO
     */
    public void create(AssignObstaclePanel assignObstaclePanel) {
        this.setContentPane(assignObstaclePanel);
        this.pack();
        this.setVisible(true);
    }
    
}
