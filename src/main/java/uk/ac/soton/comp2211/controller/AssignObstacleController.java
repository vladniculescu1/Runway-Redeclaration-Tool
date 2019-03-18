package uk.ac.soton.comp2211.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

import uk.ac.soton.comp2211.model.ObstacleStorage;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;
import uk.ac.soton.comp2211.view.east.ObstaclePanel;
import uk.ac.soton.comp2211.view.modal.AssignObstaclePanel;
import uk.ac.soton.comp2211.view.modal.DisplayPopUpFrame;

public class AssignObstacleController implements ActionListener {

    private String panelTitle = "Assign Obstacle to Runway";
    private RunwaySelection runwaySelection;
    private DisplayPopUpFrame displayPopUpFrame;
    private AssignObstaclePanel assignObstaclePanel;

    private ObstacleStorage obstacleStorage;

    private boolean ignoreActions = false;
    
    /**
     * Creates this AssignObstacleController.
     * @param runwaySelection The runwaySelection.
     */
    public AssignObstacleController(RunwaySelection runwaySelection, ObstacleStorage obstacleStorage)    {
        this.runwaySelection = runwaySelection;
        this.obstacleStorage = obstacleStorage;
        displayPopUpFrame = new DisplayPopUpFrame("Assign Obstacle to Runway");
    }

    public void setIgnoreActions(boolean ignoreActions) {
        this.ignoreActions = ignoreActions;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!ignoreActions) {
            switch (e.getActionCommand()) {

                case ObstaclePanel.OPEN_ASSIGN_BUTTON_COMMAND: {
                    assignObstaclePanel = new AssignObstaclePanel(runwaySelection, this, obstacleStorage);
                    displayPopUpFrame.create(assignObstaclePanel);
                    break;
                }
                case ObstaclePanel.REMOVE_BUTTON_COMMAND: {
                    runwaySelection.getSelectedRunway().getHigherThreshold().removeRunwayObstacle();
                    runwaySelection.getSelectedRunway().getLowerThreshold().removeRunwayObstacle();

                    runwaySelection.notifyUpdate();
                    break;
                }
                case AssignObstaclePanel.OBSTACLE_COMBOBOX_COMMAND: {
                    assignObstaclePanel.changeObstacleCombobox();
                    break;
                }
                case AssignObstaclePanel.ASSIGN_OBSTACLE_BUTTON_COMMAND: {
                    Optional<RunwayObstacle> runwayObstacleOptional = assignObstaclePanel.getObstacleFromInputs();
                    if (runwayObstacleOptional.isPresent()) {
                        RunwayObstacle runwayObstacle = runwayObstacleOptional.get();
                        switch (assignObstaclePanel.getRunwaySide()) {
                            case HIGHER_THRESHOLD: {
                                runwaySelection.getSelectedRunway().getHigherThreshold()
                                        .setRunwayObstacle(runwayObstacle);
                                runwaySelection.getSelectedRunway().getLowerThreshold().setRunwayObstacle(
                                        new RunwayObstacle(
                                                runwaySelection.getSelectedRunway().getDynamicLengthCalculator()
                                                        .getObstacleThresholdDistance(RunwaySide.LOWER_THRESHOLD),
                                                runwayObstacle.getCentreLineDistance(),
                                                runwayObstacle.getObstacle()));
                                break;
                            }
                            case LOWER_THRESHOLD: {
                                runwaySelection.getSelectedRunway().getLowerThreshold()
                                        .setRunwayObstacle(runwayObstacle);
                                runwaySelection.getSelectedRunway().getHigherThreshold().setRunwayObstacle(
                                        new RunwayObstacle(
                                                runwaySelection.getSelectedRunway().getDynamicLengthCalculator()
                                                        .getObstacleThresholdDistance(RunwaySide.HIGHER_THRESHOLD),
                                                runwayObstacle.getCentreLineDistance(),
                                                runwayObstacle.getObstacle()));

                                break;
                            }
                            default: {
                                throw new IllegalArgumentException("Threshold must be higher or lower.");
                            }
                        }

                        runwaySelection.notifyUpdate();

                        displayPopUpFrame.close();
                    }
                    break;
                }
                case AssignObstaclePanel.CANCEL_BUTTON_COMMAND: {
                    assignObstaclePanel.setVisible(false);
                    displayPopUpFrame.close();

                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unhandled command input.");
                }
            }
        }
    }

}
