package uk.ac.soton.comp2211.view.modal;

import java.text.NumberFormat;
import java.util.Optional;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.NumberFormatter;

import org.painlessgridbag.PainlessGridBag;

import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.controller.AssignObstacleController;
import uk.ac.soton.comp2211.model.*;
import uk.ac.soton.comp2211.model.validate.Validator;

public class AssignObstaclePanel extends JPanel implements Observer {

    public static final String ASSIGN_OBSTACLE_BUTTON_COMMAND = "assignObstacleButton";
    public static final String CANCEL_BUTTON_COMMAND = "cancelButton";
    public static final String OBSTACLE_COMBOBOX_COMMAND = "obstacleComboBox";
    
    private RunwaySelection runwaySelection;
    private JComboBox<Obstacle> obstacleComboBox;
    private JTextField obstacleNameTextField;
    private JTextField obstacleHeightTextField;
    private JTextField obstacleLengthTextField;
    private JRadioButton higherThresholdRadioButton;
    private JRadioButton lowerThresholdRadioButton;
    private JTextField centrelineDistanceTextField;
    private JTextField thresholdDistanceTextField;
    private JButton assignButton;
    private JButton cancelButton;

    private AssignObstacleController assignObstacleController;

    private Obstacle noneObstacle;
    private boolean ignoreActions;

    /**
     * (View) Constructor for AssignObstaclePanel.
     * @param runwaySelection (Model) The runway selector for the program
     * @param assignObstacleController (Controller) The controller for this view's inputs.
     */
    public AssignObstaclePanel(RunwaySelection runwaySelection, AssignObstacleController assignObstacleController) {
        this.assignObstacleController = assignObstacleController;
        this.runwaySelection = runwaySelection;
        
        this.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        
        PainlessGridBag gridBag = new PainlessGridBag(this,false);
        obstacleComboBox = new JComboBox();
        noneObstacle = new Obstacle("(None)", 0,0);
        obstacleComboBox.addItem(noneObstacle);
        for (Obstacle o: new ObstacleStorage().getObstacles()) {
            obstacleComboBox.addItem(o);
        }
        obstacleComboBox.setSelectedItem(noneObstacle);
        obstacleComboBox.setActionCommand(OBSTACLE_COMBOBOX_COMMAND);
        obstacleComboBox.addActionListener(assignObstacleController);
        gridBag.row().cell(new JLabel("Select predefined:")).cellX(obstacleComboBox, 2).fillX();
        
        NumberFormat integerFormat = NumberFormat.getNumberInstance();
        NumberFormatter integerFormatter = new NumberFormatter(integerFormat);
        integerFormatter.setAllowsInvalid(true);
        integerFormatter.setMaximum(9999);
        integerFormatter.setMinimum(-9999);
        integerFormat.setGroupingUsed(false);
        
        obstacleNameTextField = new JTextField();
        gridBag.row().cell(new JLabel("Name of obstacle:")).cellX(obstacleNameTextField, 2).fillX();
        obstacleNameTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                changeObstacleTextbox();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changeObstacleTextbox();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changeObstacleTextbox();
            }
        });

        obstacleHeightTextField = new JFormattedTextField(integerFormatter);
        gridBag.row().cell().cell(new JLabel("Height (m):")).cell(obstacleHeightTextField).fillX();
        obstacleHeightTextField.addPropertyChangeListener("value", e -> changeObstacleTextbox());
        
        obstacleLengthTextField = new JFormattedTextField(integerFormatter);
        gridBag.row().cell().cell(new JLabel("Length (m):")).cell(obstacleLengthTextField).fillX();
        obstacleLengthTextField.addPropertyChangeListener("value", e -> changeObstacleTextbox());
        
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
        
        centrelineDistanceTextField = new JFormattedTextField(integerFormatter);
        gridBag.row().cellX(new JLabel("Distance to centre line (m):"),2).cell(centrelineDistanceTextField).fillX();
        
        thresholdDistanceTextField = new JFormattedTextField(integerFormatter);
        gridBag.row().cellX(new JLabel("Distance to threshold (m):"),2).cell(thresholdDistanceTextField).fillX();
        
        assignButton = new JButton();
        assignButton.addActionListener(assignObstacleController);
        assignButton.setActionCommand(ASSIGN_OBSTACLE_BUTTON_COMMAND);
        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(assignObstacleController);
        cancelButton.setActionCommand(CANCEL_BUTTON_COMMAND);
        gridBag.row().cellX(assignButton,2).fillX().cell(cancelButton);        
        
        populate();
        gridBag.done();
        
        notifyUpdate();
    }
    
    private void populate() {
        higherThresholdRadioButton.setText(runwaySelection.getSelectedRunway()
                .getHigherThreshold().getHeadingAsString());
        lowerThresholdRadioButton.setText(runwaySelection.getSelectedRunway()
                .getLowerThreshold().getHeadingAsString());
        
        assignButton.setText("Assign to Runway " + runwaySelection.getSelectedRunway().toString());
    }

    /**
     * Fills in the obstacle-specific textboxes with data based on the selected obstacle.
     */
    public void changeObstacleCombobox() {
        if (!ignoreActions) {
            ignoreActions = true;
            Obstacle o = (Obstacle)obstacleComboBox.getSelectedItem();
            if (o == noneObstacle) {
                obstacleNameTextField.setText("");
                obstacleHeightTextField.setText("");
                obstacleLengthTextField.setText("");
            } else {
                obstacleNameTextField.setText(o.getName());
                obstacleHeightTextField.setText(Integer.toString(o.getHeight()));
                obstacleLengthTextField.setText(Integer.toString(o.getLength()));
            }
            ignoreActions = false;
        }
    }

    private void changeObstacleTextbox() {
        if (!ignoreActions) {
            ignoreActions = true;
            assignObstacleController.setIgnoreActions(true);
            obstacleComboBox.setSelectedItem(noneObstacle);
            assignObstacleController.setIgnoreActions(false);
            ignoreActions = false;
        }
    }


    /**
     * Reads the radio buttons to determine which threshold the obstacle is to be assigned to.
     * @return RunwaySide that the obstacle is to be assigned to.
     */
    public RunwaySide getRunwaySide() {
        if (higherThresholdRadioButton.isSelected()) {
            return RunwaySide.HIGHER_THRESHOLD;
        } else {
            return RunwaySide.LOWER_THRESHOLD;
        }
    }
    
    @Override
    public void notifyUpdate() {
        // TODO Auto-generated method stub (will be used with the combobox?)

    }
    
    /**
     * Returns the runway obstacle created from the options on this panel.
     * @return Empty if not valid inputs, otherwise the runway obstacle
     */
    public Optional<RunwayObstacle> getObstacleFromInputs() {
        String issues = "";
        
        int height = 1;
        if (obstacleHeightTextField.getText().equals("")) {
            issues += "Height must not be blank.\n";
        } else {
            height = Integer.parseInt(obstacleHeightTextField.getText());
        }
        
        int length = 1;
        if (obstacleLengthTextField.getText().equals("")) {
            issues += "Length must not be blank.\n";
        } else {
            length = Integer.parseInt(obstacleLengthTextField.getText());
        }
        
        int centreline = 0;
        if (centrelineDistanceTextField.getText().equals("")) {
            issues += "Centreline distance must not be blank.\n";
        } else {
            centreline = Integer.parseInt(centrelineDistanceTextField.getText());
        }
        
        int threshold = 0;
        if (thresholdDistanceTextField.getText().equals("")) {
            issues += "Threshold must not be blank.\n";
        } else {
            threshold = Integer.parseInt(thresholdDistanceTextField.getText());
        }
        
        Obstacle obstacle = new Obstacle(obstacleNameTextField.getText(), height, length);
        RunwayObstacle runwayObstacle = new RunwayObstacle(threshold, centreline, obstacle);
        Validator validator = Validator.forObject(runwayObstacle);
        if (!validator.isValid()) {
            issues += validator.getViolationMessages();
        }
        
        if (issues != "") {
            JOptionPane.showMessageDialog(this, issues);
            return Optional.empty();
        }
        return Optional.of(runwayObstacle);
    }

}
