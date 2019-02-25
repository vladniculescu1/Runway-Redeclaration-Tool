package uk.ac.soton.comp2211.view;

import javax.swing.*;

import org.antlr.v4.runtime.ParserInterpreter;
import org.painlessgridbag.PainlessGridBag;

import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.controller.AssignObstacleController;
import uk.ac.soton.comp2211.model.Obstacle;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySelection;

public class AssignObstaclePanel extends JPanel implements Observer {

    public static final String ASSIGN_OBSTACLE_BUTTON_COMMAND = "assignObstacleButton";
    public static final String CANCEL_BUTTON_COMMAND = "cancelButton";
    
    private RunwaySelection runwaySelection;
    private JComboBox obstacleComboBox;
    private JTextField obstacleNameTextField;
    private JTextField obstacleHeightTextField;
    private JTextField obstacleLengthTextField;
    private JRadioButton higherThresholdRadioButton;
    private JRadioButton lowerThresholdRadioButton;
    private JTextField centrelineDistanceTextField;
    private JTextField thresholdDistanceTextField;
    private JButton assignButton;
    private JButton cancelButton;
    
    /**
     * TODO.
     * @param runwaySelection TODO
     * @param assignObstacleController TODO
     */
    public AssignObstaclePanel(RunwaySelection runwaySelection, AssignObstacleController assignObstacleController) {

        this.runwaySelection = runwaySelection;
        
        this.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        
        PainlessGridBag gridBag = new PainlessGridBag(this,false);

        obstacleComboBox = new JComboBox(); //TODO populate and link to event listener
        obstacleComboBox.addActionListener(assignObstacleController);
        gridBag.row().cell(new JLabel("Select predefined:")).cellX(obstacleComboBox, 2).fillX();

        //TODO add spacing row
        
        obstacleNameTextField = new JTextField();
        gridBag.row().cell(new JLabel("Name of obstacle:")).cellX(obstacleNameTextField, 2).fillX();
        
        obstacleHeightTextField = new JTextField();
        gridBag.row().cell().cell(new JLabel("Height (m):")).cell(obstacleHeightTextField).fillX();
        
        obstacleLengthTextField = new JTextField();
        gridBag.row().cell().cell(new JLabel("Length (m):")).cell(obstacleLengthTextField).fillX();
        
        gridBag.row().separator();
        
        ButtonGroup buttonGroup = new ButtonGroup();
        higherThresholdRadioButton = new JRadioButton();
        lowerThresholdRadioButton = new JRadioButton();
        buttonGroup.add(lowerThresholdRadioButton);
        buttonGroup.add(higherThresholdRadioButton);
        lowerThresholdRadioButton.setSelected(true);
        gridBag.row().cell(new JLabel("Runway assigned to:"))
                     .cell(lowerThresholdRadioButton)
                     .cell(higherThresholdRadioButton);
        
        centrelineDistanceTextField = new JTextField();
        gridBag.row().cellX(new JLabel("Distance to centre line (m):"),2).cell(centrelineDistanceTextField).fillX();
        
        thresholdDistanceTextField = new JTextField();
        gridBag.row().cellX(new JLabel("Distance to threshold (m):"),2).cell(thresholdDistanceTextField).fillX();
        
        assignButton = new JButton();
        assignButton.addActionListener(assignObstacleController);
        assignButton.setActionCommand(ASSIGN_OBSTACLE_BUTTON_COMMAND);
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(assignObstacleController);
        cancelButton.setActionCommand(CANCEL_BUTTON_COMMAND);
        gridBag.row().cellX(assignButton,2).fillX().cell(cancelButton);        
        
        populate();
        //also ensure only numbers
        gridBag.done();
        
        notifyUpdate();
    }
    
    private void populate() {
        higherThresholdRadioButton.setText(runwaySelection.getSelectedRunway()
                .getHigherThreshold().getHeadingAsString());
        lowerThresholdRadioButton.setText(runwaySelection.getSelectedRunway()
                .getLowerThreshold().getHeadingAsString());
        
        assignButton.setText("Assign to Runway " + runwaySelection.getSelectedRunway().getRunwayName());
        
        
    }
    
    @Override
    public void notifyUpdate() {
        // TODO Auto-generated method stub

    }
    
    /*
    public RunwayObstacle getObstacleFromInputs() throws Exception {
        //returns null if exception
        String issues = "";
        Obstacle obstacle;
        if (obstacleComboBox.getSelectedIndex() == 0)
        {
            String obsName = obstacleNameTextField.getText();
            if (obsName == "") {
                issues += "Obstacle name cannot be empty.\n";
            }
            String obsHeiStr = obstacleHeightTextField.getText();
            String obsLenStr = obstacleHeightTextField.getText();
            if (obsName != "") {
                obstacle = new Obstacle(obsName, Integer.parseInt(obsHeiStr), Integer.parseInt(obsLenStr));
            } else {
                obstacle = new Obstacle("",0,0);
            }
        }
        else
        {
            //TODO get Obstacle from ObstacleStorage[index-1]
        }
        
        if (obsName != "") {
            
        }
        RunwayObstacle runwayObstacle = new RunwayObstacle(0,0,obstacle);
        
        
        if (issues == "") {
            
        } else {
            
        }
    }*/

}
