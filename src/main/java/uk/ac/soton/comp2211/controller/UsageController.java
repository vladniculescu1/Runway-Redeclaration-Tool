package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwayMode;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.south.UsagePanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UsageController implements ActionListener {

    private RunwaySelection runwaySelection;

    public UsageController(RunwaySelection runwaySelection) {
        this.runwaySelection = runwaySelection;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (runwaySelection.hasSelectedRunway()) {

            PhysicalRunway runway = runwaySelection.getSelectedRunway();

            switch (e.getActionCommand()) {

                case UsagePanel.LANDING_COMMAND: {
                    runway.setRunwayMode(RunwayMode.LANDING);
                    break;
                }
                case UsagePanel.TAKEOFF_COMMAND: {
                    runway.setRunwayMode(RunwayMode.TAKEOFF);
                    break;
                }
                default: {
                    throw new UnsupportedOperationException("Cannot process action command " + e.getActionCommand());
                }
            }

        }

    }
}
