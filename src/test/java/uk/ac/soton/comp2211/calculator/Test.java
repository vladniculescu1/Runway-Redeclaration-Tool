package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.Obstacle;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwayObstacle;
import uk.ac.soton.comp2211.model.RunwaySide;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
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

}
