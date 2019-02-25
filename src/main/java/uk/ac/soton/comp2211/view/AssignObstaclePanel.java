package uk.ac.soton.comp2211.view;

import javax.swing.*;

import org.painlessgridbag.PainlessGridBag;

import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.controller.AssignObstacleController;
import uk.ac.soton.comp2211.model.RunwaySelection;

public class AssignObstaclePanel extends JPanel implements Observer {

    /**
     * TODO.
     * @param runwaySelection TODO
     * @param assignObstacleController TODO
     */
    public AssignObstaclePanel(RunwaySelection runwaySelection, AssignObstacleController assignObstacleController) {

        this.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        
        PainlessGridBag gridBag = new PainlessGridBag(this,false);

        JComboBox obstacleComboBox = new JComboBox(); //TODO populate and link to event listener
        gridBag.row().cell(new JLabel("Select predefined:")).cellX(obstacleComboBox, 2);
        
        gridBag.row();
        
        JTextField obstacleNameTextField = new JTextField(); //TODO popoulate and link to event listener
        gridBag.row().cell(new JLabel("Name of obstacle:")).cellX(obstacleNameTextField, 2);
        
        JTextField obstacleHeightTextField = new JTextField(); //TODO popoulate and link to event listener
        gridBag.row().cell().cell(new JLabel("Height (m):")).cell(obstacleHeightTextField);
        
        JTextField obstacleLengthTextField = new JTextField(); //TODO popoulate and link to event listener
        gridBag.row().cell().cell(new JLabel("Length (m):")).cell(obstacleLengthTextField);
        
        //TODO line
        gridBag.row(); //placeholder, TODO remove
        
        JRadioButton higherThresholdRadioButton = new JRadioButton(); //TODO popoulate and link to event listener
        JRadioButton lowerThresholdRadioButton = new JRadioButton();
        gridBag.row().cell(new JLabel("Runway assigned to:"))
                     .cell(higherThresholdRadioButton)
                     .cell(lowerThresholdRadioButton);
        
        JTextField centrelineDistanceTextField = new JTextField(); //TODO popoulate and link to event listener
        gridBag.row().cellX(new JLabel("Distance to centre line (m):"),2).cell(centrelineDistanceTextField);
        
        JTextField thresholdDistanceTextField = new JTextField(); //TODO popoulate and link to event listener
        gridBag.row().cellX(new JLabel("Distance to threshold (m):"),2).cell(thresholdDistanceTextField);
        
        JButton assignButton = new JButton("Assign to Runway "); //TODO populate and link to event listerner
        JButton cancelButton = new JButton("Cancel"); //TODO populate and link to event listener
        gridBag.row().cellX(assignButton,2).cell(cancelButton);        
        
        gridBag.done();
        
        notifyUpdate();
    }
    
    @Override
    public void notifyUpdate() {
        // TODO Auto-generated method stub

    }

}
