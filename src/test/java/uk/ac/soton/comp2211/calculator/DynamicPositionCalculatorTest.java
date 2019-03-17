package uk.ac.soton.comp2211.calculator;

import org.junit.jupiter.api.Test;
import uk.ac.soton.comp2211.model.Obstacle;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DynamicPositionCalculatorTest {
    //With and without obstacles
    //Obstacles on both sides
    //Obstacles heights max and min
    //Obstacle Lengths
    //

    @Test
    void getLowerLandingObstacleOffestNoObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        assertEquals(60,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherLandingObstacleOffestNoObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        assertEquals(3060,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getLowerLandingObstacleOffestObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(770,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherLandingObstacleOffestObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2350,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getLowerLandingObstacleOffestObstacleMaxHeight() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2020,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherLandingObstacleOffestObstacleHeight() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(1100,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getLowerLandingObstacleOffestObstacleMinHeight() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 1, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(510,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherLandingObstacleOffestObstacleMinHeight() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 1, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2610,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getLowerLandingObstacleOffestObstacleMaxLength() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2070,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherLandingObstacleOffestObstacleLength() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(1050,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.HIGHER_THRESHOLD));
    }
    //TAKEOFFOBSTACLEOFFSET
    @Test
    void getLowerTakeOffbstacleOffestNoObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        assertEquals(60,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherTakeOffObstacleOffestNoObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        assertEquals(3060,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getLowerTakeOffObstacleOffestObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(510,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherTakeOffObstacleOffestObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2610,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getLowerTakeOffObstacleOffestObstacleMaxHeight() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(510,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherTakeOffObstacleOffestObstacleHeight() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2610,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getLowerTakeOffObstacleOffestObstacleMinHeight() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 1, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(510,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherTakeOffObstacleOffestObstacleMinHeight() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 1, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2610,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getLowerTakeOffObstacleOffestObstacleMaxLength() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 35, 100));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(560,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherTakeOffObstacleOffestObstacleLength() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 100));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2560,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getTakeOffObstacleOppssite(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(60,dynamicPositionCalculator.getTakeOffObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getLandingObstacleOppssite(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(60,dynamicPositionCalculator.getLandingObstacleOffset(RunwaySide.LOWER_THRESHOLD));
    }


    @Test
    void getObstaclePositionNoObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();


        assertThrows(NoSuchElementException.class, () -> {dynamicPositionCalculator.getObstaclePosition();});
    }

    @Test
    void getObstaclePositionHigher() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2960, dynamicPositionCalculator.getObstaclePosition());
    }

    @Test
    void getObstaclePositionLower() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(160, dynamicPositionCalculator.getObstaclePosition());
    }

    @Test
    void getResaPositonNoObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        assertThrows(NoSuchElementException.class, () -> {dynamicPositionCalculator.getResaPosition();});
    }

    @Test
    void getResaPositon(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(210, dynamicPositionCalculator.getResaPosition());
    }

    @Test
    void getBlastProtectionPositonNoObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        assertThrows(NoSuchElementException.class, () -> {dynamicPositionCalculator.getBlastProtectionPosition();});
    }

    @Test
    void getBlastProtectionPositon(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(210, dynamicPositionCalculator.getBlastProtectionPosition());
    }

    @Test
    void getSlopePositionNoObstacle(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();


        assertThrows(NoSuchElementException.class, () -> {dynamicPositionCalculator.getSlopePosition();});
    }

    @Test
    void getSlopePositionHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2910, dynamicPositionCalculator.getSlopePosition());
    }

    @Test
    void getSlopePositionLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(210, dynamicPositionCalculator.getSlopePosition());
    }
}