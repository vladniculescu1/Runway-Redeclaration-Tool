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

    /**
     * Constructs a new obstacle panel.
     * @param runwaySelection TODO
     * @param assignObstacleController TODO
     */
    public ObstaclePanel(RunwaySelection runwaySelection, AssignObstacleController assignObstacleController) {

        this.setBorder(BorderFactory.createTitledBorder("Obstacles"));

        PainlessGridBag gridBag = new PainlessGridBag(this,false);
        JButton assignObstacleButton = new JButton("Assign new obstacle to current runway");
        gridBag.row().cellX(assignObstacleButton,3).fillX();
        //TODO add eventlistener etc to button
        
        JTextField obstacleTextField = new JTextField("");
        JButton removeObstacleButton = new JButton("Remove");
        //TODO add eventlistener etc to button
        gridBag.row().cellX(obstacleTextField,2).fillX().cell(removeObstacleButton);
        
        
        
        gridBag.done();
        
        notifyUpdate();
    }

    @Override
    public void notifyUpdate() {
        // TODO Auto-generated method stub
        //TODO make textfield uneditable and change with notifyUpdate
        //TODO make buttons unpresable
    }
}
