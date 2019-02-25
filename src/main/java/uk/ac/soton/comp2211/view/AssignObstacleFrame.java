package uk.ac.soton.comp2211.view;

import java.awt.*;
import javax.swing.*;

public class AssignObstacleFrame extends JDialog {

    /**
     *TODO.
     * @param mainFrame TODO 
     * @param assignObstaclePanel TODO
     */
    public AssignObstacleFrame(MainFrame mainFrame, AssignObstaclePanel assignObstaclePanel)    {
        super(mainFrame, ModalityType.DOCUMENT_MODAL);
        
        this.setContentPane(assignObstaclePanel);
        this.setTitle("Assign Obstacle to Runway");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
}
