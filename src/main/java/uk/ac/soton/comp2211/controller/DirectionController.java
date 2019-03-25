package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;
import uk.ac.soton.comp2211.view.south.southsouth.DirectionPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DirectionController implements ActionListener {

    private RunwaySelection runwaySelection;

    public DirectionController(RunwaySelection runwaySelection) {
        this.runwaySelection = runwaySelection;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (runwaySelection.hasSelectedRunway()) {

            PhysicalRunway runway = runwaySelection.getSelectedRunway();

            switch (e.getActionCommand()) {

                case DirectionPanel.FROM_LOWER_COMMAND: {
                    runway.setRunwayDirection(RunwaySide.LOWER_THRESHOLD);
                    runwaySelection.notifyUpdate();
                    break;
                }
                case DirectionPanel.FROM_HIGHER_COMMAND: {
                    runway.setRunwayDirection(RunwaySide.HIGHER_THRESHOLD);
                    runwaySelection.notifyUpdate();
                    break;
                }
                default: {
                    throw new UnsupportedOperationException("Cannot process action command " + e.getActionCommand());
                }
            }

        }

    }
}
