package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

/**
 * Calculates the clearway of a runway.
 */
public class ClearwayValueCalculator extends Calculator {

    public ClearwayValueCalculator(PhysicalRunway runway, RunwaySide direction) {
        super(runway, direction);
    }

    @Override
    public int calculate() {
        return logicalRunway.getOriginalToda() - logicalRunway.getOriginalTora();
    }




}
