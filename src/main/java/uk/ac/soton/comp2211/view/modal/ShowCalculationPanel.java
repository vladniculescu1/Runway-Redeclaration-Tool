package uk.ac.soton.comp2211.view.modal;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.calculator.ConstantLengthCalculator;
import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.model.*;

import javax.swing.*;

public class ShowCalculationPanel extends JPanel {
    private DynamicLengthCalculator dynamicLengthCalculator;
    private ConstantLengthCalculator constantLengthCalculator;
    private RunwaySide runwaySide;
    private LogicalRunway logicalRunway;
    private PhysicalRunway physicalRunway;
    /**
     * Constructor for the show calculation panel.
     * @param physicalRunway the physical runway
     * @param rowNumber the row number selected in the table
     * @param runwaySide the threshold selected
     */

    public ShowCalculationPanel(PhysicalRunway physicalRunway, int rowNumber, RunwaySide runwaySide) {
        this.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.runwaySide = runwaySide;
        this.physicalRunway = physicalRunway;
        dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();
        constantLengthCalculator = physicalRunway.getConstantLengthCalculator();

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
                throw new UnsupportedOperationException();
        }

    }

    private void showLdaCalculation() {
        if (physicalRunway.hasObstacle()) {
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Landing Over
                this.add(new JLabel("LDA = Original LDA - Distance From Threshold "
                       + "- Obstacle Length - Slope Calculation - Strip End"));
                this.add(new JLabel("         = " + logicalRunway.getOriginalLda() + " - "
                        + runwayObstacle.getThresholdDistance() + " - "
                        + runwayObstacle.getObstacle().getLength()
                        + " - " + dynamicLengthCalculator.getSlopeCalculation()
                        + " - " + constantLengthCalculator.getStripMargin()));
            } else {
                //Landing Towards
                this.add(new JLabel("LDA = Distance From Threshold - RESA - Strip End"));
                this.add(new JLabel("         = " + runwayObstacle.getThresholdDistance() + " - "
                        + constantLengthCalculator.getResa() + " - "
                        + constantLengthCalculator.getStripMargin()));
            }

        } else {
            //No obstacle
            this.add(new JLabel("LDA = Original LDA"));
        }
        this.add(new JLabel("         = " + dynamicLengthCalculator.getLda(runwaySide)));
    }

    private void showToraCalculation() {
        if (physicalRunway.hasObstacle()) {
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Take-off away
                this.add(new JLabel("TORA = Original TORA - Distance From Threshold "
                        + "- Displaced Threshold - Obstacle Length - Blast Protection"));
                this.add(new JLabel("            = " + logicalRunway.getOriginalTora() + " - "
                        + runwayObstacle.getThresholdDistance() + " - "
                        + constantLengthCalculator.getDisplacedThresholdLength(runwaySide) + " - "
                        + runwayObstacle.getObstacle().getLength()
                        + " - " + constantLengthCalculator.getBlastProtection()));
            } else {
                //Take-off towards
                this.add(new JLabel("TODO"));
                this.add(new JLabel("            = " + runwayObstacle.getThresholdDistance() + " - "
                        + constantLengthCalculator.getResa() + " - "
                        + constantLengthCalculator.getStripMargin()));
            }

        } else {
            //No obstacle
            this.add(new JLabel("TORA = Original TORA"));
        }
        this.add(new JLabel("            = " + dynamicLengthCalculator.getTora(runwaySide)));
    }

    private void showAsdaCalculation() {
        if (physicalRunway.hasObstacle()) {
            showToraCalculation();
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Take-off away
                this.add(new JLabel("ASDA = (R)TORA + STOPWAY"));
                this.add(new JLabel("            = "
                        + dynamicLengthCalculator.getTora(runwaySide)
                        + " + " + constantLengthCalculator.getStopwayLength(runwaySide)));
            } else {
                //Take-off towards
                this.add(new JLabel("ASDA = (R)TORA"));
            }

        } else {
            //No obstacle
            this.add(new JLabel("ASDA = Original ASDA"));
        }
        this.add(new JLabel("            = " + dynamicLengthCalculator.getAsda(runwaySide)));
    }

    private void showTodaCalculation() {
        if (physicalRunway.hasObstacle()) {
            showToraCalculation();
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            if (physicalRunway.getObstacleSide() == runwaySide) {
                //Take-off away
                this.add(new JLabel("TODA = (R)TORA + CLEARWAY"));
                this.add(new JLabel("            = "
                        + dynamicLengthCalculator.getTora(runwaySide)
                        + " + " + constantLengthCalculator.getClearwayLength(runwaySide)));
            } else {
                //Take-off towards
                this.add(new JLabel("TODA = (R)TORA"));
            }

        } else {
            //No obstacle
            this.add(new JLabel("TODA = Original TODA"));
        }
        this.add(new JLabel("            = " + dynamicLengthCalculator.getToda(runwaySide)));
    }

}
