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
    void getLowerLdaNearObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2650;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2850;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2850;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2650;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2650;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2850;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2850;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2650;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2150;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1890;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //#####################~#####NEGATIVE DISTANCES#######################################
    @Test
    void getLowerLdaNearObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3210;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3410;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3410;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3210;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleNegativeDistanceLimit(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3210;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleNegativeDistanceLimitStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleNegativeDistanceLimitStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3410;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleNegativeDistanceLimitClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleNegativeDistanceLimitClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3410;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3210;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleNegativeDistanceLimitStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2710;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleNegativeDistanceLimitStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(-60, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2450;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //###########################limitOflength######'########################
    @Test
    void getLowerLdaNearObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3200;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3200;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3200;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3200;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3000;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2500;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2240;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //##############################Limitofheight######]#########################
    @Test
    void getLowerLdaNearObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxHeightStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxHeightStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxHeightClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxHeightClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxHeightStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMaxHeightStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1040;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //###################ObstacleheightdoesntpassRESACheck#########[####################
    @Test
    void getLowerLdaNearObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsRESACheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsRESACheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsRESACheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsRESACheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsRESACheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsRESACheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsRESACheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //###################ObstacleheightdoesntpassBlastProtectionCheck#########[####################
    @Test
    void getLowerLdaNearObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsBlastProtectionCheck(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsBlastProtectionCheckStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsBlastProtectionCheckStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsBlastProtectionCheckClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsBlastProtectionCheckClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleHeightFailsBlastProtectionCheckStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 4, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //###################MinimumLength#########[####################
    @Test
    void getLowerLdaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3099;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getLowerLdaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3299;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getLowerLdaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3299;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3099;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLowerLdaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerLdaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerToraFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerTodaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @Test
    void getLowerAsdaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @Test
    void getHigherLdaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3099;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @Test
    void getHigherLdaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3299;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @Test
    void getHigherLdaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3299;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3099;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherLdaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherLdaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherToraFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherTodaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @Test
    void getHigherAsdaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //##################eMaxLengthMaxDistance#########[####################
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2200;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2400;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2400;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2200;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxLengthMaxHeightMaxDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2200;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2400;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxLengthMaxHeightMaxDistanceClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2400;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2200;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 1700;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxLengthMaxHeightMaxDistanceStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 500));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 190;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Obstacle with Max distance to centre line//
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxCentreLine(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxCentreLineStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxCentreLineStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxCentreLineClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxCentreLineClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3250;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3050;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxCentreLineStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2550;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMaxCentreLineStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 75, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2290;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getHigherObstacleThresholdDistanceNoObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        assertThrows(IllegalArgumentException.class, () -> {
            dynamicLengthCalculator.getObstacleThresholdDistance(RunwaySide.HIGHER_THRESHOLD);
        });
    }

    @Test
    void getLowerObstacleThresholdDistanceNoObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        assertThrows(IllegalArgumentException.class, () -> {
            dynamicLengthCalculator.getObstacleThresholdDistance(RunwaySide.LOWER_THRESHOLD);
        });
    }

    @Test
    void getHigherObstacleThresholdDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 100;
        assertEquals(expectedValue, dynamicLengthCalculator.getObstacleThresholdDistance(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getLowerObstacleThresholdDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 100;
        assertEquals(expectedValue, dynamicLengthCalculator.getObstacleThresholdDistance(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getOppositeObstacleThresholdDistance(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2850;
        assertEquals(expectedValue, dynamicLengthCalculator.getObstacleThresholdDistance(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getObstacleThresholdDistanceWithDisplacedThreshold(){
        PhysicalRunway physicalRunway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 100;
        assertEquals(expectedValue, dynamicLengthCalculator.getObstacleThresholdDistance(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getSlopeCalculation(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 500;
        assertEquals(expectedValue, dynamicLengthCalculator.getSlopeCalculation());
    }

    @Test
    void getSlopeCalculationMaxHeight(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 35*50;
        assertEquals(expectedValue, dynamicLengthCalculator.getSlopeCalculation());
    }

    @Test
    void checkSideLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertTrue(dynamicLengthCalculator.checkSide(runwayObstacle,RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void checkSideHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertTrue(dynamicLengthCalculator.checkSide(runwayObstacle,RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void checkSideLowerBoundary(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertTrue(dynamicLengthCalculator.checkSide(runwayObstacle,RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void checkSideHigherBoundary(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertTrue(dynamicLengthCalculator.checkSide(runwayObstacle,RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void checkSideLowerOpposite(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertFalse(dynamicLengthCalculator.checkSide(runwayObstacle,RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void checkSideHigherOpposite(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(500, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertFalse(dynamicLengthCalculator.checkSide(runwayObstacle,RunwaySide.HIGHER_THRESHOLD));
    }
}