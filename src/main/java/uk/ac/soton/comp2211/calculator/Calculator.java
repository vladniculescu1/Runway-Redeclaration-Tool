package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.*;

public class Calculator {

    private PhysicalRunway physicalRunway;
    private int resaValue = 240;
    private int blastProtectionValue = 300;
    private  int stripValue = 60;

    public Calculator(PhysicalRunway physicalRunway) {
        this.physicalRunway = physicalRunway;
    }

    /**
     * Calculates the length of the TORA for the given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    //REFACTORING stuff
    public int getTora(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);

        if (!runway.hasRunwayObstacle()) {
            //no obstacle
            return runway.getOriginalTora();
        }
        RunwayObstacle runwayObstacle = runway.getRunwayObstacle();

        if (checkSide(runwayObstacle, side)) {
            //Plane taking-off away from obstacle
            return runway.getOriginalTora()
                    - runwayObstacle.getThresholdDistance()
                    - blastProtectionValue
                    - getDisplacedThresholdLength(side);
        } else {
            //Plane taking-off towards obstacle
            int slopeCalculation = getSlopeCalculation(runwayObstacle);
            if (slopeCalculation < resaValue) {
                slopeCalculation = resaValue;
            }
            return runwayObstacle.getThresholdDistance()
                    + getDisplacedThresholdLength(side)
                    - slopeCalculation
                    - stripValue;
        }
    }

    /**
     * Calculates the length of the TODA for the given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getToda(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);

        if (!runway.hasRunwayObstacle()) {
            //no obstacle
            return runway.getOriginalToda();
        }
        RunwayObstacle runwayObstacle = runway.getRunwayObstacle();

        if (checkSide(runwayObstacle, side)) {
            //Plane taking-off away from obstacle
            return getTora(side) + getClearwayLength(side);
        } else {
            //Plane taking-off towards obstacle
            return getTora(side);
        }
    }

    /**
     * Calculates the length of the ASDA for the given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getAsda(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);

        if (!runway.hasRunwayObstacle()) {
            //no obstacle
            return runway.getOriginalAsda();
        }
        RunwayObstacle runwayObstacle = runway.getRunwayObstacle();

        if (checkSide(runwayObstacle, side)) {
            //Plane taking-off away from obstacle
            return getTora(side) + getStopwayLength(side);
        } else {
            //Plane taking-off towards obstacle
            return getTora(side);
        }
    }

    /**
     * Calculates the length of the LDA for the given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getLda(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);

        if (!runway.hasRunwayObstacle()) {
            //no obstacle
            return runway.getOriginalLda();
        }
        RunwayObstacle runwayObstacle = runway.getRunwayObstacle();
        int distanceToCurrentThreshold = runwayObstacle.getThresholdDistance();
        int distanceToOppositeThreshold = getLogicalRunwayForSide(RunwaySide.opposite(side))
                .getRunwayObstacle().getThresholdDistance();

        if (distanceToOppositeThreshold > distanceToCurrentThreshold) {
            //Plane landing over obstacle
            int slopeCalculation = getSlopeCalculation(runwayObstacle) + stripValue;
            if (slopeCalculation < blastProtectionValue) {
                slopeCalculation = blastProtectionValue;
            }
            return runway.getOriginalLda() - runwayObstacle.getThresholdDistance() - slopeCalculation;
        } else {
            //Plane landing towards obstacle
            return runwayObstacle.getThresholdDistance() - resaValue - stripValue;
        }
    }

    /**
     * Calculates starting positions for Landing Values (LDA) for a given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getLandingObstacleOffest(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);
        if (runway.hasRunwayObstacle()) {
            RunwayObstacle runwayObstacle = runway.getRunwayObstacle();
            if (checkSide(runwayObstacle, side)) {
                //Landing over obstacle
                int temporaryThresholdLength = getSlopeCalculation(runwayObstacle) + stripValue;
                if (temporaryThresholdLength < blastProtectionValue) {
                    temporaryThresholdLength = blastProtectionValue;
                }
                switch (side) {
                    case LOWER_THRESHOLD:
                        return getThresholdPosition(side)
                                + runwayObstacle.getThresholdDistance()
                                + temporaryThresholdLength;
                    case HIGHER_THRESHOLD:
                        return getThresholdPosition(side)
                                - runwayObstacle.getThresholdDistance()
                                - temporaryThresholdLength;
                    default:
                        return 0;
                }
            } else {
                //Landing towards obstacle
                return getThresholdPosition(side);
            }
        } else {
            return getThresholdPosition(side);
        }
    }

    /**
     * Calculates starting positions for Take-Off values (TORA,TODA,ASDA) for a given runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getTakeOffObstacleOffset(RunwaySide side) {
        LogicalRunway runway = getLogicalRunwayForSide(side);
        if (runway.hasRunwayObstacle()) {
            RunwayObstacle runwayObstacle = runway.getRunwayObstacle();
            if (checkSide(runwayObstacle, side)) {
                //Take-off away from obstacle
                switch (side) {
                    case LOWER_THRESHOLD:
                        return getThresholdPosition(side)
                                + runwayObstacle.getThresholdDistance()
                                + blastProtectionValue;
                    case HIGHER_THRESHOLD:
                        return getThresholdPosition(side)
                                - runwayObstacle.getThresholdDistance()
                                - blastProtectionValue;
                    default:
                        return 0;
                }
            } else {
                //Take-off Towards obstacle
                return getRunwayPosition(side);
            }
        } else {
            return getRunwayPosition(side);
        }
    }

    /**
     * Get the distance to the obstacle for the specified runway side.
     * Obstacle has to be present at the opposite side.
     *
     * @param side the side of the runway the distance should be computed for
     * @return the distance to the obstacle
     */
    public int getObstacleThresholdDistance(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(RunwaySide.opposite(side));
        if (logicalRunway.hasRunwayObstacle()) {
            RunwayObstacle runwayObstacle = logicalRunway.getRunwayObstacle();
            var distanceBetweenThresholds = this.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD)
                    - this.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
            return distanceBetweenThresholds - (runwayObstacle.getThresholdDistance()
                    + runwayObstacle.getObstacle().getLength());
        } else {
            throw new IllegalArgumentException("Cannot calculate distance to obstacle because there is no obstacle "
                    + "on side " + side);
        }
    }

    /**
     * checks what side of the runway the obstacle is on.
     * @param runwayObstacle the runway obstacle
     * @param side the current runway side
     * @return true if it is closer to the current side, false if not
     */
    private boolean checkSide(RunwayObstacle runwayObstacle, RunwaySide side) {
        int distanceToCurrentThreshold = runwayObstacle.getThresholdDistance() + getDisplacedThresholdLength(side);
        int distanceToOppositeThreshold = getLogicalRunwayForSide(RunwaySide.opposite(side))
                .getRunwayObstacle().getThresholdDistance() + getDisplacedThresholdLength(RunwaySide.opposite(side));
        if (distanceToCurrentThreshold < distanceToOppositeThreshold) {
            //closer to current threshold
            return true;
        }
        //closer to opposite threshold
        return false;
    }

    /**
     * calculates the 1/50 slope for an obstacle.
     * @param runwayObstacle the obstacle to calculate the slope for
     * @return the slope calculation
     */
    private int getSlopeCalculation(RunwayObstacle runwayObstacle) {
        return runwayObstacle.getObstacle().getHeight() * 50;
    }

    /**
     * Calculates the length of the stopway on the opposite side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getStopwayLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalAsda() - logicalRunway.getOriginalTora();
    }

    /**
     * Calculates the position of the stopway on the opposite side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getStopwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                        - this.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    /**
     * Calculates the length of the clearway on the opposite side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getClearwayLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalToda() - logicalRunway.getOriginalTora();
    }

    /**
     * Calculates the position of the clearway on the opposite side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getClearwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                        - this.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    /**
     * Calculates the length of the margin on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getRunwayMarginLength(RunwaySide side) {
        if (this.getClearwayLength(RunwaySide.opposite(side)) > 60) {
            return this.getClearwayLength(RunwaySide.opposite(side));
        } else {
            return this.getStopwayLength(RunwaySide.opposite(side)) + 60;
        }

    }

    /**
     * Calculates the length of the runway.
     *
     * @return the calculated value
     */
    public int getRunwayLength() {
        // as the tora is the same for both sides of the runway, the side doesn't matter here
        LogicalRunway logicalRunway = physicalRunway.getLowerThreshold();
        return logicalRunway.getOriginalTora();
    }

    /**
     * Calculates the starting position of the runway on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getRunwayPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD) + this.getRunwayLength();
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    /**
     * Calculates the length of the strip.
     *
     * @return the calculated value
     */
    public int getStripLength() {
        return 60 + this.getStopwayLength(RunwaySide.LOWER_THRESHOLD) + this.getRunwayLength()
                + this.getStopwayLength(RunwaySide.HIGHER_THRESHOLD) + 60;
    }

    /**
     * Calculates the starting position of the strip.
     *
     * @return the calculated value
     */
    public int getStripPosition() {
        return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD) - this.getStopwayLength(RunwaySide.LOWER_THRESHOLD)
                - 60;
    }

    /**
     * Calculates the length of the displaced threshold on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getDisplacedThresholdLength(RunwaySide side) {
        LogicalRunway logicalRunway = this.getLogicalRunwayForSide(side);
        return logicalRunway.getOriginalTora() - logicalRunway.getOriginalLda();
    }

    /**
     * Calculates the position of the displaced threshold on the given side of the runway.
     *
     * @param side the side the value will be calculated for
     * @return the calculated value
     */
    public int getThresholdPosition(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                        + this.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);
            case HIGHER_THRESHOLD:
                return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD)
                        - this.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }

    /**
     * Calculates the length of all elements that need to be visualised.
     *
     * @return the calculated value
     */
    public int getTotalVisualisationLength() {
        return this.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD)
                + this.getRunwayMarginLength(RunwaySide.HIGHER_THRESHOLD);
    }

    /**
     * Calculates the logical runway for a given runway side.
     *
     * @param side the runway side
     * @return the logical runway for the specified runway side
     */
    private LogicalRunway getLogicalRunwayForSide(RunwaySide side) {
        switch (side) {
            case LOWER_THRESHOLD:
                return physicalRunway.getLowerThreshold();
            case HIGHER_THRESHOLD:
                return physicalRunway.getHigherThreshold();
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }
    
    /**
     * Calculates the position of the left side of the obstacle.
     * 
     * @return the position of the left side of the obstacle.
     */
    public int getObstaclePosition() {
        return physicalRunway.getLowerThreshold().getRunwayObstacle().getThresholdDistance()
                + getThresholdPosition(RunwaySide.LOWER_THRESHOLD);
    }


}
