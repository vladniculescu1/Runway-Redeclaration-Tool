package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

public class StopwayValueCalculator extends Calculator {

    public StopwayValueCalculator(LogicalRunway logicalRunway) {
        super(logicalRunway);
    }

    @Override
    public int calculate() {
        return logicalRunway.getOriginalAsda() - logicalRunway.getOriginalToda();
    }
}
