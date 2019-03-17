package uk.ac.soton.comp2211.calculator;

import org.junit.jupiter.api.Test;
import uk.ac.soton.comp2211.model.Obstacle;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySide;

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

        assertEquals(60,dynamicPositionCalculator.getLandingObstacleOffest(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherLandingObstacleOffestNoObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        assertEquals(3060,dynamicPositionCalculator.getLandingObstacleOffest(RunwaySide.HIGHER_THRESHOLD));
    }

    @Test
    void getLowerLandingObstacleOffestObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(770,dynamicPositionCalculator.getLandingObstacleOffest(RunwaySide.LOWER_THRESHOLD));
    }

    @Test
    void getHigherLandingObstacleOffestObstacle() {
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicPositionCalculator dynamicPositionCalculator = physicalRunway.getDynamicPositionCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 50));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        assertEquals(2350,dynamicPositionCalculator.getLandingObstacleOffest(RunwaySide.HIGHER_THRESHOLD));
    }

    //GOT TO HERE

    @Test
    void getTakeOffObstacleOffset() {
        //this has side
    }

    @Test
    void getObstaclePosition() {
    }

    @Test
    void getResaPositon(){

    }

    @Test
    void getBlastProtectionPosition(){

    }

    @Test
    void getSlopePosition(){

    }
}