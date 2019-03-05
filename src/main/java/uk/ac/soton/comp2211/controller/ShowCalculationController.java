package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.east.DistancesPanel;
import uk.ac.soton.comp2211.view.modal.DisplayPopUpPanel;
import uk.ac.soton.comp2211.view.modal.ShowCalculationPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowCalculationController implements ActionListener {
    private String panelTitle = "Breakdown of Calculations";
    private DisplayPopUpPanel displayPopUpPanel;
    private ShowCalculationPanel showCalculationPanel;
    private MainFrame mainFrame;

    public ShowCalculationController() {
        this.displayPopUpPanel = new DisplayPopUpPanel(mainFrame, panelTitle);

    }

    public void addMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case DistancesPanel.SHOW_CALCULATION_BUTTON_COMMAND:
                showCalculationPanel = new ShowCalculationPanel();
                displayPopUpPanel.create(showCalculationPanel);
                break;
            default:
                throw new IllegalArgumentException("Unhandled command input.");
        }
    }
}
