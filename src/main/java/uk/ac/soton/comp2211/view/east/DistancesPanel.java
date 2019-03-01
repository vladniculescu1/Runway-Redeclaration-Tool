package uk.ac.soton.comp2211.view.east;

import java.awt.BorderLayout;

import javax.swing.*;

import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * This panel shows both the original runway distances and the re-calculated runway distances to the user.
 */
public class DistancesPanel extends JPanel implements Observer {

    private RunwaySelection runwaySelection;
    private JTabbedPane tabPane;
    
    /**
     * Constructs a new distances panel.
     * @param runwaySelection The runway selection
     */
    public DistancesPanel(RunwaySelection runwaySelection) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;

        this.setBorder(BorderFactory.createTitledBorder("Distances"));

        tabPane = new JTabbedPane();
        
        notifyUpdate();
    }
    
    /**
     * Creates tables and fills in their data if applicable.
     */
    private void fillIn() {
        this.removeAll();
        if (runwaySelection.hasSelectedRunway()) {
            LogicalRunway lowerThreshold = runwaySelection.getSelectedRunway().getLowerThreshold();
            LogicalRunway higherThreshold = runwaySelection.getSelectedRunway().getHigherThreshold();

            String[] names = {"Parameter", "Original", "Re-Calc", "Workings"};

            Calculator calc = runwaySelection.getSelectedRunway().getCalculator();
            Object[][] lowerData = {
                {"LDA",  lowerThreshold.getOriginalLda(),
                    calc.getLda(RunwaySide.LOWER_THRESHOLD),"not implemented"},
                {"TODA", lowerThreshold.getOriginalToda(),
                    calc.getToda(RunwaySide.LOWER_THRESHOLD),"not implemented"},
                {"ASDA", lowerThreshold.getOriginalAsda(),
                    calc.getAsda(RunwaySide.LOWER_THRESHOLD),"not implemented"},
                {"TORA", lowerThreshold.getOriginalTora(),
                    calc.getTora(RunwaySide.LOWER_THRESHOLD),"not implemented"}};
            Object[][] higherData = {
                {"LDA",  higherThreshold.getOriginalLda(),
                    calc.getLda(RunwaySide.HIGHER_THRESHOLD),"not implemented"},
                {"TODA", higherThreshold.getOriginalToda(),
                    calc.getToda(RunwaySide.HIGHER_THRESHOLD),"not implemented"},
                {"ASDA", higherThreshold.getOriginalAsda(),
                    calc.getAsda(RunwaySide.HIGHER_THRESHOLD),"not implemented"},
                {"TORA", higherThreshold.getOriginalTora(),
                    calc.getTora(RunwaySide.HIGHER_THRESHOLD),"not implemented"}};
            
            JTable lowerTable = new JTable(lowerData, names);
            JPanel lowerPanel = new JPanel(new BorderLayout());
            lowerPanel.add(lowerTable,BorderLayout.CENTER);
            lowerPanel.add(lowerTable.getTableHeader(),BorderLayout.NORTH);
            lowerTable.setEnabled(false);
            JTable higherTable = new JTable(higherData, names);
            JPanel higherPanel = new JPanel(new BorderLayout());
            higherPanel.add(higherTable,BorderLayout.CENTER);
            higherPanel.add(higherTable.getTableHeader(),BorderLayout.NORTH);
            higherTable.setEnabled(false);
            
            tabPane.removeAll();
            tabPane.addTab(lowerThreshold.getHeadingAsString(), lowerPanel);
            tabPane.addTab(higherThreshold.getHeadingAsString(), higherPanel);            
            this.add(tabPane);
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
