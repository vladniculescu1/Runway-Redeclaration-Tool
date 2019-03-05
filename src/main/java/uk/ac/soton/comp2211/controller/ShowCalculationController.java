package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.modal.ShowCalculationFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowCalculationController implements ActionListener {
    private ShowCalculationFrame showCalculationFrame;
    private MainFrame mainFrame;

    public ShowCalculationController() {
        this.showCalculationFrame = new ShowCalculationFrame(mainFrame);

    }

    public void addMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
