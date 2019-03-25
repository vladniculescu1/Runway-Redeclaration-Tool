package uk.ac.soton.comp2211.view.east;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.controller.ShowCalculationController;
import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

    private JPanel gridBagContainer;
    private JPanel noRunwayPanel;

    /**
     * Constructs a new distances panel.
     *
     * @param runwaySelection           The runway selection
     * @param showCalculationController controller for button clicks
     */
    public DistancesPanel(RunwaySelection runwaySelection, ShowCalculationController showCalculationController) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;

        Font biggerFont = this.getFont().deriveFont(this.getFont().getSize() * 1.25F);
        this.setFont(biggerFont);

        Insets margin = new Insets(3, 0, 3, 0);

        int tableRowHeight = 25;


        String[] header = {"Value", "Original", "Recalc"};

        this.lowerPanelLabel = new JLabel("Lower threshold");
        this.lowerPanelLabel.setFont(biggerFont);
        this.higherPanelLabel = new JLabel("Higher threshold");
        this.higherPanelLabel.setFont(biggerFont);
        this.showCalculationLower = new JButton("Show Calculation");
        this.showCalculationLower.setFont(biggerFont);
        this.showCalculationLower.setMargin(margin);
        this.showCalculationHigher = new JButton("Show Calculation");
        this.showCalculationHigher.setFont(biggerFont);
        this.showCalculationHigher.setMargin(margin);

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
        lowerTable.getTableHeader().setFont(this.getFont());
        lowerTable.getTableHeader().setPreferredSize(new Dimension(this.getWidth(), tableRowHeight));
        lowerTable.setRowHeight(tableRowHeight);
        lowerTable.setRowSelectionAllowed(true);
        lowerTable.setFont(this.getFont());
        lowerTable.setRowSelectionAllowed(true);
        lowerTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lowerTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    showCalculationController.actionPerformed(new ActionEvent(e.getSource(),
                            e.getID(), SHOW_CALCULATION_BUTTON_COMMAND_LOWER));
                }
            }
        });



        JTable higherTable = new JTable(this.higherTableModel);
        higherTable.getTableHeader().setFont(this.getFont());
        higherTable.getTableHeader().setPreferredSize(new Dimension(this.getWidth(), tableRowHeight));
        higherTable.setRowHeight(tableRowHeight);
        higherTable.setRowSelectionAllowed(true);
        higherTable.setFont(this.getFont());
        higherTable.setRowSelectionAllowed(true);
        higherTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        higherTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    showCalculationController.actionPerformed(new ActionEvent(e.getSource(),
                            e.getID(), SHOW_CALCULATION_BUTTON_COMMAND_HIGHER));
                }
            }
        });

        JPanel lowerPanel = new JPanel(new BorderLayout());
        lowerPanel.setFont(biggerFont);
        lowerPanel.add(lowerTable, BorderLayout.CENTER);
        lowerPanel.add(lowerTable.getTableHeader(), BorderLayout.NORTH);

        JPanel higherPanel = new JPanel(new BorderLayout());
        higherPanel.setFont(biggerFont);
        higherPanel.add(higherTable, BorderLayout.CENTER);
        higherPanel.add(higherTable.getTableHeader(), BorderLayout.NORTH);

        showCalculationController.setLowerTable(lowerTable);
        showCalculationController.setHigherTable(higherTable);

        showCalculationLower.setActionCommand(SHOW_CALCULATION_BUTTON_COMMAND_LOWER);
        showCalculationLower.addActionListener(showCalculationController);

        showCalculationHigher.setActionCommand(SHOW_CALCULATION_BUTTON_COMMAND_HIGHER);
        showCalculationHigher.addActionListener(showCalculationController);

        gridBagContainer = new JPanel();
        gridBagContainer.setFont(biggerFont);
        this.setLayout(new BorderLayout());
        this.add(gridBagContainer, BorderLayout.CENTER);

        PainlessGridBag gridBag = new PainlessGridBag(gridBagContainer, false);
        gridBag.row().cell(lowerPanelLabel).fillX();
        gridBag.row().cell(lowerPanel).fillX();
        gridBag.row().cell(showCalculationLower).fillX();
        gridBag.row().separator();
        gridBag.row().cell(higherPanelLabel).fillX();
        gridBag.row().cell(higherPanel).fillX();
        gridBag.row().cell(showCalculationHigher).fillX();
        gridBag.doneAndPushEverythingToTop();

        JLabel noRunwayLabel =
                new JLabel("<html>A runway must be declared in order<br> to view distances.</html>");
        noRunwayPanel = new JPanel();
        noRunwayPanel.add(noRunwayLabel);

        notifyUpdate();
    }

    /**
     * Creates tables and fills in their data if applicable.
     */
    private void fillIn() {
        LogicalRunway lowerThreshold = runwaySelection.getSelectedRunway().getLowerThreshold();
        LogicalRunway higherThreshold = runwaySelection.getSelectedRunway().getHigherThreshold();

        this.lowerPanelLabel.setText("Runway " + lowerThreshold.getHeadingAsString() + lowerThreshold.getLocation());

        this.higherPanelLabel.setText("Runway " + higherThreshold.getHeadingAsString() + higherThreshold.getLocation());

        for (int i = 0; i < 4; i++) {
            this.lowerTableModel.removeRow(0);
            this.higherTableModel.removeRow(0);
        }

        DynamicLengthCalculator calc = runwaySelection.getSelectedRunway().getDynamicLengthCalculator();
        Object[][] lowerData = {
                {"LDA", lowerThreshold.getOriginalLda(),
                        calc.getLda(RunwaySide.LOWER_THRESHOLD)},
                {"TODA", lowerThreshold.getOriginalToda(),
                        calc.getToda(RunwaySide.LOWER_THRESHOLD)},
                {"ASDA", lowerThreshold.getOriginalAsda(),
                        calc.getAsda(RunwaySide.LOWER_THRESHOLD)},
                {"TORA", lowerThreshold.getOriginalTora(),
                        calc.getTora(RunwaySide.LOWER_THRESHOLD)}};
        Object[][] higherData = {
                {"LDA", higherThreshold.getOriginalLda(),
                        calc.getLda(RunwaySide.HIGHER_THRESHOLD)},
                {"TODA", higherThreshold.getOriginalToda(),
                        calc.getToda(RunwaySide.HIGHER_THRESHOLD)},
                {"ASDA", higherThreshold.getOriginalAsda(),
                        calc.getAsda(RunwaySide.HIGHER_THRESHOLD)},
                {"TORA", higherThreshold.getOriginalTora(),
                        calc.getTora(RunwaySide.HIGHER_THRESHOLD)}};

        for (Object[] row : lowerData) {
            this.lowerTableModel.addRow(row);
        }

        for (Object[] row : higherData) {
            this.higherTableModel.addRow(row);
        }
    }

    @Override
    public void notifyUpdate() {
        if (runwaySelection.hasSelectedRunway()) {
            fillIn();
            this.removeAll();
            this.add(gridBagContainer);
        } else {
            this.removeAll();
            this.add(noRunwayPanel);
        }
        repaint();
    }
}
