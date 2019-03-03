package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.east.RunwayPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class RunwaySelectionController implements ActionListener {

    private RunwaySelection runwaySelection;

    public RunwaySelectionController(RunwaySelection runwaySelection) {
        this.runwaySelection = runwaySelection;
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
            default:
                throw new UnsupportedOperationException("Cannot handle action command " + e.getActionCommand());
        }
    }
}
