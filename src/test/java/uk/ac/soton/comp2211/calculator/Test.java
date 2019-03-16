package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.Obstacle;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySide;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    //###################MinimumLength#########[####################
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3099;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3299;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3299;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3099;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerLdaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerToraFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerTodaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.LOWER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getLowerAsdaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.LOWER_THRESHOLD));
    }
    //Now Distances from Higher threshold towards lower######################################################
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMinimumLength(){
        PhysicalRunway physicalRunway = Runways.noStopWayNoClearway();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3099;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMinimumLengthStopwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMinimumLengthStopwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayNoClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //Lower Distances near and far obstacles with higher and lower clearways
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3299;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMinimumLengthClearwayLower(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMinimumLengthClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.noStopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    //lower with near and far obstacle with stopway and clearway
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3299;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaNearObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setHigherThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 3099;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMinimumLengthStopwayClearwayLower(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayLower();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherLdaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2599;
        assertEquals(expectedValue, dynamicLengthCalculator.getLda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherToraFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getTora(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherTodaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getToda(RunwaySide.HIGHER_THRESHOLD));
    }
    @org.junit.jupiter.api.Test
    void getHigherAsdaFarObstacleMinimumLengthStopwayClearwayHigher(){
        PhysicalRunway physicalRunway = Runways.stopWayClearwayHigher();
        DynamicLengthCalculator dynamicLengthCalculator = physicalRunway.getDynamicLengthCalculator();

        RunwayObstacle runwayObstacle = new RunwayObstacle(100, 0, new Obstacle("obstacle", 10, 1));
        Runways.setLowerThresholdObstacle(runwayObstacle, physicalRunway);

        int expectedValue = 2339;
        assertEquals(expectedValue, dynamicLengthCalculator.getAsda(RunwaySide.HIGHER_THRESHOLD));
    }

}
