package uk.ac.soton.comp2211.view.east;

import javax.swing.*;

import org.painlessgridbag.PainlessGridBag;

import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.controller.AssignObstacleController;
import uk.ac.soton.comp2211.model.RunwaySelection;

/**
 * This panel contains the settings for an obstacle. The user can see the current obstacle, assign an obstacle to
 * the runway or remove the obstacle from the runway.
 */
public class ObstaclePanel extends JPanel implements Observer {
    
    public static final String OPEN_ASSIGN_BUTTON_COMMAND = "assignOpenButton";
    public static final String REMOVE_BUTTON_COMMAND = "removeButton";

    private RunwaySelection runwaySelection;
    private JButton assignObstacleButton;
    private JTextField obstacleTextField;
    private JButton removeObstacleButton;
    
    /**
     * Constructs a new obstacle panel.
     * @param runwaySelection The runway selection
     * @param assignObstacleController Controller for clicks etc.
     */
    public ObstaclePanel(RunwaySelection runwaySelection, AssignObstacleController assignObstacleController) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;
        
        this.setBorder(BorderFactory.createTitledBorder("Obstacles"));

        PainlessGridBag gridBag = new PainlessGridBag(this,false);
        assignObstacleButton = new JButton("Assign new obstacle to current runway");
        assignObstacleButton.setActionCommand(OPEN_ASSIGN_BUTTON_COMMAND);
        assignObstacleButton.addActionListener(assignObstacleController);
        gridBag.row().cellX(assignObstacleButton,3).fillX();
        
        obstacleTextField = new JTextField("");
        obstacleTextField.setEnabled(false);
        removeObstacleButton = new JButton("Remove");
        removeObstacleButton.setActionCommand(REMOVE_BUTTON_COMMAND);
        removeObstacleButton.addActionListener(assignObstacleController);
        gridBag.row().cellX(obstacleTextField,2).fillX().cell(removeObstacleButton);
        
        gridBag.done();
        
        notifyUpdate();
    }

    @Override
    public void notifyUpdate() {
        if (runwaySelection.hasSelectedRunway()) {
            if (runwaySelection.getSelectedRunway().getHigherThreshold().hasRunwayObstacle()) {
                assignObstacleButton.setEnabled(false);
                obstacleTextField.setText(runwaySelection.getSelectedRunway().getHigherThreshold()
                                 .getRunwayObstacle().getObstacle().getName());
                removeObstacleButton.setEnabled(true);
            } else if (runwaySelection.getSelectedRunway().getLowerThreshold().hasRunwayObstacle())   {
                assignObstacleButton.setEnabled(false);
                obstacleTextField.setText(runwaySelection.getSelectedRunway().getLowerThreshold()
                                 .getRunwayObstacle().getObstacle().getName());
                removeObstacleButton.setEnabled(true);
            } else { //no obstacle on runway
                assignObstacleButton.setEnabled(true);
                obstacleTextField.setText("");
                removeObstacleButton.setEnabled(false);                
            }
        } else { //no runway (hence no obstacle can be assigned)
            assignObstacleButton.setEnabled(false);
            obstacleTextField.setText("");
            removeObstacleButton.setEnabled(false);            
        }
    }
}
