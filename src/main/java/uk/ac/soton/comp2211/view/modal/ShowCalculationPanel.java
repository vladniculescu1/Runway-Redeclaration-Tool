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
                showTodaCalculation(physicalRunway.getDynamicLengthCalculator());
                break;
            case 2:
                showAsdaCalculation(physicalRunway.getDynamicLengthCalculator());
                break;
            case 3:
                showToraCalculation(physicalRunway.getDynamicLengthCalculator());
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
                       + "- Obstacle Length - Slope Calculation = Strip End"));
                this.add(new JLabel("LDA = " + logicalRunway.getOriginalLda() + " - "
                        + runwayObstacle.getThresholdDistance() + " - "
                        + runwayObstacle.getObstacle().getLength()
                        + " - " + dynamicLengthCalculator.getSlopeCalculation()
                        + " - "+ constantLengthCalculator.getStripMargin()));
            } else {
              //Landing Towards
                this.add(new JLabel("LDA = Distance From Threshold - RESA - Strip End"));
                this.add(new JLabel("    = " + runwayObstacle.getThresholdDistance() + " - "
                        + constantLengthCalculator.getResa() + " - "
                        + constantLengthCalculator.getStripMargin()));
            }

        } else {
            //No obstacle
            this.add(new JLabel("LDA = Original LDA"));
        }
        this.add(new JLabel("LDA = " + dynamicLengthCalculator.getLda(runwaySide)));
    }

    private void showToraCalculation(DynamicLengthCalculator calculator) {
        if (logicalRunway.hasRunwayObstacle()) {
            System.out.println();
        } else {
            this.add(new JLabel("TORA = Original TORA"));
        }
        this.add(new JLabel("TORA = " + calculator.getTora(runwaySide)));
    }

    private void showAsdaCalculation(DynamicLengthCalculator calculator) {
        if (logicalRunway.hasRunwayObstacle()) {
            System.out.println();
        } else {
            this.add(new JLabel("ASDA = Original ASDA"));
        }
        this.add(new JLabel("ASDA = " + calculator.getAsda(runwaySide)));
    }

    private void showTodaCalculation(DynamicLengthCalculator calculator) {
        if (logicalRunway.hasRunwayObstacle()) {
            System.out.println();
        } else {
            this.add(new JLabel("TODA = Original TODA"));
        }
        this.add(new JLabel("TODA = " + calculator.getToda(runwaySide)));
    }

}
