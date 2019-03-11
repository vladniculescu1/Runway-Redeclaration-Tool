package uk.ac.soton.comp2211.calculator;

import org.junit.jupiter.api.Test;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import static org.junit.jupiter.api.Assertions.*;

class ConstantPositionCalculatorTest {

    @Test
    void getRunwayPosition_noStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = lengthCalculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);
        var actualPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void getRunwayPosition_noStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = lengthCalculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD)
                + lengthCalculator.getRunwayLength();
        var actualPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void getRunwayPosition_stopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.stopWayNoClearwayLower();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = lengthCalculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);
        var actualPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void getRunwayPosition_stopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayNoClearwayHigher();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = lengthCalculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD)
                + lengthCalculator.getRunwayLength();
        var actualPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void getStripPosition_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.stopWayNoClearwayHigher();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                - lengthCalculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD) - lengthCalculator.getStripMargin();;
        var actualPosition = positionCalculator.getStripPosition();

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void getStripPosition_stopWayClearwayLower() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                - lengthCalculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD) - lengthCalculator.getStripMargin();;
        var actualPosition = positionCalculator.getStripPosition();

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void getStopwayPosition_noStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void getStopwayPosition_noStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                - lengthCalculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void getStopwayPosition_stopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.stopWayNoClearwayLower();
        var positionCalculator = runway.getConstantPositionCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void getStopwayPosition_stopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayNoClearwayHigher();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                - lengthCalculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void getClearwayPosition() {

    }

    @Test
    void getThresholdPosition() {
    }
}