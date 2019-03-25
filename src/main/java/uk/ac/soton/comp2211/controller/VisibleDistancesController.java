package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.south.southnorth.VisibleDistancesPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VisibleDistancesController implements ActionListener {

    private RunwaySelection runwaySelection;
    private DrawExecutor topDownDrawExecutor;
    private DrawExecutor sideOnDrawExecutor;

    private JCheckBox ldaCheckbox;
    private JCheckBox todaCheckbox;
    private JCheckBox asdaCheckbox;
    private JCheckBox toraCheckbox;

    /**
     * The controller for displaying visible distances.
     * @param runwaySelection the runway that is currently selected
     * @param topDownDrawExecutor the top down draw executor
     * @param sideOnDrawExecutor the side on draw executor
     */
    public VisibleDistancesController(RunwaySelection runwaySelection, DrawExecutor topDownDrawExecutor,
                                      DrawExecutor sideOnDrawExecutor) {
        this.runwaySelection = runwaySelection;
        this.topDownDrawExecutor = topDownDrawExecutor;
        this.sideOnDrawExecutor = sideOnDrawExecutor;
    }

    public void setLdaCheckbox(JCheckBox ldaCheckbox) {
        this.ldaCheckbox = ldaCheckbox;
    }

    public void setTodaCheckbox(JCheckBox todaCheckbox) {
        this.todaCheckbox = todaCheckbox;
    }

    public void setAsdaCheckbox(JCheckBox asdaCheckbox) {
        this.asdaCheckbox = asdaCheckbox;
    }

    public void setToraCheckbox(JCheckBox toraCheckbox) {
        this.toraCheckbox = toraCheckbox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (runwaySelection.hasSelectedRunway()) {
            switch (e.getActionCommand()) {
                case VisibleDistancesPanel.CHANGE_SELECTED: {
                    if (asdaCheckbox.isSelected()) {
                        this.topDownDrawExecutor.addDrawer(new AsdaDrawer());
                        this.sideOnDrawExecutor.addDrawer(new AsdaDrawer());
                    } else {
                        this.topDownDrawExecutor.removeDrawerByClass(new AsdaDrawer().getClass());
                        this.sideOnDrawExecutor.removeDrawerByClass(new AsdaDrawer().getClass());
                    }
                    if (toraCheckbox.isSelected()) {
                        this.topDownDrawExecutor.addDrawer(new ToraDrawer());
                        this.sideOnDrawExecutor.addDrawer(new ToraDrawer());
                    } else {
                        this.topDownDrawExecutor.removeDrawerByClass(new ToraDrawer().getClass());
                        this.sideOnDrawExecutor.removeDrawerByClass(new ToraDrawer().getClass());
                    }
                    if (todaCheckbox.isSelected()) {
                        this.topDownDrawExecutor.addDrawer(new TodaDrawer());
                        this.sideOnDrawExecutor.addDrawer(new TodaDrawer());
                    } else {
                        this.topDownDrawExecutor.removeDrawerByClass(new TodaDrawer().getClass());
                        this.sideOnDrawExecutor.removeDrawerByClass(new TodaDrawer().getClass());
                    }
                    if (ldaCheckbox.isSelected()) {
                        this.topDownDrawExecutor.addDrawer(new LdaDrawer());
                        this.sideOnDrawExecutor.addDrawer(new LdaDrawer());
                    } else {
                        this.topDownDrawExecutor.removeDrawerByClass(new LdaDrawer().getClass());
                        this.sideOnDrawExecutor.removeDrawerByClass(new LdaDrawer().getClass());
                    }
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
