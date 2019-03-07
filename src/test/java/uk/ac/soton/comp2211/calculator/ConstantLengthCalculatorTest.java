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
    void getRunwayMarginLength_noStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualMargin = calculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(60, actualMargin);
    }

    @Test
    void getRunwayMarginLength_noStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualMargin = calculator.getRunwayMarginLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(60, actualMargin);
    }

    @Test
    void getRunwayMarginLength_noStopWayClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var expectedMargin = 60 + calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualMargin = calculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedMargin, actualMargin);
    }

    @Test
    void getRunwayMarginLength_noStopWayClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var expectedMargin = 60 + calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
        var actualMargin = calculator.getRunwayMarginLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedMargin, actualMargin);
    }

    @Test
    void getRunwayLength() {
    }

    @Test
    void getStripLength() {
    }

    @Test
    void getDisplacedThresholdLength() {
    }

    @Test
    void getTotalVisualisationLength() {
    }
}