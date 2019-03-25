package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.model.Airport;
import uk.ac.soton.comp2211.model.Notification;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.east.RunwayPanel;
import uk.ac.soton.comp2211.view.modal.AddRunwayPanel;
import uk.ac.soton.comp2211.view.modal.DisplayPopUpFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;

public class RunwaySelectionController implements ActionListener {

    private RunwaySelection runwaySelection;
    private Airport airport;
    private AddRunwayPanel addRunwayPanel;
    private JComboBox runwayComboBox;
    private DisplayPopUpFrame displayPopUpFrame;
    private Notification notification;

    private boolean suppressEvents = false;

    /**
     * Constructor for this RunwaySelectionController.
     * @param runwaySelection The application's runwaySelection variable.
     * @param airport The application's airport variable.
     * @param notification notification displayed whenever an obstacle is added
     */
    public RunwaySelectionController(RunwaySelection runwaySelection, Airport airport,
            Notification notification) {
        this.runwaySelection = runwaySelection;
        this.airport = airport;
        this.notification = notification;
    }

    public void addRunwayComboBox(JComboBox runwayComboBox) {
        this.runwayComboBox = runwayComboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!suppressEvents) {
            switch (e.getActionCommand()) {

                case RunwayPanel.COMBOBOX_COMMAND: {

                    JComboBox runwayComboBox = (JComboBox) e.getSource();
                    PhysicalRunway selectedRunway = (PhysicalRunway) runwayComboBox.getSelectedItem();

                    runwaySelection.setSelectedRunway(selectedRunway);
                    runwaySelection.notifyUpdate();

                    break;
                }
                case RunwayPanel.ADD_RUNWAY_COMMAND: {
                    displayPopUpFrame = new DisplayPopUpFrame("Add Runway");
                    addRunwayPanel = new AddRunwayPanel(this);
                    displayPopUpFrame.create(addRunwayPanel);
                    break;
                }
                case RunwayPanel.REMOVE_RUNWAY_COMMAND: {
                    //show are you sure
                    if (JOptionPane.showConfirmDialog(null,
                                "Are you sure you want to remove the runway?","Remove?",
                                JOptionPane.YES_NO_OPTION)
                            == JOptionPane.YES_OPTION) {
                        PhysicalRunway removedRunway = runwaySelection.getSelectedRunway();
                        airport.removeRunway(removedRunway);
                        //change combobox selected runway and remove
                        suppressEvents = true;
                        runwayComboBox.removeItem(removedRunway);
                        suppressEvents = false;
                        if (runwayComboBox.getItemCount() != 0) {
                            runwaySelection.setSelectedRunway((PhysicalRunway) runwayComboBox.getSelectedItem());
                        } else {
                            runwaySelection.removeSelectedRunway();
                        }
                        runwaySelection.notifyUpdate();
                        notification.notificationUpdate("Runway successfully removed");
                    }
                    break;
                }
                case AddRunwayPanel.RUNWAY_ADD_BUTTON: {
                    Optional<PhysicalRunway> runwayOptional = addRunwayPanel.getRunwayFromInputs();
                    if (runwayOptional.isPresent()) {
                        if (airport.getRunways().contains(runwayOptional.get())) {
                            JOptionPane.showMessageDialog(addRunwayPanel,
                                    "A runway with the same heading and location already exists.");
                        } else {
                            PhysicalRunway physicalRunway = runwayOptional.get();
                            airport.addRunway(physicalRunway);
                            runwaySelection.setSelectedRunway(physicalRunway);
                            runwaySelection.notifyUpdate();
                            displayPopUpFrame.close();
                            notification.notificationUpdate("Runway successfully assigned");
                        }

                    }
                    break;
                }
                case AddRunwayPanel.RUNWAY_CANCEL_BUTTON: {
                    displayPopUpFrame.close();
                    break;
                }
                default:
                    throw new UnsupportedOperationException("Cannot handle action command " + e.getActionCommand());
            }
        }
    }
}
