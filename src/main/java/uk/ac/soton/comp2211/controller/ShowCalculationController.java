package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;
import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.east.DistancesPanel;
import uk.ac.soton.comp2211.view.modal.DisplayPopUpFrame;
import uk.ac.soton.comp2211.view.modal.ShowCalculationPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowCalculationController implements ActionListener {
    private String panelTitle = "Breakdown of Calculations";
    private DisplayPopUpFrame displayPopUpFrame;
    private ShowCalculationPanel showCalculationPanel;
    private RunwaySelection runwaySelection;
    private MainFrame mainFrame;
    private JTable lowerTable;
    private JTable higherTable;

    public ShowCalculationController(RunwaySelection runwaySelection) {
        this.runwaySelection = runwaySelection;
        this.displayPopUpFrame = new DisplayPopUpFrame(mainFrame, panelTitle);
    }

    public void setLowerTable(JTable lowerTable) {
        this.lowerTable = lowerTable;
    }

    public void setHigherTable(JTable higherTable) {
        this.higherTable = higherTable;
    }

    public void addMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case DistancesPanel.SHOW_CALCULATION_BUTTON_COMMAND_LOWER:
                showCalculationPanel = new ShowCalculationPanel(runwaySelection.getSelectedRunway(), lowerTable.getSelectedRow(), RunwaySide.LOWER_THRESHOLD);
                displayPopUpFrame.create(showCalculationPanel);
                break;
            case DistancesPanel.SHOW_CALCULATION_BUTTON_COMMAND_HIGHER:
                showCalculationPanel = new ShowCalculationPanel(runwaySelection.getSelectedRunway(), higherTable.getSelectedRow(), RunwaySide.HIGHER_THRESHOLD);
                displayPopUpFrame.create(showCalculationPanel);
                break;
            default:
                throw new IllegalArgumentException("Unhandled command input.");
        }
    }
}
