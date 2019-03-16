package uk.ac.soton.comp2211.view.modal;

import antlr.debug.misc.JTreeASTPanel;
import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.controller.ShowCalculationController;
import uk.ac.soton.comp2211.model.*;

import javax.swing.*;
import java.awt.*;

public class ShowCalculationPanel extends JPanel {
    private DynamicLengthCalculator dynamicLengthCalculator;
    private ConstantLengthCalculator constantLengthCalculator;
    private RunwaySide runwaySide;
    private LogicalRunway logicalRunway;
    private PhysicalRunway physicalRunway;
    private ShowCalculationController showCalculationController;
    private JPanel calculationPanel;

    public static final String CANCEL_BUTTON_COMMAND = "cancelButton";
    /**
     * Constructor for the show calculation panel.
     * @param physicalRunway the physical runway
     * @param rowNumber the row number selected in the table
     * @param runwaySide the threshold selected
     * @param showCalculationController the controller to handle interactions with the panel
     */

    public ShowCalculationPanel(PhysicalRunway physicalRunway, int rowNumber,
                                RunwaySide runwaySide, ShowCalculationController showCalculationController) {
        this.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        this.setLayout(new BorderLayout());
        this.runwaySide = runwaySide;
        this.physicalRunway = physicalRunway;
        dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();
        constantLengthCalculator = physicalRunway.getConstantLengthCalculator();

        calculationPanel = new JPanel();
        calculationPanel.setLayout(new BoxLayout(calculationPanel, BoxLayout.Y_AXIS));

        switch (runwaySide) {
            case HIGHER_THRESHOLD:
                logicalRunway = physicalRunway.getHigherThreshold();
                break;
            case LOWER_THRESHOLD:
                logicalRunway = physicalRunway.getLowerThreshold();
                break;
            default:
                throw new UnsupportedOperationException();
        }

        switch (rowNumber) {
            case 0:
                showLdaCalculation();
                break;
            case 1:
                showTodaCalculation();
                break;
            case 2:
                showAsdaCalculation();
                break;
            case 3:
                showToraCalculation();
                break;
            default:
                this.add(new JLabel("Please select a value from the corresponding table!"));
        }

        this.add(calculationPanel, BorderLayout.WEST);

        JButton cancelButton = new JButton("Done");
        cancelButton.addActionListener(showCalculationController);
        cancelButton.setActionCommand(CANCEL_BUTTON_COMMAND);

        JPanel donePanel = new JPanel();
        donePanel.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        donePanel.add(cancelButton);
        this.add(donePanel, BorderLayout.SOUTH);

    }

    /**
     * displays the steps of calculation for the LDA value.
     */
    private void showLdaCalculation() {
        if (physicalRunway.hasObstacle()) {
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Landing Over
                if (dynamicLengthCalculator.getSlopeCalculation()
                        + constantLengthCalculator.getStripMargin() < constantLengthCalculator.getBlastProtection()) {
                    //Slope calculation + strip end value less than Blast protection value
                    calculationPanel.add(new JLabel("(Blast Protection = "
                            + constantLengthCalculator.getBlastProtection() + "  >  Slope Calculation = "
                            + dynamicLengthCalculator.getSlopeCalculation() + " so using Blast Protection Value)"));
                    calculationPanel.add(new JLabel("LDA = Original LDA - Distance From Threshold "
                            + "- Obstacle Length - Blast Protection value "));
                    calculationPanel.add(new JLabel("         = " + logicalRunway.getOriginalLda() + " - "
                            + runwayObstacle.getThresholdDistance() + " - "
                            + runwayObstacle.getObstacle().getLength()
                            + " - " + constantLengthCalculator.getBlastProtection()));
                } else {
                    //Slope calculation + strip end value greater than Blast protection value
                    calculationPanel.add(new JLabel("LDA = Original LDA - Distance From Threshold "
                            + "- Obstacle Length - Slope Calculation - Strip End"));
                    calculationPanel.add(new JLabel("         = " + logicalRunway.getOriginalLda() + " - "
                            + runwayObstacle.getThresholdDistance() + " - "
                            + runwayObstacle.getObstacle().getLength()
                            + " - " + dynamicLengthCalculator.getSlopeCalculation()
                            + " - " + constantLengthCalculator.getStripMargin()));
                }

            } else {
                //Landing Towards
                calculationPanel.add(new JLabel("LDA = Distance From Threshold - RESA - Strip End"));
                calculationPanel.add(new JLabel("         = " + runwayObstacle.getThresholdDistance() + " - "
                        + constantLengthCalculator.getResa() + " - "
                        + constantLengthCalculator.getStripMargin()));
            }
        } else {
            //No obstacle
            calculationPanel.add(new JLabel("LDA = Original LDA"));
        }
        calculationPanel.add(new JLabel("         = " + dynamicLengthCalculator.getLda(runwaySide)));
    }

    /**
     * displays the steps of calculation for the TORA value.
     */
    private void showToraCalculation() {
        if (physicalRunway.hasObstacle()) {
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Take-off away
                calculationPanel.add(new JLabel("TORA = Original TORA - Distance From Threshold "
                        + "- Displaced Threshold - Obstacle Length - Blast Protection"));
                calculationPanel.add(new JLabel("            = " + logicalRunway.getOriginalTora() + " - "
                        + runwayObstacle.getThresholdDistance() + " - "
                        + constantLengthCalculator.getDisplacedThresholdLength(runwaySide) + " - "
                        + runwayObstacle.getObstacle().getLength()
                        + " - " + constantLengthCalculator.getBlastProtection()));
            } else {
                //Take-off towards
                if (dynamicLengthCalculator.getSlopeCalculation()  < constantLengthCalculator.getResa()) {
                    //Slope calculation less than RESA value
                    calculationPanel.add(new JLabel("(RESA = "
                            + constantLengthCalculator.getResa() + "  >  Slope Calculation = "
                            + dynamicLengthCalculator.getSlopeCalculation() + " so using RESA Value)"));
                    calculationPanel.add(new JLabel("TORA = Distance from Threshold + "
                           + "Displaced Threshold - RESA - Strip End"));
                    calculationPanel.add(new JLabel("            = " + runwayObstacle.getThresholdDistance() + " - "
                            + constantLengthCalculator.getDisplacedThresholdLength(runwaySide) + " - "
                            + constantLengthCalculator.getResa() + " - "
                            + constantLengthCalculator.getStripMargin()));
                } else {
                    //Slope calculation greater than RESA
                    calculationPanel.add(new JLabel("TORA = Distance from Threshold + "
                            + "Displaced Threshold - Slope calculation - Strip End"));
                    calculationPanel.add(new JLabel("            = " + runwayObstacle.getThresholdDistance() + " - "
                            + constantLengthCalculator.getDisplacedThresholdLength(runwaySide) + " - "
                            + dynamicLengthCalculator.getSlopeCalculation() + " - "
                            + constantLengthCalculator.getStripMargin()));
                }
            }
        } else {
            //No obstacle
            calculationPanel.add(new JLabel("TORA = Original TORA"));
        }
        calculationPanel.add(new JLabel("            = " + dynamicLengthCalculator.getTora(runwaySide)));
    }

    /**
     * displays the steps of calculation for the ASDA value.
     */
    private void showAsdaCalculation() {
        if (physicalRunway.hasObstacle()) {
            showToraCalculation();
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Take-off away
                calculationPanel.add(new JLabel("ASDA = (R)TORA + STOPWAY"));
                calculationPanel.add(new JLabel("            = "
                        + dynamicLengthCalculator.getTora(runwaySide)
                        + " + " + constantLengthCalculator.getStopwayLength(runwaySide)));
            } else {
                //Take-off towards
                calculationPanel.add(new JLabel("ASDA = (R)TORA"));
            }
        } else {
            //No obstacle
            calculationPanel.add(new JLabel("ASDA = Original ASDA"));
        }
        calculationPanel.add(new JLabel("            = " + dynamicLengthCalculator.getAsda(runwaySide)));
    }

    /**
     * displays the steps of calculation for the TODA value.
     */
    private void showTodaCalculation() {
        if (physicalRunway.hasObstacle()) {
            showToraCalculation();
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Take-off away
                calculationPanel.add(new JLabel("TODA = (R)TORA + CLEARWAY"));
                calculationPanel.add(new JLabel("            = "
                        + dynamicLengthCalculator.getTora(runwaySide)
                        + " + " + constantLengthCalculator.getClearwayLength(runwaySide)));
            } else {
                //Take-off towards
                calculationPanel.add(new JLabel("TODA = (R)TORA"));
            }

        } else {
            //No obstacle
            calculationPanel.add(new JLabel("TODA = Original TODA"));
        }
        calculationPanel.add(new JLabel("            = " + dynamicLengthCalculator.getToda(runwaySide)));
    }

}