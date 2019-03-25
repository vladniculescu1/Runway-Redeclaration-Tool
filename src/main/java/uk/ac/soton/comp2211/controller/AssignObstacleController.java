package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.model.Notification;
import uk.ac.soton.comp2211.model.ObstacleStorage;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;
import uk.ac.soton.comp2211.view.east.ObstaclePanel;
import uk.ac.soton.comp2211.view.modal.AssignObstaclePanel;
import uk.ac.soton.comp2211.view.modal.DisplayPopUpFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

public class AssignObstacleController implements ActionListener {

    private RunwaySelection runwaySelection;
    private DisplayPopUpFrame displayPopUpFrame;
    private AssignObstaclePanel assignObstaclePanel;
    private ObstacleStorage obstacleStorage;
    private Notification notification;

    private boolean ignoreActions = false;
    
    /**
     * Creates this AssignObstacleController.
     *
     * @param runwaySelection selection of the current runway
     * @param obstacleStorage storage for predefined obstacles
     * @param notification notification displayed whenever an obstacle is added
     */
    public AssignObstacleController(RunwaySelection runwaySelection, 
            ObstacleStorage obstacleStorage, Notification notification)    {
        this.runwaySelection = runwaySelection;
        this.obstacleStorage = obstacleStorage;
        this.notification = notification;
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

                    displayPopUpFrame = new DisplayPopUpFrame("Assign Obstacle to Runway");
                    assignObstaclePanel = new AssignObstaclePanel(runwaySelection, this, obstacleStorage);
                    displayPopUpFrame.create(assignObstaclePanel);
                    break;
                }
                case ObstaclePanel.REMOVE_BUTTON_COMMAND: {
                    runwaySelection.getSelectedRunway().getHigherThreshold().removeRunwayObstacle();
                    runwaySelection.getSelectedRunway().getLowerThreshold().removeRunwayObstacle();

                    runwaySelection.notifyUpdate();
                    notification.notificationUpdate("Obstacle successfully removed");
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
                        notification.notificationUpdate("Obstacle successfully assigned");

                        displayPopUpFrame.close();
                    }
                    break;
                }
                case AssignObstaclePanel.CANCEL_BUTTON_COMMAND: {
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
