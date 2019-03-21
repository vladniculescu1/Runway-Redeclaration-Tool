package uk.ac.soton.comp2211.controller;

import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.draw.topdown.*;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.south.southNorth.VisibleDistancesPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class VisibleDistancesController implements ActionListener {

    private RunwaySelection runwaySelection;
    private List<Drawer> topDownDrawerWithoutMainDistances;
    public VisibleDistancesController(RunwaySelection runwaySelection) {
        this.runwaySelection = runwaySelection;

        topDownDrawerWithoutMainDistances = new ArrayList<>(List.of(
                new TopDownSurroundingsDrawer(), new TopDownStripDrawer(), new DirectionArrowDrawer(),
                new TopDownStopwayDrawer(), new TopDownClearwayDrawer(),
                new TopDownRunwayDrawer(), new TopDownCentreLineDrawer(), new TopDownThresholdDrawer(),
                new ResaDrawer(), new TocsDrawer(), new BlastDrawer(),
                new TopDownRunwayDrawer(), new TopDownCentreLineDrawer(), new TopDownThresholdDrawer(),
                new TopDownDesignatorDrawer(), new TopDownObstacleDrawer()
        ));
    }

    public List<Drawer> getTopDownDrawerWithoutMainDistances() {
        return topDownDrawerWithoutMainDistances;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (runwaySelection.hasSelectedRunway()) {

            switch (e.getActionCommand()) {
                case VisibleDistancesPanel.SELECT_LDA_COMMAND: {
                    getTopDownDrawerWithoutMainDistances().add(new LdaDrawer());
                    runwaySelection.notifyUpdate();
                    break;
                }
                case VisibleDistancesPanel.SELECT_TODA_COMMAND: {
                    getTopDownDrawerWithoutMainDistances().add(new TodaDrawer());
                    System.out.println("TODA");
                    runwaySelection.notifyUpdate();
                    break;
                }
                case VisibleDistancesPanel.SELECT_ASDA_COMMAND: {
                    getTopDownDrawerWithoutMainDistances().add(new AsdaDrawer());
                    System.out.println("ASDA");
                    runwaySelection.notifyUpdate();
                    break;
                }
                case VisibleDistancesPanel.SELECT_TORA_COMMAND: {
                    getTopDownDrawerWithoutMainDistances().add(new ToraDrawer());
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
