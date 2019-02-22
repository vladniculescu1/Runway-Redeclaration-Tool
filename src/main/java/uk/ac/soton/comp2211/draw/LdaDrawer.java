package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

public class LdaDrawer extends DistanceDrawer {

    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        RunwaySide side = runwaySelection.getSelectedRunway().getRunwayDirection();
        Calculator calc = runwaySelection.getSelectedRunway().getCalculator();

        var visualisationLength = calc.getTotalVisualisationLength();
        var runwayWidth = visualisationLength * (DrawConstants.STRIP_WIDTH_PERCENTAGE / 100);
        int startX = 0;
        try{
            startX = calc.getThresholdPosition(side);
        }catch (Error e){
            startX = calc.getRunwayPosition(side);
        }
        int distance = calc.getLda(side);
        double height = - ((runwayWidth/14)*3);

        switch (side){
            case LOWER_THRESHOLD:
                drawDistance(g2d, startX, distance, (int) height , "LDA");
                break;
            case HIGHER_THRESHOLD:
                drawDistance(g2d, startX, -distance, (int) -height , "LDA");
                break;
        }
    }
}
