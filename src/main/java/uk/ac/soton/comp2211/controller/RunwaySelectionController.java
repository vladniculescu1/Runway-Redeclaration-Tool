package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.model.Airport;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.east.RunwayPanel;
import uk.ac.soton.comp2211.view.modal.AddRunwayFrame;
import uk.ac.soton.comp2211.view.modal.AddRunwayPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class RunwaySelectionController implements ActionListener {

    private RunwaySelection runwaySelection;
    private Airport airport;
    private AddRunwayPanel addRunwayPanel;
    private AddRunwayFrame addRunwayFrame;

    public RunwaySelectionController(RunwaySelection runwaySelection, Airport airport) {
        this.runwaySelection = runwaySelection;
        this.airport = airport;
    }

    public void addMainFrame(MainFrame mainFrame) {
        this.addRunwayFrame = new AddRunwayFrame(mainFrame);
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
                addRunwayFrame.create(addRunwayPanel);
                break;
            }
            case AddRunwayPanel.RUNWAY_ADD_BUTTON: {
                break;
            }
            case AddRunwayPanel.RUNWAY_CANCEL_BUTTON: {
                break;
            }
            default:
                throw new UnsupportedOperationException("Cannot handle action command " + e.getActionCommand());
        }
    }
}
