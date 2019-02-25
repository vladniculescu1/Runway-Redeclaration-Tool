package uk.ac.soton.comp2211.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.AssignObstacleFrame;
import uk.ac.soton.comp2211.view.AssignObstaclePanel;
import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.east.ObstaclePanel;

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
        switch (e.getActionCommand()) {

            case ObstaclePanel.OPEN_ASSIGN_BUTTON_COMMAND: {
                new AssignObstacleFrame(mainFrame, new AssignObstaclePanel(runwaySelection, this));
                break;
            }
            case ObstaclePanel.REMOVE_BUTTON_COMMAND: {
                //TODO
                break;
            }
            default:
                break;
        }
    }

}
