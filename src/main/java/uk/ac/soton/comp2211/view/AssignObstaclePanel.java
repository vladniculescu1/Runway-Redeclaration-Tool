package uk.ac.soton.comp2211.view;

import javax.swing.*;

import org.antlr.v4.runtime.ParserInterpreter;
import org.painlessgridbag.PainlessGridBag;

import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.controller.AssignObstacleController;
import uk.ac.soton.comp2211.model.Obstacle;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.validate.Validator;

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
    
    /**
     * Returns the runway obstacle created from the options on this panel.
     * @return null if not valid inputs, otherwise the runway obstacle
     */
    public RunwayObstacle getObstacleFromInputs() {
        String issues = "";
        int height = 1;
        if (!isNumeric(obstacleHeightTextField.getText())) {
            issues += "Height must be an integer.\n";
        } else {
            height = Integer.parseInt(obstacleHeightTextField.getText());
        }
        int length = 1;
        if (!isNumeric(obstacleLengthTextField.getText())) {
            issues += "Length must be an integer.\n";
        } else {
            length = Integer.parseInt(obstacleLengthTextField.getText());
        }
        int centreline = 0;
        if (!isNumeric(centrelineDistanceTextField.getText())) {
            issues += "Centreline distance must be an integer.\n";
        } else {
            centreline = Integer.parseInt(centrelineDistanceTextField.getText());
        }
        int threshold = 0;
        if (!isNumeric(thresholdDistanceTextField.getText())) {
            issues += "Threshold must be an integer.\n";
        } else {
            threshold = Integer.parseInt(thresholdDistanceTextField.getText());
        }
        Obstacle obstacle = new Obstacle(obstacleNameTextField.getText(), height, length);
        RunwayObstacle runwayObstacle = new RunwayObstacle(centreline, threshold,obstacle);
        Validator validator = Validator.forObject(obstacle);
        if (!validator.isValid()) {
            issues += validator.getViolationMessages();
        }
        validator = Validator.forObject(runwayObstacle);
        if (!validator.isValid()) {
            issues += validator.getViolationMessages();
        }
        
        if (issues != "") {
            JOptionPane.showMessageDialog(this, issues);
            return null;
        }
        return runwayObstacle;
    }
    
    private boolean isNumeric(String s) {
        try {
            int i = Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}
