package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * Calculates different values of the physical and logical runways.
 */
public abstract class Calculator {

    protected PhysicalRunway physicalRunway;
    protected LogicalRunway logicalRunway;

    /**
     * Instantiate new length calculator with the given physical runway. Sets the current
     * logical runway according to the current runway direction.
     *
     * @param runway the physical runway for which the value will be calculated.
     * @param side the side that specifies the logical runway the for which the value will be calculated.
     */
    public Calculator(PhysicalRunway runway, RunwaySide side) {
        this.physicalRunway = runway;
        switch (side) {
            case HIGHER_THRESHOLD:
                this.logicalRunway = physicalRunway.getHigherThreshold();
                break;
            case LOWER_THRESHOLD:
                this.logicalRunway = physicalRunway.getLowerThreshold();
                break;
            default:
                throw new UnsupportedOperationException("Cannot instantiate value calculator for runway direction"
                        + physicalRunway.getRunwayDirection());
        }
    }

    public abstract int calculate();

}
