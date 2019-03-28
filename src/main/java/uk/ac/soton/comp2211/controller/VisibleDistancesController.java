package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.south.VisibleDistancesPanel;

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
                        this.topDownDrawExecutor.enableDrawer(AsdaDrawer.class);
                        this.sideOnDrawExecutor.enableDrawer(AsdaDrawer.class);
                    } else {
                        this.topDownDrawExecutor.disableDrawer(AsdaDrawer.class);
                        this.sideOnDrawExecutor.disableDrawer(AsdaDrawer.class);
                    }
                    if (toraCheckbox.isSelected()) {
                        this.topDownDrawExecutor.enableDrawer(ToraDrawer.class);
                        this.sideOnDrawExecutor.enableDrawer(ToraDrawer.class);
                    } else {
                        this.topDownDrawExecutor.disableDrawer(ToraDrawer.class);
                        this.sideOnDrawExecutor.disableDrawer(ToraDrawer.class);
                    }
                    if (todaCheckbox.isSelected()) {
                        this.topDownDrawExecutor.enableDrawer(TodaDrawer.class);
                        this.sideOnDrawExecutor.enableDrawer(TodaDrawer.class);
                    } else {
                        this.topDownDrawExecutor.disableDrawer(TodaDrawer.class);
                        this.sideOnDrawExecutor.disableDrawer(TodaDrawer.class);
                    }
                    if (ldaCheckbox.isSelected()) {
                        this.topDownDrawExecutor.enableDrawer(LdaDrawer.class);
                        this.sideOnDrawExecutor.enableDrawer(LdaDrawer.class);
                    } else {
                        this.topDownDrawExecutor.disableDrawer(LdaDrawer.class);
                        this.sideOnDrawExecutor.disableDrawer(LdaDrawer.class);
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
