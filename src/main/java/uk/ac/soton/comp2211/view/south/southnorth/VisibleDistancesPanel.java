package uk.ac.soton.comp2211.view.south.southnorth;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.controller.VisibleDistancesController;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.Observer;

import javax.swing.*;

public class VisibleDistancesPanel extends JPanel implements Observer {

    private JCheckBox ldaCheckbox;
    private JCheckBox todaCheckbox;
    private JCheckBox asdaCheckbox;
    private JCheckBox toraCheckbox;

    public static final String CHANGE_SELECTED = "Change";

    private RunwaySelection runwaySelection;

    /**
     * The visible distances panel. Contains the checkboxes for adding/removing visible (main) distances
     * @param runwaySelection the runway that is currently selected
     * @param visibleDistancesController controls the distances that are being displayed
     */
    public VisibleDistancesPanel(RunwaySelection runwaySelection,
                                 VisibleDistancesController visibleDistancesController) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;

        this.setBorder(BorderFactory.createTitledBorder("Visible Distances"));

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

        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(ldaCheckbox);
        checkBoxPanel.add(toraCheckbox);
        checkBoxPanel.add(asdaCheckbox);
        checkBoxPanel.add(todaCheckbox);

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(checkBoxPanel).fillX();
        gridBag.done();
    }

    @Override
    public void notifyUpdate() {

    }
}
