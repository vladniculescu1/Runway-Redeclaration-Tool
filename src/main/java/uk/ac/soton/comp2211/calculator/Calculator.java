package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;

/**
 * Calculates different values of the physical and logical runways.
 */
public abstract class Calculator {

    protected LogicalRunway logicalRunway;

    /**
     * Instantiate new length calculator with the given physical runway. Sets the current
     * logical runway according to the current runway direction.
     *
     * @param logicalRunway the logical runway for which the value will be calculated.
     */
    public Calculator(LogicalRunway logicalRunway) {
        this.logicalRunway = logicalRunway;
    }

    public abstract int calculate();

}
