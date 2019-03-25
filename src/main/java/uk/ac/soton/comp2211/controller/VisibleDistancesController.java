package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.south.southNorth.VisibleDistancesPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VisibleDistancesController implements ActionListener {

    private RunwaySelection runwaySelection;
    private DrawExecutor topDownDrawExecutor;
    private DrawExecutor sideOnDrawExecutor;

    private JCheckBox LDACheckbox;
    private JCheckBox TODACheckbox;
    private JCheckBox ASDACheckbox;
    private JCheckBox TORACheckbox;


    public VisibleDistancesController(RunwaySelection runwaySelection, DrawExecutor topDownDrawExecutor, DrawExecutor sideOnDrawExecutor) {
        this.runwaySelection = runwaySelection;
        this.topDownDrawExecutor = topDownDrawExecutor;
        this.sideOnDrawExecutor = sideOnDrawExecutor;
    }

    public void setLDACheckbox(JCheckBox LDACheckbox) {
        this.LDACheckbox = LDACheckbox;
    }

    public void setTODACheckbox(JCheckBox TODACheckbox) {
        this.TODACheckbox = TODACheckbox;
    }

    public void setASDACheckbox(JCheckBox ASDACheckbox) {
        this.ASDACheckbox = ASDACheckbox;
    }

    public void setTORACheckbox(JCheckBox TORACheckbox) {
        this.TORACheckbox = TORACheckbox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (runwaySelection.hasSelectedRunway()) {
            switch (e.getActionCommand()) {
                case VisibleDistancesPanel.CHANGE_SELECTED: {
                    if(ASDACheckbox.isSelected()){
                        this.topDownDrawExecutor.addDrawer(new AsdaDrawer());
                        this.sideOnDrawExecutor.addDrawer(new AsdaDrawer());
                    }else{
                        this.topDownDrawExecutor.removeDrawerByClass(new AsdaDrawer().getClass());
                        this.sideOnDrawExecutor.removeDrawerByClass(new AsdaDrawer().getClass());
                    }
                    if(TORACheckbox.isSelected()){
                        this.topDownDrawExecutor.addDrawer(new ToraDrawer());
                        this.sideOnDrawExecutor.addDrawer(new ToraDrawer());
                    }else{
                        this.topDownDrawExecutor.removeDrawerByClass(new ToraDrawer().getClass());
                        this.sideOnDrawExecutor.removeDrawerByClass(new ToraDrawer().getClass());
                    }
                    if(TODACheckbox.isSelected()){
                        this.topDownDrawExecutor.addDrawer(new TodaDrawer());
                        this.sideOnDrawExecutor.addDrawer(new TodaDrawer());
                    }else{
                        this.topDownDrawExecutor.removeDrawerByClass(new TodaDrawer().getClass());
                        this.sideOnDrawExecutor.removeDrawerByClass(new TodaDrawer().getClass());
                    }
                    if(LDACheckbox.isSelected()){
                        this.topDownDrawExecutor.addDrawer(new LdaDrawer());
                        this.sideOnDrawExecutor.addDrawer(new LdaDrawer());
                    }else {
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
