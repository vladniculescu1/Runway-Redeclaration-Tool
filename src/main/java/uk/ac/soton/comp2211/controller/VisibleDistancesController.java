package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.Application;
import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.draw.topdown.*;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.center.DisplayTabbedPane;
import uk.ac.soton.comp2211.view.south.southNorth.VisibleDistancesPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


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
                    this.drawExecutor.addDrawer(new LdaDrawer());

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
