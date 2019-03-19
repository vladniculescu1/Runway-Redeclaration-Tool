package uk.ac.soton.comp2211.view.south.southNorth;

import org.painlessgridbag.PainlessGridBag;
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

    private RunwaySelection runwaySelection;

    public VisibleDistancesPanel(RunwaySelection runwaySelection, ActionListener visibleDistancesController) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;

        this.setBorder(BorderFactory.createTitledBorder("Visible Distances"));

        LDACheckbox = new JCheckBox("LDA");
        LDACheckbox.setMnemonic(KeyEvent.VK_L);
        LDACheckbox.setSelected(true);
        LDACheckbox.setActionCommand(SELECT_LDA_COMMAND);
        LDACheckbox.addActionListener(visibleDistancesController);

        TODACheckbox = new JCheckBox("TODA");
        TODACheckbox.setMnemonic(KeyEvent.VK_D);
        TODACheckbox.setSelected(true);
        TODACheckbox.setActionCommand(SELECT_TODA_COMMAND);
        TODACheckbox.addActionListener(visibleDistancesController);

        ASDACheckbox = new JCheckBox("ASDA");
        ASDACheckbox.setMnemonic(KeyEvent.VK_A);
        ASDACheckbox.setSelected(true);
        ASDACheckbox.setActionCommand(SELECT_ASDA_COMMAND);
        ASDACheckbox.addActionListener(visibleDistancesController);

        TORACheckbox = new JCheckBox("TORA");
        TORACheckbox.setMnemonic(KeyEvent.VK_R);
        TORACheckbox.setSelected(true);
        TORACheckbox.setActionCommand(SELECT_TORA_COMMAND);
        TORACheckbox.addActionListener(visibleDistancesController);

        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(LDACheckbox);
        checkBoxPanel.add(TODACheckbox);
        checkBoxPanel.add(ASDACheckbox);
        checkBoxPanel.add(TORACheckbox);

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(checkBoxPanel).fillX();
        gridBag.done();
    }

    @Override
    public void notifyUpdate() {

    }
}
