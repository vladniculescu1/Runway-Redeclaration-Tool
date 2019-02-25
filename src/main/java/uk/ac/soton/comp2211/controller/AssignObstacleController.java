package uk.ac.soton.comp2211.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.MainFrame;

public class AssignObstacleController implements ActionListener {

    private RunwaySelection runwaySelection;
    private MainFrame mainFrame;
    
    public AssignObstacleController(RunwaySelection runwaySelection)    {
        this.runwaySelection = runwaySelection;
    }
    
    public void addMainFrame(MainFrame mainFrame)  {
        this.mainFrame = mainFrame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}
