package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

public class StopwayValueCalculator extends Calculator {

    public StopwayValueCalculator(PhysicalRunway runway, RunwaySide direction) {
        super(runway, direction);
    }

    @Override
    public int calculate() {
        return logicalRunway.getOriginalAsda() - logicalRunway.getOriginalToda();
    }
}
