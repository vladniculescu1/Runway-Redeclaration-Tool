package uk.ac.soton.comp2211.view.modal;

import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.controller.ShowCalculationController;
import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySide;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShowCalculationPanel extends JPanel {
    private DynamicLengthCalculator dynamicLengthCalculator;
    private ConstantLengthCalculator constantLengthCalculator;
    private RunwaySide runwaySide;
    private LogicalRunway logicalRunway;
    private PhysicalRunway physicalRunway;
    private ShowCalculationController showCalculationController;
    private JPanel calculationPanel;
    private Font currentFont;
    private float fontSize;

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
        currentFont = new JLabel().getFont();
        fontSize = (float) 1.5 * currentFont.getSize();
        
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
                showCalculation(getLdaCalculation());
                break;
            case 1:
                showCalculation(getToraCalculation());
                break;
            case 2:
                showCalculation(getAsdaCalculation(physicalRunway.hasObstacle()));
                break;
            case 3:
                showCalculation(getTodaCalculation(physicalRunway.hasObstacle()));
                break;
            default:
                JLabel warningText = new JLabel("Please select a value from the corresponding table!");
                warningText.setFont(currentFont.deriveFont(fontSize));
                this.add(warningText);
        }

        this.add(calculationPanel, BorderLayout.WEST);

        JButton cancelButton = new JButton("Done");
        cancelButton.setFont(currentFont.deriveFont(fontSize));
        cancelButton.addActionListener(showCalculationController);
        cancelButton.setActionCommand(CANCEL_BUTTON_COMMAND);

        JPanel donePanel = new JPanel();
        donePanel.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        donePanel.add(cancelButton);
        this.add(donePanel, BorderLayout.SOUTH);

    }

    private void showCalculation(String[] calculationStrings) {
        for (String calcStringLine : calculationStrings) {
            JLabel textToDisplay = new JLabel(calcStringLine);
            textToDisplay.setFont(currentFont.deriveFont(fontSize));
            calculationPanel.add(textToDisplay);
        }
    }

    /**
     * displays the steps of calculation for the LDA value.
     * @return The LDA calculation in text format.
     */
    public String[] getLdaCalculation() {
        ArrayList<String> returnStrings = new ArrayList();
        if (physicalRunway.hasObstacle()) {
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Landing Over
                if (dynamicLengthCalculator.getSlopeCalculation()
                        + constantLengthCalculator.getStripMargin() < constantLengthCalculator.getBlastProtection()) {
                    //Slope calculation + strip end value less than Blast protection value
                    returnStrings.add("(Blast Protection = "
                            + constantLengthCalculator.getBlastProtection() + "  >  Slope Calculation = "
                            + dynamicLengthCalculator.getSlopeCalculation() + " so using Blast Protection Value)");
                    returnStrings.add("LDA = Original LDA - Distance From Threshold "
                            + "- Obstacle Length - Blast Protection value ");
                    returnStrings.add("         = " + logicalRunway.getOriginalLda() + " - "
                            + runwayObstacle.getThresholdDistance() + " - "
                            + runwayObstacle.getObstacle().getLength()
                            + " - " + constantLengthCalculator.getBlastProtection());
                } else {
                    //Slope calculation + strip end value greater than Blast protection value
                    returnStrings.add("LDA = Original LDA - Distance From Threshold "
                            + "- Obstacle Length - Slope Calculation - Strip End");
                    returnStrings.add("         = " + logicalRunway.getOriginalLda() + " - "
                            + runwayObstacle.getThresholdDistance() + " - "
                            + runwayObstacle.getObstacle().getLength()
                            + " - " + dynamicLengthCalculator.getSlopeCalculation()
                            + " - " + constantLengthCalculator.getStripMargin());
                }

            } else {
                //Landing Towards
                returnStrings.add("LDA = Distance From Threshold - RESA - Strip End");
                returnStrings.add("         = " + runwayObstacle.getThresholdDistance() + " - "
                        + constantLengthCalculator.getResa() + " - "
                        + constantLengthCalculator.getStripMargin());
            }
        } else {
            //No obstacle
            returnStrings.add("LDA = Original LDA");
        }
        returnStrings.add("         = " + dynamicLengthCalculator.getLda(runwaySide));

        String[] output = new String[returnStrings.size()];
        return returnStrings.toArray(output);
    }

    /**
     * Displays the steps of calculation for the TORA value.
     * @return The TORA calculation in text format.
     */
    public String[] getToraCalculation() {
        ArrayList<String> returnStrings = new ArrayList();
        if (physicalRunway.hasObstacle()) {
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Take-off away
                returnStrings.add("TORA = Original TORA - Distance From Threshold "
                        + "- Displaced Threshold - Obstacle Length - Blast Protection");
                returnStrings.add("            = " + logicalRunway.getOriginalTora() + " - "
                        + runwayObstacle.getThresholdDistance() + " - "
                        + constantLengthCalculator.getDisplacedThresholdLength(runwaySide) + " - "
                        + runwayObstacle.getObstacle().getLength()
                        + " - " + constantLengthCalculator.getBlastProtection());
            } else {
                //Take-off towards
                if (dynamicLengthCalculator.getSlopeCalculation()  < constantLengthCalculator.getResa()) {
                    //Slope calculation less than RESA value
                    returnStrings.add("(RESA = "
                            + constantLengthCalculator.getResa() + "  >  Slope Calculation = "
                            + dynamicLengthCalculator.getSlopeCalculation() + " so using RESA Value)");
                    returnStrings.add("TORA = Distance from Threshold + "
                           + "Displaced Threshold - RESA - Strip End");
                    returnStrings.add("            = " + runwayObstacle.getThresholdDistance() + " - "
                            + constantLengthCalculator.getDisplacedThresholdLength(runwaySide) + " - "
                            + constantLengthCalculator.getResa() + " - "
                            + constantLengthCalculator.getStripMargin());
                } else {
                    //Slope calculation greater than RESA
                    returnStrings.add("TORA = Distance from Threshold + "
                            + "Displaced Threshold - Slope calculation - Strip End");
                    returnStrings.add("            = " + runwayObstacle.getThresholdDistance() + " + "
                            + constantLengthCalculator.getDisplacedThresholdLength(runwaySide) + " - "
                            + dynamicLengthCalculator.getSlopeCalculation() + " - "
                            + constantLengthCalculator.getStripMargin());
                }
            }
        } else {
            //No obstacle
            returnStrings.add("TORA = Original TORA");
        }
        returnStrings.add("            = " + dynamicLengthCalculator.getTora(runwaySide));

        String[] output = new String[returnStrings.size()];
        return returnStrings.toArray(output);
    }

    /**
     * displays the steps of calculation for the ASDA value.
     * @param showTora If true the TORA calculation will be included.
     * @return The ASDA calculation in text format.
     */
    public String[] getAsdaCalculation(boolean showTora) {
        ArrayList<String> returnStrings = new ArrayList();
        if (physicalRunway.hasObstacle()) {
            if (showTora) {
                for (String toraString : getToraCalculation()) {
                    returnStrings.add(toraString);
                }
            }
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Take-off away
                returnStrings.add("ASDA = (R)TORA + STOPWAY");
                returnStrings.add("            = "
                        + dynamicLengthCalculator.getTora(runwaySide)
                        + " + " + constantLengthCalculator.getStopwayLength(runwaySide));
            } else {
                //Take-off towards
                returnStrings.add("ASDA = (R)TORA");
            }
        } else {
            //No obstacle
            returnStrings.add("ASDA = Original ASDA");
        }
        returnStrings.add("            = " + dynamicLengthCalculator.getAsda(runwaySide));

        String[] output = new String[returnStrings.size()];
        return returnStrings.toArray(output);
    }

    /**
     * displays the steps of calculation for the TODA value.
     * @param showTora If true the TORA calculation will be included.
     * @return The TODA calculation in text format.
     */
    public String[] getTodaCalculation(boolean showTora) {
        ArrayList<String> returnStrings = new ArrayList();
        if (physicalRunway.hasObstacle()) {
            if (showTora) {
                for (String toraString : getToraCalculation()) {
                    returnStrings.add(toraString);
                }
            }
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Take-off away
                returnStrings.add("TODA = (R)TORA + CLEARWAY");
                returnStrings.add("            = "
                        + dynamicLengthCalculator.getTora(runwaySide)
                        + " + " + constantLengthCalculator.getClearwayLength(runwaySide));
            } else {
                //Take-off towards
                returnStrings.add("TODA = (R)TORA");
            }

        } else {
            //No obstacle
            returnStrings.add("TODA = Original TODA");
        }
        returnStrings.add("            = " + dynamicLengthCalculator.getToda(runwaySide));

        String[] output = new String[returnStrings.size()];
        return returnStrings.toArray(output);
    }

}