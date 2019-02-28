package uk.ac.soton.comp2211.calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import uk.ac.soton.comp2211.model.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    void setUp() {
        calculator=null;
        assertNull(calculator);
    }
    void setUpNoStopWayNoClearway(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpStopWayNoClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpStopWayNoClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpNoStopWayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3700, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpNoStopWayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3700, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpStopWayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3700, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpStopWayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3700, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpDisplacedThresholdNoStopwayNoClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpDisplacedThresholdNoStopwayNoClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpDisplacedThresholdStopwayNoClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3000, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpDisplacedThresholdStopwayNoClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3000, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpDisplacedThresholdNoStopwayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3700, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpDisplacedThresholdNoStopwayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3700, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();

    }
    void setUpDisplacedThresholdStopwayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3700, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }
    void setUpDisplacedThresholdStopwayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3700, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        this.calculator = physicalRunway.getCalculator();
    }

    /**
     * GIVEN a runway with no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraNoStopWayNoClearwayLower() {
        setUpNoStopWayNoClearway();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraStopWayNoClearwayLower() {
        setUpStopWayNoClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraNoStopWayClearwayLower() {
        setUpNoStopWayClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraStopWayClearwayLower() {
        setUpStopWayClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraNoStopWayNoClearwayHigher() {
        setUpNoStopWayNoClearway();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraStopWayNoClearwayHigher() {
        setUpStopWayNoClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraNoStopWayClearwayHigher() {
        setUpNoStopWayClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraStopWayClearwayHigher() {
        setUpStopWayClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedNoStopWayNoClearwayLower() {
        setUpDisplacedThresholdNoStopwayNoClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedStopWayNoClearwayLower() {
        setUpDisplacedThresholdStopwayNoClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedNoStopWayClearwayLower() {
        setUpDisplacedThresholdNoStopwayClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedStopWayClearwayLower() {
        setUpDisplacedThresholdStopwayClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedNoStopWayNoClearwayHigher() {
        setUpDisplacedThresholdNoStopwayNoClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedStopWayNoClearwayHigher() {
        setUpDisplacedThresholdStopwayNoClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedNoStopWayClearwayHigher() {
        setUpDisplacedThresholdNoStopwayClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original TORA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getToraDisplacedStopWayClearwayHigher() {
        setUpDisplacedThresholdStopwayClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaNoStopWayNoClearwayLower() {
        setUpNoStopWayNoClearway();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaStopWayNoClearwayLower() {
        setUpStopWayNoClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaNoStopWayClearwayLower() {
        setUpNoStopWayClearwayLower();

        int expectedValue = 3700;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaStopWayClearwayLower() {
        setUpStopWayClearwayLower();

        int expectedValue = 3700;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaNoStopWayNoClearwayHigher() {
        setUpNoStopWayNoClearway();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaStopWayNoClearwayHigher() {
        setUpStopWayNoClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaNoStopWayClearwayHigher() {
        setUpNoStopWayClearwayHigher();

        int expectedValue = 3700;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and a clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaStopWayClearwayHigher() {
        setUpStopWayClearwayHigher();

        int expectedValue = 3700;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaDisplacedNoStopWayNoClearwayLower() {
        setUpDisplacedThresholdNoStopwayNoClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaDisplacedStopWayNoClearwayLower() {
        setUpDisplacedThresholdStopwayNoClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the LOWER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaDisplacedNoStopWayClearwayLower() {
        setUpDisplacedThresholdNoStopwayClearwayLower();

        int expectedValue = 3700;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaDisplacedStopWayClearwayLower() {
        setUpDisplacedThresholdStopwayClearwayLower();

        int expectedValue = 3700;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaDisplacedNoStopWayNoClearwayHigher() {
        setUpDisplacedThresholdNoStopwayNoClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getTodaDisplacedStopWayNoClearwayHigher() {
        setUpDisplacedThresholdStopwayNoClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaDisplacedNoStopWayClearwayHigher() {
        setUpDisplacedThresholdNoStopwayClearwayHigher();

        int expectedValue = 3700;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original TODA = 3700 and there is no obstacle added to the runway
     * THEN the calculator should return 3700
     */
    @Test
    void getTodaDisplacedStopWayClearwayHigher() {
        setUpDisplacedThresholdStopwayClearwayHigher();

        int expectedValue = 3700;
        assertEquals(expectedValue, calculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaNoStopWayNoClearwayLower() {
        setUpNoStopWayNoClearway();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaStopWayNoClearwayLower() {
        setUpStopWayNoClearwayLower();

        int expectedValue = 3500;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaNoStopWayClearwayLower() {
        setUpNoStopWayClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and  clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaStopWayClearwayLower() {
        setUpStopWayClearwayLower();

        int expectedValue = 3500;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaNoStopWayNoClearwayHigher() {
        setUpNoStopWayNoClearway();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaStopWayNoClearwayHigher() {
        setUpStopWayNoClearwayHigher();

        int expectedValue = 3500;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaNoStopWayClearwayHigher() {
        setUpNoStopWayClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaStopWayClearwayHigher() {
        setUpStopWayClearwayHigher();

        int expectedValue = 3500;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaDisplacedNoStopWayNoClearwayLower() {
        setUpDisplacedThresholdNoStopwayNoClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaDisplacedStopWayNoClearwayLower() {
        setUpDisplacedThresholdStopwayNoClearwayLower();

        int expectedValue = 3500;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaDisplacedNoStopWayClearwayLower() {
        setUpDisplacedThresholdNoStopwayClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaDisplacedStopWayClearwayLower() {
        setUpDisplacedThresholdStopwayClearwayLower();

        int expectedValue = 3500;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaDisplacedNoStopWayNoClearwayHigher() {
        setUpDisplacedThresholdNoStopwayNoClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaDisplacedStopWayNoClearwayHigher() {
        setUpDisplacedThresholdStopwayNoClearwayHigher();

        int expectedValue = 3500;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getAsdaDisplacedNoStopWayClearwayHigher() {
        setUpDisplacedThresholdNoStopwayClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original ASDA = 3500 and there is no obstacle added to the runway
     * THEN the calculator should return 3500
     */
    @Test
    void getAsdaDisplacedStopWayClearwayHigher() {
        setUpDisplacedThresholdStopwayClearwayHigher();

        int expectedValue = 3500;
        assertEquals(expectedValue, calculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaNoStopWayNoClearwayLower() {
        setUpNoStopWayNoClearway();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaStopWayNoClearwayLower() {
        setUpStopWayNoClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaNoStopWayClearwayLower() {
        setUpNoStopWayClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaStopWayClearwayLower() {
        setUpStopWayClearwayLower();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaNoStopWayNoClearwayHigher() {
        setUpNoStopWayNoClearway();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and no clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaStopWayNoClearwayHigher() {
        setUpStopWayNoClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with no stopway and a clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaNoStopWayClearwayHigher() {
        setUpNoStopWayClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 3000 and there is no obstacle added to the runway
     * THEN the calculator should return 3000
     */
    @Test
    void getLdaStopWayClearwayHigher() {
        setUpStopWayClearwayHigher();

        int expectedValue = 3000;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedNoStopWayNoClearwayLower() {
        setUpDisplacedThresholdNoStopwayNoClearwayLower();

        int expectedValue = 2500;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedStopWayNoClearwayLower() {
        setUpDisplacedThresholdStopwayNoClearwayLower();

        int expectedValue = 2500;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and clearway but no stopway from the LOWER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedNoStopWayClearwayLower() {
        setUpDisplacedThresholdNoStopwayClearwayLower();

        int expectedValue = 2500;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the LOWER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedStopWayClearwayLower() {
        setUpDisplacedThresholdStopwayClearwayLower();

        int expectedValue = 2500;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and no stopway or clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedNoStopWayNoClearwayHigher() {
        setUpDisplacedThresholdNoStopwayNoClearwayHigher();

        int expectedValue = 2500;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway but no clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedStopWayNoClearwayHigher() {
        setUpDisplacedThresholdStopwayNoClearwayHigher();

        int expectedValue = 2500;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a clearway but no stopway from the HIGHER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedNoStopWayClearwayHigher() {
        setUpDisplacedThresholdNoStopwayClearwayHigher();

        int expectedValue = 2500;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    /**
     * GIVEN a runway with a displaced threshold and a stopway and clearway from the HIGHER THRESHOLD
     * WHEN the original LDA = 2500 and there is no obstacle added to the runway
     * THEN the calculator should return 2500
     */
    @Test
    void getLdaDisplacedStopWayClearwayHigher() {
        setUpDisplacedThresholdStopwayClearwayHigher();

        int expectedValue = 2500;
        assertEquals(expectedValue, calculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @AfterAll
    void tearDown(){
        calculator = null;
        assertNull(calculator);
    }
}