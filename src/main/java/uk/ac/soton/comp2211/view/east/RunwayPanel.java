package uk.ac.soton.comp2211.view.east;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.controller.RunwaySelectionController;
import uk.ac.soton.comp2211.model.Airport;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;

import javax.swing.*;

/**
 * This panel contains the settings for the runway. The user can select a runway from a dropdown list, add a
 * runway or delete a runway.
 */
public class RunwayPanel extends JPanel implements Observer {

    private DefaultComboBoxModel<PhysicalRunway> runwayComboBoxModel;

    private JComboBox<PhysicalRunway> runwayComboBox;
    private JButton removeButton;

    public static final String COMBOBOX_COMMAND = "runwayComboBox";
    public static final String ADD_RUNWAY_COMMAND = "runwayAddCommand";
    public static final String REMOVE_RUNWAY_COMMAND = "runwayRemoveCommand";

    private Airport airport;
    private RunwaySelection runwaySelection;

    /**
     * Constructs a new runway panel.
     * @param airport the airport that the runway is at
     * @param runwaySelection the current runway selection - the model
     * @param runwaySelectionController the controller reacting to user inputs
     */
    public RunwayPanel(Airport airport, RunwaySelection runwaySelection,
                       RunwaySelectionController runwaySelectionController) {
        this.runwaySelection = runwaySelection;
        runwaySelection.subscribe(this);
        this.airport = airport;
        airport.subscribe(this);

        this.setBorder(BorderFactory.createTitledBorder("Runway"));

        runwayComboBoxModel = new DefaultComboBoxModel<>();
        runwayComboBox = new JComboBox<>(runwayComboBoxModel);
        runwayComboBox.setActionCommand(COMBOBOX_COMMAND);
        runwayComboBox.addActionListener(runwaySelectionController);

        JButton addButton = new JButton("Add Runway");
        addButton.setActionCommand(ADD_RUNWAY_COMMAND);
        addButton.addActionListener(runwaySelectionController);

        removeButton = new JButton("Remove Runway");
        removeButton.setActionCommand(REMOVE_RUNWAY_COMMAND);
        removeButton.addActionListener(runwaySelectionController);

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cellX(runwayComboBox,2).fillX();
        gridBag.row().cell(addButton).fillX().cell(removeButton).fillX();
        runwaySelectionController.addRunwayComboBox(runwayComboBox);

        gridBag.done();

        this.notifyUpdate();

    }

    @Override
    public void notifyUpdate() {

        if (this.airport.getRunways().size() > 0) {
            this.runwayComboBox.setEnabled(true);
        } else {
            this.runwayComboBox.setEnabled(false);
        }

        this.airport.getRunways().forEach(runway -> {
            // only add runway to combobox if it is not already in the combo box
            if (this.runwayComboBoxModel.getIndexOf(runway) == -1) {
                this.runwayComboBox.addItem(runway);
            }
        });

        if (runwaySelection.hasSelectedRunway()) {
            this.runwayComboBox.setSelectedItem(runwaySelection.getSelectedRunway());
            removeButton.setEnabled(true);
        } else {
            removeButton.setEnabled(false);

        }
    }
}
