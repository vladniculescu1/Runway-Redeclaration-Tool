package uk.ac.soton.comp2211.view.modal;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.model.*;

import javax.swing.*;

public class ShowCalculationPanel extends JPanel {
    private LogicalRunway logicalRunway;
    private RunwaySide runwaySide;
    private RunwayObstacle runwayObstacle;
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
                showLdaCalculation(physicalRunway.getDynamicLengthCalculator());
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
        if (logicalRunway.hasRunwayObstacle()) {
            this.runwayObstacle = logicalRunway.getRunwayObstacle();
        }
    }

    private void showLdaCalculation(DynamicLengthCalculator calculator) {

        if (logicalRunway.hasRunwayObstacle()) {
            if (calculator.checkSide(runwayObstacle, runwaySide)) {
                //Landing over
                this.add(new JLabel("LDA = OriginalLDA - Distance From Threshold - Slope Calculation - Strip End"));
                this.add(new JLabel("    = " + logicalRunway.getOriginalLda() + " - "
                        + runwayObstacle.getThresholdDistance()
                        + " - (" + runwayObstacle.getObstacle().getHeight() + "*50) - 60"));
            } else {
                //Landing towards
                this.add(new JLabel("LDA = Distance From Threshold - Strip End - RESA "));
            }
        } else {
            this.add(new JLabel("LDA = Original LDA"));
        }
        this.add(new JLabel("LDA = " + calculator.getLda(runwaySide)));
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
