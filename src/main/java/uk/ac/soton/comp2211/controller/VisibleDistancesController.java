package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.Main;
import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.south.southNorth.VisibleDistancesPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


//public class VisibleDistancesController implements ActionListener {
public class VisibleDistancesController implements ActionListener {

    private RunwaySelection runwaySelection;

    public VisibleDistancesController(RunwaySelection runwaySelection) {
        this.runwaySelection = runwaySelection;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (runwaySelection.hasSelectedRunway()) {

            switch (e.getActionCommand()) {
                case VisibleDistancesPanel.SELECT_LDA_COMMAND: {
                    System.out.println("LDA");
                    runwaySelection.notifyUpdate();
                    break;
                }
                case VisibleDistancesPanel.SELECT_TODA_COMMAND: {
                    System.out.println("TORA");
                    runwaySelection.notifyUpdate();
                    break;
                }
                case VisibleDistancesPanel.SELECT_ASDA_COMMAND: {
                    System.out.println("ASDA");
                    List<Drawer> topDownDrawer = List.of();
                    runwaySelection.notifyUpdate();
                    break;
                }
                case VisibleDistancesPanel.SELECT_TORA_COMMAND: {
                    System.out.println("TORA");
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
