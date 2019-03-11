package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.model.Airport;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.east.RunwayPanel;
import uk.ac.soton.comp2211.view.modal.DisplayPopUpFrame;
import uk.ac.soton.comp2211.view.modal.AddRunwayPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.Optional;

public class RunwaySelectionController implements ActionListener {

    private RunwaySelection runwaySelection;
    private Airport airport;
    private AddRunwayPanel addRunwayPanel;
    private DisplayPopUpFrame displayPopUpFrame;

    /**
     * Constructor for this RunwaySelectionController.
     * @param runwaySelection The application's runwaySelection variable.
     * @param airport The application's airport variable.
     */
    public RunwaySelectionController(RunwaySelection runwaySelection, Airport airport) {
        this.runwaySelection = runwaySelection;
        this.airport = airport;
        this.displayPopUpFrame = new DisplayPopUpFrame("Add Runway");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {

            case RunwayPanel.COMBOBOX_COMMAND: {

                JComboBox runwayComboBox = (JComboBox) e.getSource();
                PhysicalRunway selectedRunway = (PhysicalRunway) runwayComboBox.getSelectedItem();

                runwaySelection.setSelectedRunway(selectedRunway);
                runwaySelection.notifyUpdate();

                break;
            }
            case RunwayPanel.ADD_RUNWAY_COMMAND: {
                addRunwayPanel = new AddRunwayPanel(this);
                displayPopUpFrame.create(addRunwayPanel);
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
