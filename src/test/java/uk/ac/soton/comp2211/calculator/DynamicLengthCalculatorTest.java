package uk.ac.soton.comp2211.calculator;

import org.junit.jupiter.api.Test;
import uk.ac.soton.comp2211.model.Obstacle;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwayObstacle;
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
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

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
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
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
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
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
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
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
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
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
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
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
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
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
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
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
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
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
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
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
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
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
    ///////START OF OBSTACLE TESTING////////
    @Test
    void getLowerLdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    //##############################################OBSTACLEATLIMITOFDISTANCE#############################################

    @Test
    void getLowerLdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

//##########################NEGATIVE DISTANCES#######################################
@Test
void getLowerLdaNearObstacle(){
    PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
    DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

    RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
    Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

    int expectedValue = 2290;
    assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
}
    @Test
    void getLowerToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }


//###########################limitOflength##############################
@Test
void getLowerLdaNearObstacle(){
    PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
    DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

    RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
    Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

    int expectedValue = 2290;
    assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
}
    @Test
    void getLowerToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }


//##############################Limitofheight###############################
@Test
void getLowerLdaNearObstacle(){
    PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
    DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

    RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
    Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

    int expectedValue = 2290;
    assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
}
    @Test
    void getLowerToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }


//###################ObstacleheightdoesntpassRESACheck#############################
@Test
void getLowerLdaNearObstacle(){
    PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
    DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

    RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
    Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

    int expectedValue = 2290;
    assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
}
    @Test
    void getLowerToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }


//////OTHER CASES////////
    //Length = 0
    //Length = -
    //heaight = 0
    //distance = 0
    //centre-line distance = 0
    //centre-line distance = max
    //




    //TODO obstacles for each distance
    //Test with obstacle height under limit so RESA/BLast protection can be used

    @Test
    void getObstacleThresholdDistance(){
        //with and without obstacle
        //differnet obstacle lengths
        //with and without displaced thresholds

    }

    @Test
    void getSlopeCalculation(){
        //Different height obstacles
        //
    }

    @Test
    void checkSide(){
        //Cases
        //Closer to current Both sides
        //Closer to opposite Both sides
        //Limit closer to current
        //Limit closer to opposite
        //All of these with and without displaced thresholds


    }
}