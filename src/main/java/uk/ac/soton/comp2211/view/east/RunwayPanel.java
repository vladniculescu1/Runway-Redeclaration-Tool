package uk.ac.soton.comp2211.view.east;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.model.Airport;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This panel contains the settings for the runway. The user can select a runway from a dropdown list, add a
 * runway or delete a runway.
 */
public class RunwayPanel extends JPanel implements Observer {

    private DefaultComboBoxModel<PhysicalRunway> runwayComboBoxModel;

    private JComboBox<PhysicalRunway> runwayComboBox;

    public static final String COMBOBOX_COMMAND = "runwayComboBox";
    public static final String ADD_RUNWAY_COMMAND = "runwayAddCommand";

    private Airport airport;
    private RunwaySelection runwaySelection;

    /**
     * Constructs a new runway panel.
     * @param airport the airport that the runway is at
     * @param runwaySelection the current runway selection - the model
     * @param runwaySelectionController the controller reacting to user inputs
     */
    public RunwayPanel(Airport airport, RunwaySelection runwaySelection, ActionListener runwaySelectionController) {
        this.runwaySelection = runwaySelection;
        runwaySelection.subscribe(this);
        this.airport = airport;
        airport.subscribe(this);

        this.setBorder(BorderFactory.createTitledBorder("Runway"));

        runwayComboBoxModel = new DefaultComboBoxModel<>();
        runwayComboBox = new JComboBox<>(runwayComboBoxModel);
        runwayComboBox.setActionCommand(COMBOBOX_COMMAND);
        runwayComboBox.addActionListener(runwaySelectionController);

        JButton addButton = new JButton("Add");
        addButton.setActionCommand(ADD_RUNWAY_COMMAND);
        addButton.addActionListener(runwaySelectionController);

        JButton removeButton = new JButton("Remove");
        // disable remove button
        removeButton.setEnabled(false);

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cellX(runwayComboBox,2).fillX();
        gridBag.row().cell(addButton).fillX().cell(removeButton).fillX();

        gridBag.done();

        this.notifyUpdate();

    }

    @Override
    public void notifyUpdate() {
        this.airport.getRunways().forEach(runway -> {
            // only add runway to combobox if it is not already in the combo box
            if (this.runwayComboBoxModel.getIndexOf(runway) == -1) {
                this.runwayComboBox.addItem(runway);
            }
        });
        if (runwaySelection.hasSelectedRunway()) {
            this.runwayComboBox.setSelectedItem(runwaySelection.getSelectedRunway());
        }
    }
}
