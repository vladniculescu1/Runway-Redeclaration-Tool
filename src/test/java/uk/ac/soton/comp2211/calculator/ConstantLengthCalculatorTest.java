package uk.ac.soton.comp2211.calculator;

import org.junit.jupiter.api.Test;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstantLengthCalculatorTest {

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the stopway on the lower side is equal to 0
     */
    @Test
    void getStopwayLength_NoStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualStopway = calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(0, actualStopway);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the stopway on the higher side is equal to 0
     */
    @Test
    void getStopwayLength_NoStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualStopway = calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(0, actualStopway);
    }

    /**
     * GIVEN a runway with stopway on the lower side and no clearway
     * WHEN no further action is taken
     * THEN the stopway on the lower side is equal to ASDA - TORA
     */
    @Test
    void getStopwayLength_stopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.stopWayNoClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedStopway = runway.getLowerThreshold().getOriginalAsda() - runway.getLowerThreshold().getOriginalToda();
        var actualStopway = calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedStopway, actualStopway);
    }

    /**
     * GIVEN a runway with stopway on the higher side and no clearway
     * WHEN no further action is taken
     * THEN the stopway on the higher side is equal to ASDA - TORA
     */
    @Test
    void getStopwayLength_stopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayNoClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedStopway = runway.getHigherThreshold().getOriginalAsda() - runway.getHigherThreshold().getOriginalToda();
        var actualStopway = calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedStopway, actualStopway);
    }

    /**
     * GIVEN a runway with stopway and clearway on the lower side
     * WHEN no further action is taken
     * THEN the stopway on the lower side is equal to ASDA - TORA
     */
    @Test
    void getStopwayLength_stopWayClearwayLower() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedStopway = runway.getLowerThreshold().getOriginalAsda() - runway.getLowerThreshold().getOriginalTora();
        var actualStopway = calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedStopway, actualStopway);
    }

    /**
     * GIVEN a runway with stopway and clearway on the higher side
     * WHEN no further action is taken
     * THEN the stopway on the higher side is equal to ASDA - TORA
     */
    @Test
    void getStopwayLength_stopWayClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedStopway = runway.getHigherThreshold().getOriginalAsda() - runway.getHigherThreshold().getOriginalTora();
        var actualStopway = calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedStopway, actualStopway);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the clearway on the lower side is equal to 0
     */
    @Test
    void getClearwayLength_NoStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualClearway = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(0, actualClearway);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the clearway on the higher side is equal to 0
     */
    @Test
    void getClearwayLength_NoStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualClearway = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(0, actualClearway);
    }

    /**
     * GIVEN a runway with no stopway and clearway on the lower side
     * WHEN no further action is taken
     * THEN the clearway on the lower side is equal to TODA - ASDA
     */
    @Test
    void getClearwayLength_noStopWayClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedClearway = runway.getLowerThreshold().getOriginalToda() - runway.getLowerThreshold().getOriginalAsda();
        var actualClearway = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedClearway, actualClearway);
    }

    /**
     * GIVEN a runway with no stopway and clearway on the higher side
     * WHEN no further action is taken
     * THEN the clearway on the higher side is equal to TODA - ASDA
     */
    @Test
    void getClearwayLength_noStopWayClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedClearway = runway.getHigherThreshold().getOriginalToda() - runway.getHigherThreshold().getOriginalAsda();
        var actualClearway = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedClearway, actualClearway);
    }

    /**
     * GIVEN a runway with stopway and clearway on the lower side
     * WHEN no further action is taken
     * THEN the clearway on the lower side is equal to TODA - TORA
     */
    @Test
    void getClearwayLength_stopWayClearwayLower() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedClearway = runway.getLowerThreshold().getOriginalToda() - runway.getLowerThreshold().getOriginalTora();
        var actualClearway = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedClearway, actualClearway);
    }

    /**
     * GIVEN a runway with stopway and clearway on the higher side
     * WHEN no further action is taken
     * THEN the clearway on the higher side is equal to TODA - TORA
     */
    @Test
    void getClearwayLength_stopWayClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedClearway = runway.getHigherThreshold().getOriginalToda() - runway.getHigherThreshold().getOriginalTora();
        var actualClearway = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedClearway, actualClearway);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the runway margin length is equal to 60
     */
    @Test
    void getRunwayMarginLength_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualMargin = calculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(60, actualMargin);
    }

    /**
     * GIVEN a runway with a displaced threshold and clearway on the lower side and no stopway
     * WHEN no further action is taken
     * THEN the runway margin length is equal to the clearway length of the lower threshold
     */
    @Test
    void getRunwayMarginLength_displacedThresholdNoStopwayClearwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedMargin = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
        var actualMargin = calculator.getRunwayMarginLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedMargin, actualMargin);
    }

    /**
     * GIVEN a runway with a displaced threshold and clearway on the higher side and no stopway
     * WHEN no further action is taken
     * THEN the runway margin length is equal to the clearway length of the lower threshold
     */
    @Test
    void getRunwayMarginLength_displacedThresholdNoStopwayClearwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedMargin = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualMargin = calculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedMargin, actualMargin);
    }

    /**
     * GIVEN a runway with no clearway and no stopway
     * WHEN no further action is taken
     * THEN the runway length is equal to the TORA
     */
    @Test
    void getRunwayLength_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getLowerThreshold().getOriginalTora();
        var actualLength = calculator.getRunwayLength();

        assertEquals(expectedLength, actualLength);
    }

    /**
     * GIVEN a runway with a displaced threshold, stopway and clearway on the lower side
     * WHEN no further action is taken
     * THEN the runway length is equal to the TORA
     */
    @Test
    void getRunwayLength_displacedThresholdStopwayClearwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getLowerThreshold().getOriginalTora();
        var actualLength = calculator.getRunwayLength();

        assertEquals(expectedLength, actualLength);
    }

    /**
     * GIVEN a runway with a displaced threshold, stopway and clearway on the higher side
     * WHEN no further action is taken
     * THEN the runway length is equal to the TORA
     */
    @Test
    void getRunwayLength_displacedThresholdStopwayClearwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getHigherThreshold().getOriginalTora();
        var actualLength = calculator.getRunwayLength();

        assertEquals(expectedLength, actualLength);
    }

    /**
     * GIVEN a runway with no clearway and no stopway
     * WHEN no further action is taken
     * THEN the strip length is equal to 2 * strip margin + runway length
     */
    @Test
    void getStripLength_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = 2 * calculator.getStripMargin() + calculator.getRunwayLength();
        var actualLength = calculator.getStripLength();

        assertEquals(expectedLength, actualLength);
    }

    /**
     * GIVEN a runway with a displaced threshold, stopway and clearway on the lower side
     * WHEN no further action is taken
     * THEN the strip length is equal to 2 * strip margin + runway length + both clearway lengths
     */
    @Test
    void getStripLength_displacedThresholdStopwayClearwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdStopwayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = 2 * calculator.getStripMargin() + calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD)
            + calculator.getRunwayLength() + calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualLength = calculator.getStripLength();

        assertEquals(expectedLength, actualLength);
    }

    /**
     * GIVEN a runway with a displaced threshold, stopway and clearway on the higher side
     * WHEN no further action is taken
     * THEN the strip length is equal to 2 * strip margin + runway length + both clearway lengths
     */
    @Test
    void getStripLength_displacedThresholdStopwayClearwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdStopwayClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = 2 * calculator.getStripMargin() + calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD)
                + calculator.getRunwayLength() + calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualLength = calculator.getStripLength();

        assertEquals(expectedLength, actualLength);
    }

    /**
     * GIVEN a runway with no displaced threshold, no stopway and no clearway
     * WHEN no further action is taken
     * THEN the length of the displaced threshold on the lower side is equal to TORA - LDA
     */
    @Test
    void getDisplacedThresholdLength_noStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getLowerThreshold().getOriginalTora() - runway.getLowerThreshold().getOriginalLda();
        var actualLength = calculator.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * GIVEN a runway with no displaced threshold, no stopway and no clearway
     * WHEN no further action is taken
     * THEN the length of the displaced threshold on the higher side is equal to TORA - LDA
     */
    @Test
    void getDisplacedThresholdLength_noStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getHigherThreshold().getOriginalTora() - runway.getHigherThreshold().getOriginalLda();
        var actualLength = calculator.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * GIVEN a runway with a displaced threshold on the lower side, no stopway and no clearway
     * WHEN no further action is taken
     * THEN the length of the displaced threshold is equal to TORA - LDA
     */
    @Test
    void getDisplacedThresholdLength_displacedThresholdClearwayStopwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdStopwayClearwayLower();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getLowerThreshold().getOriginalTora() - runway.getLowerThreshold().getOriginalLda();
        var actualLength = calculator.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * GIVEN a runway with a displaced threshold on the higher side, no stopway and no clearway
     * WHEN no further action is taken
     * THEN the length of the displaced threshold is equal to TORA - LDA
     */
    @Test
    void getDisplacedThresholdLength_displacedThresholdClearwayStopwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdStopwayClearwayHigher();
        var calculator = runway.getConstantLengthCalculator();
        var expectedLength = runway.getHigherThreshold().getOriginalTora() - runway.getHigherThreshold().getOriginalLda();
        var actualLength = calculator.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedLength, actualLength);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the length of the RESA is equal to 240
     */
    @Test
    void getResa_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualResa = calculator.getResa();

        assertEquals(240, actualResa);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the length of the blast protection is equal to 300
     */
    @Test
    void getBlastProtection_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualBlastProtection = calculator.getBlastProtection();

        assertEquals(300, actualBlastProtection);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the length of the strip margin is equal to 60
     */
    @Test
    void getStripMargin_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var calculator = runway.getConstantLengthCalculator();
        var actualStripMargin = calculator.getStripMargin();

        assertEquals(60, actualStripMargin);
    }

}