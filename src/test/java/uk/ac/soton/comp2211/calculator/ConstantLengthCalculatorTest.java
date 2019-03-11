package uk.ac.soton.comp2211.calculator;

import org.junit.jupiter.api.Test;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import static org.junit.jupiter.api.Assertions.*;

class ConstantLengthCalculatorTest {

    @Test
    void getStopwayLength_NoStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualStopway = calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(0, actualStopway);
    }

    @Test
    void getStopwayLength_NoStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualStopway = calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(0, actualStopway);
    }

    @Test
    void getStopwayLength_stopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.stopWayNoClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedStopway = runway.getLowerThreshold().getOriginalAsda() - runway.getLowerThreshold().getOriginalToda();
        var actualStopway = calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedStopway, actualStopway);
    }

    @Test
    void getStopwayLength_stopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayNoClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedStopway = runway.getHigherThreshold().getOriginalAsda() - runway.getHigherThreshold().getOriginalToda();
        var actualStopway = calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedStopway, actualStopway);
    }

    @Test
    void getStopwayLength_stopWayClearwayLower() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedStopway = runway.getLowerThreshold().getOriginalAsda() - runway.getLowerThreshold().getOriginalTora();
        var actualStopway = calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedStopway, actualStopway);
    }

    @Test
    void getStopwayLength_stopWayClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedStopway = runway.getHigherThreshold().getOriginalAsda() - runway.getHigherThreshold().getOriginalTora();
        var actualStopway = calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedStopway, actualStopway);
    }

    @Test
    void getClearwayLength_NoStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualClearway = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(0, actualClearway);
    }

    @Test
    void getClearwayLength_NoStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualClearway = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(0, actualClearway);
    }


    @Test
    void getClearwayLength_noStopWayClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedClearway = runway.getLowerThreshold().getOriginalToda() - runway.getLowerThreshold().getOriginalAsda();
        var actualClearway = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedClearway, actualClearway);
    }

    @Test
    void getClearwayLength_noStopWayClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedClearway = runway.getHigherThreshold().getOriginalToda() - runway.getHigherThreshold().getOriginalAsda();
        var actualClearway = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedClearway, actualClearway);
    }

    @Test
    void getClearwayLength_stopWayClearwayLower() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedClearway = runway.getLowerThreshold().getOriginalToda() - runway.getLowerThreshold().getOriginalTora();
        var actualClearway = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedClearway, actualClearway);
    }

    @Test
    void getClearwayLength_stopWayClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedClearway = runway.getHigherThreshold().getOriginalToda() - runway.getHigherThreshold().getOriginalTora();
        var actualClearway = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedClearway, actualClearway);
    }

    @Test
    void getRunwayMarginLength_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualMargin = calculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(60, actualMargin);
    }

    @Test
    void getRunwayMarginLength_displacedThresholdNoStopwayClearwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedMargin = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
        var actualMargin = calculator.getRunwayMarginLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedMargin, actualMargin);
    }

    @Test
    void getRunwayMarginLength_displacedThresholdNoStopwayClearwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedMargin = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualMargin = calculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedMargin, actualMargin);
    }

    @Test
    void getRunwayLength_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getLowerThreshold().getOriginalTora();
        var actualLength = calculator.getRunwayLength();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getRunwayLength_displacedThresholdStopwayClearwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getLowerThreshold().getOriginalTora();
        var actualLength = calculator.getRunwayLength();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getRunwayLength_displacedThresholdStopwayClearwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getHigherThreshold().getOriginalTora();
        var actualLength = calculator.getRunwayLength();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getStripLength_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = 2 * calculator.getStripMargin() + calculator.getRunwayLength();
        var actualLength = calculator.getStripLength();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getStripLength_displacedThresholdStopwayClearwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdStopwayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = 2 * calculator.getStripMargin() + calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD)
            + calculator.getRunwayLength() + calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualLength = calculator.getStripLength();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getStripLength_displacedThresholdStopwayClearwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdStopwayClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = 2 * calculator.getStripMargin() + calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD)
                + calculator.getRunwayLength() + calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualLength = calculator.getStripLength();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getDisplacedThresholdLength_noStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getLowerThreshold().getOriginalTora() - runway.getLowerThreshold().getOriginalLda();
        var actualLength = calculator.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getDisplacedThresholdLength_noStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getHigherThreshold().getOriginalTora() - runway.getHigherThreshold().getOriginalLda();
        var actualLength = calculator.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getDisplacedThresholdLength_displacedThresholdClearwayStopwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdStopwayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getLowerThreshold().getOriginalTora() - runway.getLowerThreshold().getOriginalLda();
        var actualLength = calculator.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getDisplacedThresholdLength_displacedThresholdClearwayStopwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdStopwayClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getHigherThreshold().getOriginalTora() - runway.getHigherThreshold().getOriginalLda();
        var actualLength = calculator.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getResa_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualResa = calculator.getResa();

        assertEquals(240, actualResa);
    }

    @Test
    void getBlastProtection_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualBlastProtection = calculator.getBlastProtection();

        assertEquals(300, actualBlastProtection);
    }

    @Test
    void getStripMargin_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualStripMargin = calculator.getStripMargin();

        assertEquals(60, actualStripMargin);
    }

}