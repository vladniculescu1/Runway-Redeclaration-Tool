package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.south.southNorth.VisibleDistancesPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//public class VisibleDistancesController implements ActionListener {
public class VisibleDistancesController implements ActionListener {

    private RunwaySelection runwaySelection;
    private LdaDrawer ldaDrawer;

    public VisibleDistancesController(RunwaySelection runwaySelection) {
        this.runwaySelection = runwaySelection;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (runwaySelection.hasSelectedRunway()) {

            switch (e.getActionCommand()) {
                case VisibleDistancesPanel.SELECT_LDA_COMMAND: {
                    ldaDrawer.setGlobalLDAFlag(!ldaDrawer.getGlobalLDAFlag());
                    runwaySelection.notifyUpdate();
                    break;
                }
//                case VisibleDistancesPanel.SELECT_TODA_COMMAND: {
//                    todaDrawer.setGlobalTODAFlag(!todaDrawer.getGlobalTODAFlag());
//                    runwaySelection.notifyUpdate();
//                    break;
//                }
//                case VisibleDistancesPanel.SELECT_ASDA_COMMAND: {
//                    asdaDrawer.setGlobalASDAFlag(!asdaDrawer.getGlobalASDAFlag());
//                    runwaySelection.notifyUpdate();
//                    break;
//                }
//                case VisibleDistancesPanel.SELECT_TORA_COMMAND: {
//                    toraDrawer.setGlobalTORAFlag(!toraDrawer.getGlobalTORAFlag());
//                    runwaySelection.notifyUpdate();
//                    break;
//                }
                default: {
                    throw new UnsupportedOperationException("Cannot process action command " + e.getActionCommand());
                }

            }
        }

    }

}
