package uk.ac.soton.comp2211.view.south.southNorth;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.controller.VisibleDistancesController;
import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.Observer;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class VisibleDistancesPanel extends JPanel implements Observer {

    private JCheckBox LDACheckbox;
    private JCheckBox TODACheckbox;
    private JCheckBox ASDACheckbox;
    private JCheckBox TORACheckbox;

    public static final String SELECT_LDA_COMMAND = "Select-LDA";
    public static final String SELECT_TODA_COMMAND = "Select-TODA";
    public static final String SELECT_ASDA_COMMAND = "Select-ASDA";
    public static final String SELECT_TORA_COMMAND = "Select-TORA";
    public static final String CHANGE_SELECTED = "Change";

    private RunwaySelection runwaySelection;

    public VisibleDistancesPanel(RunwaySelection runwaySelection, VisibleDistancesController visibleDistancesController) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;

        this.setBorder(BorderFactory.createTitledBorder("Visible Distances"));

        LDACheckbox = new JCheckBox("LDA");
        LDACheckbox.setSelected(true);
        LDACheckbox.setActionCommand(CHANGE_SELECTED);
        LDACheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setLDACheckbox(LDACheckbox);

        TORACheckbox = new JCheckBox("TORA");
        TORACheckbox.setSelected(true);
        TORACheckbox.setActionCommand(CHANGE_SELECTED);
        TORACheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setTORACheckbox(TORACheckbox);

        ASDACheckbox = new JCheckBox("ASDA");
        ASDACheckbox.setSelected(true);
        ASDACheckbox.setActionCommand(CHANGE_SELECTED);
        ASDACheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setASDACheckbox(ASDACheckbox);

        TODACheckbox = new JCheckBox("TODA");
        TODACheckbox.setSelected(true);
        TODACheckbox.setActionCommand(CHANGE_SELECTED);
        TODACheckbox.addActionListener(visibleDistancesController);
        visibleDistancesController.setTODACheckbox(TODACheckbox);



        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(LDACheckbox);
        checkBoxPanel.add(TORACheckbox);
        checkBoxPanel.add(ASDACheckbox);
        checkBoxPanel.add(TODACheckbox);

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(checkBoxPanel).fillX();
        gridBag.done();
    }

    @Override
    public void notifyUpdate() {

    }
}
