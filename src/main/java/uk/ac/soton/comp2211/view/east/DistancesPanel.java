package uk.ac.soton.comp2211.view.east;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.controller.ShowCalculationController;
import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * This panel shows both the original runway distances and the re-calculated runway distances to the user.
 */
public class DistancesPanel extends JPanel implements Observer {

    public static final String SHOW_CALCULATION_BUTTON_COMMAND_LOWER = "showCalculationButtonLower";
    public static final String SHOW_CALCULATION_BUTTON_COMMAND_HIGHER = "showCalculationButtonHigher";

    private RunwaySelection runwaySelection;

    private JLabel higherPanelLabel;
    private DefaultTableModel higherTableModel;

    private JLabel lowerPanelLabel;
    private DefaultTableModel lowerTableModel;

    private JButton showCalculationLower;
    private JButton showCalculationHigher;
    
    /**
     * Constructs a new distances panel.
     * @param runwaySelection The runway selection
     * @param showCalculationController controller for button clicks
     */
    public DistancesPanel(RunwaySelection runwaySelection, ShowCalculationController showCalculationController) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;

        String[] header = {"Parameter", "Original", "Re-Calc"};

        this.lowerPanelLabel = new JLabel("Lower threshold");
        this.higherPanelLabel = new JLabel("Higher threshold");
        this.showCalculationLower = new JButton("Show Calculation");
        this.showCalculationHigher = new JButton("Show Calculation");

        this.lowerTableModel = new DefaultTableModel(header, 4) {
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };

        this.higherTableModel = new DefaultTableModel(header, 4) {
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };

        JTable lowerTable = new JTable(this.lowerTableModel);
        lowerTable.setRowSelectionAllowed(true);
        lowerTable.getTableHeader().setFont(this.getFont());
        lowerTable.setFont(this.getFont());


        JTable higherTable = new JTable(this.higherTableModel);
        higherTable.setRowSelectionAllowed(true);
        higherTable.getTableHeader().setFont(this.getFont());
        higherTable.setFont(this.getFont());

        JPanel lowerPanel = new JPanel(new BorderLayout());
        lowerPanel.add(lowerTable,BorderLayout.CENTER);
        lowerPanel.add(lowerTable.getTableHeader(),BorderLayout.NORTH);

        JPanel higherPanel = new JPanel(new BorderLayout());
        higherPanel.add(higherTable,BorderLayout.CENTER);
        higherPanel.add(higherTable.getTableHeader(),BorderLayout.NORTH);

        showCalculationController.setLowerTable(lowerTable);
        showCalculationController.setHigherTable(higherTable);

        showCalculationLower.setActionCommand(SHOW_CALCULATION_BUTTON_COMMAND_LOWER);
        showCalculationLower.addActionListener(showCalculationController);

        showCalculationHigher.setActionCommand(SHOW_CALCULATION_BUTTON_COMMAND_HIGHER);
        showCalculationHigher.addActionListener(showCalculationController);

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(lowerPanelLabel).fillX();
        gridBag.row().cell(lowerPanel).fillX();
        gridBag.row().separator();
        gridBag.row().cell(showCalculationLower).fillX();
        gridBag.row().separator();
        gridBag.row().cell(higherPanelLabel).fillX();
        gridBag.row().cell(higherPanel).fillX();
        gridBag.row().separator();
        gridBag.row().cell(showCalculationHigher).fillX();
        gridBag.doneAndPushEverythingToTop();

        notifyUpdate();
    }
    
    /**
     * Creates tables and fills in their data if applicable.
     */
    private void fillIn() {

        if (runwaySelection.hasSelectedRunway()) {
            LogicalRunway lowerThreshold = runwaySelection.getSelectedRunway().getLowerThreshold();
            LogicalRunway higherThreshold = runwaySelection.getSelectedRunway().getHigherThreshold();

            this.lowerPanelLabel.setText("From " + lowerThreshold.getHeadingAsString() + lowerThreshold.getLocation()
                    + " towards " + higherThreshold.getHeadingAsString() + higherThreshold.getLocation());

            this.higherPanelLabel.setText("From " + higherThreshold.getHeadingAsString() + higherThreshold.getLocation()
                    + " towards " + lowerThreshold.getHeadingAsString() + lowerThreshold.getLocation());

            for (int i = 0; i < 4; i++) {
                this.lowerTableModel.removeRow(0);
                this.higherTableModel.removeRow(0);
            }

            DynamicLengthCalculator calc = runwaySelection.getSelectedRunway().getDynamicLengthCalculator();
            Object[][] lowerData = {
                {"LDA",  lowerThreshold.getOriginalLda(),
                    calc.getLda(RunwaySide.LOWER_THRESHOLD)},
                {"TODA", lowerThreshold.getOriginalToda(),
                    calc.getToda(RunwaySide.LOWER_THRESHOLD)},
                {"ASDA", lowerThreshold.getOriginalAsda(),
                    calc.getAsda(RunwaySide.LOWER_THRESHOLD)},
                {"TORA", lowerThreshold.getOriginalTora(),
                    calc.getTora(RunwaySide.LOWER_THRESHOLD)}};
            Object[][] higherData = {
                {"LDA",  higherThreshold.getOriginalLda(),
                    calc.getLda(RunwaySide.HIGHER_THRESHOLD)},
                {"TODA", higherThreshold.getOriginalToda(),
                    calc.getToda(RunwaySide.HIGHER_THRESHOLD)},
                {"ASDA", higherThreshold.getOriginalAsda(),
                    calc.getAsda(RunwaySide.HIGHER_THRESHOLD)},
                {"TORA", higherThreshold.getOriginalTora(),
                    calc.getTora(RunwaySide.HIGHER_THRESHOLD)}};

            for (var row : lowerData) {
                this.lowerTableModel.addRow(row);
            }

            for (var row : higherData) {
                this.higherTableModel.addRow(row);
            }


        } else {
            this.add(new JLabel("A runway must be selected to view distances."));
        }
    }

    @Override
    public void notifyUpdate() {
        fillIn();
        repaint();
    }
}
