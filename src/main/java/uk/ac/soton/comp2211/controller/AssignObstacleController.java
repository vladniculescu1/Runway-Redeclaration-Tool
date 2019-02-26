package uk.ac.soton.comp2211.controller;

import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.AssignObstacleFrame;
import uk.ac.soton.comp2211.view.AssignObstaclePanel;
import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.east.ObstaclePanel;

public class AssignObstacleController implements ActionListener {

    private RunwaySelection runwaySelection;
    private MainFrame mainFrame;
    private AssignObstacleFrame assignObstacleFrame;
    private AssignObstaclePanel assignObstaclePanel;
    
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
                assignObstaclePanel = new AssignObstaclePanel(runwaySelection, this);
                assignObstacleFrame = new AssignObstacleFrame(mainFrame, assignObstaclePanel);
                break;
            }
            case ObstaclePanel.REMOVE_BUTTON_COMMAND: {
                runwaySelection.getSelectedRunway().getHigherThreshold().removeRunwayObstacle();
                runwaySelection.getSelectedRunway().getLowerThreshold().removeRunwayObstacle();   
                break;
            }
            case AssignObstaclePanel.ASSIGN_OBSTACLE_BUTTON_COMMAND: {
                RunwayObstacle ro = assignObstaclePanel.getObstacleFromInputs();
                if (ro != null) {

                    runwaySelection.getSelectedRunway().getHigherThreshold().setRunwayObstacle(ro);
                    runwaySelection.getSelectedRunway().getLowerThreshold().setRunwayObstacle(ro);   
                    
                    //TODO close assign window
                }
                break;
            }
            case AssignObstaclePanel.CANCEL_BUTTON_COMMAND: {
                //TODO close assign window
                
                break;
            }
            default:
                break;
        }
    }

}
