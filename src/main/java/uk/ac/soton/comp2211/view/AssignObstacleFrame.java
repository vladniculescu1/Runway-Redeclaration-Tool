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
        super(mainFrame, "Assign Obstacle to Runway");
        
        this.setContentPane(assignObstaclePanel);
        this.setPreferredSize(new Dimension(800, 800)); //TODO
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }
}
