package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.south.southNorth.VisibleDistancesPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VisibleDistancesController implements ActionListener {

    private RunwaySelection runwaySelection;
    private DrawExecutor drawExecutor;



    public VisibleDistancesController(RunwaySelection runwaySelection, DrawExecutor drawExecutor) {
        this.runwaySelection = runwaySelection;
        this.drawExecutor = drawExecutor;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (runwaySelection.hasSelectedRunway()) {
            switch (e.getActionCommand()) {
                case VisibleDistancesPanel.SELECT_LDA_COMMAND: {
                    this.drawExecutor.removeDrawer(new LdaDrawer());
                    runwaySelection.notifyUpdate();
                    break;
                }
                case VisibleDistancesPanel.SELECT_TODA_COMMAND: {
                    this.drawExecutor.addDrawer(new TodaDrawer());
                    runwaySelection.notifyUpdate();
                    break;
                }
                case VisibleDistancesPanel.SELECT_ASDA_COMMAND: {
                    this.drawExecutor.addDrawer(new AsdaDrawer());
                    runwaySelection.notifyUpdate();
                    break;
                }
                case VisibleDistancesPanel.SELECT_TORA_COMMAND: {
                    this.drawExecutor.addDrawer(new ToraDrawer());
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
