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
        JComboBox test = (JComboBox) e.getSource();
//        runwaySelection.setSelectedRunway(test.getItemAt(test.getSelectedIndex()));
        System.out.println(test.getItemAt(test.getSelectedIndex()));
    }
}
