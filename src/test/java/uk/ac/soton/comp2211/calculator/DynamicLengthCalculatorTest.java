package uk.ac.soton.comp2211.calculator;

import org.junit.jupiter.api.Test;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import static org.junit.jupiter.api.Assertions.*;

class DynamicLengthCalculatorTest {

    /**
     * GIVEN a runway with no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraNoStopWayNoClearwayLower() {
        setUpNoStopwayNoClearwayLower()

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.dtopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraNoStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.doStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.dtopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraNoStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.doStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.dtopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraNoStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.doStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.dtopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedNoStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedNoStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedNoStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedNoStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaNoStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.doStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.dtopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaNoStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.doStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.dtopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaNoStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.doStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.dtopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaNoStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.doStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and a clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.dtopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaDisplacedNoStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaDisplacedStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the LOWER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaDisplacedNoStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaDisplacedStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaDisplacedNoStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaDisplacedStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaDisplacedNoStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaDisplacedStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaNoStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.doStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.dtopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaNoStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.doStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and  clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.dtopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaNoStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.doStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.dtopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaNoStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.doStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.dtopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaDisplacedNoStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaDisplacedStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaDisplacedNoStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaDisplacedStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaDisplacedNoStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaDisplacedStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaDisplacedNoStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaDisplacedStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaNoStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.doStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.dtopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaNoStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.doStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.dtopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaNoStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.doStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.dtopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaNoStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.doStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.dtopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedNoStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedStopWayNoClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and clearway but no stopway from the LOWER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedNoStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedStopWayClearwayLower() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedNoStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedStopWayNoClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the HIGHER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedNoStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedStopWayClearwayHigher() {
        PhysicalRunway physicalRunway = Runways.displacedThresholdStopwayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
}