package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;
import uk.ac.soton.comp2211.model.ThresholdLocation;

public class Runways {

    public static PhysicalRunway NoStopWayNoClearway(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public  static PhysicalRunway StopWayNoClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway StopWayNoClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway NoStopWayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3700, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway NoStopWayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3700, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway StopWayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3700, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway StopWayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3700, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway DisplacedThresholdNoStopwayNoClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway DisplacedThresholdNoStopwayNoClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway DisplacedThresholdStopwayNoClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3000, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway DisplacedThresholdStopwayNoClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3000, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway DisplacedThresholdNoStopwayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3700, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway DisplacedThresholdNoStopwayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3700, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway DisplacedThresholdStopwayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3700, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway DisplacedThresholdStopwayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3700, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
}
