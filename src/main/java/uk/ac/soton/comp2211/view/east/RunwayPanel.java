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

    private JComboBox runwaySelector;

    private RunwaySelection runwaySelection;
    private Airport airport;

    /**
     * Constructs a new runway panel.
     * @param airport the airport that the runway is at
     * @param runwaySelection the current runway selection - the model
     * @param runwaySelectionController the controller reacting to user inputs
     */
    public RunwayPanel(Airport airport, RunwaySelection runwaySelection, ActionListener runwaySelectionController) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;
        this.airport = airport;
        airport.subscribe(this);

        this.setBorder(BorderFactory.createTitledBorder("Runway"));

        runwaySelector = new JComboBox();

        JButton doit = new JButton("Add");
        JButton doit2 = new JButton("Remove");

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cellX(runwaySelector,2).fillX();
        gridBag.row().cell(doit).cell(doit2).fillX();

        gridBag.done();

        this.notifyUpdate();

    }

    @Override
    public void notifyUpdate() {
        this.airport.getRunways().forEach(runway -> {
            this.runwaySelector.addItem(runway);
        });

    }
}
