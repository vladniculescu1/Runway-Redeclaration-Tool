package uk.ac.soton.comp2211.view.south;

import org.painlessgridbag.PainlessGridBag;
import org.painlessgridbag.PainlessGridbagConfiguration;
import uk.ac.soton.comp2211.controller.VisibleDistancesController;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.Observer;

import javax.swing.*;
import java.awt.*;

public class VisibleDistancesPanel extends JPanel implements Observer {

    public static final String CHANGE_SELECTED = "Change";

    private RunwaySelection runwaySelection;

    private JCheckBox blastCheckbox;
    private JCheckBox tocsCheckbox;
    private JCheckBox resaCheckbox;
    private JCheckBox ldaCheckbox;
    private JCheckBox toraCheckbox;
    private JCheckBox todaCheckbox;
    private JCheckBox asdaCheckbox;


    /**
     * The visible distances panel. Contains the checkboxes for adding/removing visible (main) distances
     * @param runwaySelection the runway that is currently selected
     * @param visibleDistancesController controls the distances that are being displayed
     */
    public VisibleDistancesPanel(RunwaySelection runwaySelection,
                                 VisibleDistancesController visibleDistancesController) {
        runwaySelection.subscribe(this);
        this.setBorder(BorderFactory.createTitledBorder("Visible Distances"));

        this.runwaySelection = runwaySelection;

        ldaCheckbox = new JCheckBox("LDA");
        ldaCheckbox.setSelected(true);
        ldaCheckbox.setActionCommand(CHANGE_SELECTED);
        ldaCheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setLdaCheckbox(ldaCheckbox);

        toraCheckbox = new JCheckBox("TORA");
        toraCheckbox.setSelected(true);
        toraCheckbox.setActionCommand(CHANGE_SELECTED);
        toraCheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setToraCheckbox(toraCheckbox);

        asdaCheckbox = new JCheckBox("ASDA");
        asdaCheckbox.setSelected(true);
        asdaCheckbox.setActionCommand(CHANGE_SELECTED);
        asdaCheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setAsdaCheckbox(asdaCheckbox);

        todaCheckbox = new JCheckBox("TODA");
        todaCheckbox.setSelected(true);
        todaCheckbox.setActionCommand(CHANGE_SELECTED);
        todaCheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setTodaCheckbox(todaCheckbox);

        blastCheckbox = new JCheckBox("BLAST");
        blastCheckbox.setSelected(true);
        blastCheckbox.setActionCommand(CHANGE_SELECTED);
        blastCheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setBlastCheckbox(blastCheckbox);

        tocsCheckbox = new JCheckBox("TOCS");
        tocsCheckbox.setSelected(true);
        tocsCheckbox.setActionCommand(CHANGE_SELECTED);
        tocsCheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setTocsCheckbox(tocsCheckbox);

        resaCheckbox = new JCheckBox("RESA");
        resaCheckbox.setSelected(true);
        resaCheckbox.setActionCommand(CHANGE_SELECTED);
        resaCheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setResaCheckbox(resaCheckbox);

        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(ldaCheckbox);
        checkBoxPanel.add(toraCheckbox);
        checkBoxPanel.add(asdaCheckbox);
        checkBoxPanel.add(todaCheckbox);
        checkBoxPanel.add(tocsCheckbox);
        checkBoxPanel.add(resaCheckbox);
        checkBoxPanel.add(blastCheckbox);
        ((FlowLayout) checkBoxPanel.getLayout()).setVgap(5);

        PainlessGridbagConfiguration gridbagConfiguration = new PainlessGridbagConfiguration();
        gridbagConfiguration.setFirstColumnLeftSpacing(0);
        gridbagConfiguration.setLastColumnRightSpacing(0);
        gridbagConfiguration.setFirstRowTopSpacing(0);
        gridbagConfiguration.setLastRowBottomSpacing(0);

        PainlessGridBag gridBag = new PainlessGridBag(this, gridbagConfiguration,false);
        gridBag.row().cell(checkBoxPanel).fillX();
        gridBag.done();

        this.notifyUpdate();
    }

    @Override
    public void notifyUpdate() {

        if (this.runwaySelection.hasSelectedRunway()) {
            this.ldaCheckbox.setEnabled(true);
            this.toraCheckbox.setEnabled(true);
            this.todaCheckbox.setEnabled(true);
            this.asdaCheckbox.setEnabled(true);
        } else {
            this.ldaCheckbox.setEnabled(false);
            this.toraCheckbox.setEnabled(false);
            this.todaCheckbox.setEnabled(false);
            this.asdaCheckbox.setEnabled(false);
        }

        if (this.runwaySelection.hasSelectedRunway() && this.runwaySelection.getSelectedRunway().hasObstacle()) {
            this.blastCheckbox.setEnabled(true);
            this.tocsCheckbox.setEnabled(true);
            this.resaCheckbox.setEnabled(true);
        } else {
            this.blastCheckbox.setEnabled(false);
            this.tocsCheckbox.setEnabled(false);
            this.resaCheckbox.setEnabled(false);
        }

    }
}
