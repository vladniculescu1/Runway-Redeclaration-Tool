package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.DynamicLengthCalculator;
import uk.ac.soton.comp2211.calculator.DynamicPositionCalculator;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the LDA value onto the runway.
 */
public class LdaDrawer implements Drawer {

    private boolean globalLDAFlag = true;

    public boolean getGlobalLDAFlag() {
        return globalLDAFlag;
    }

    public void setGlobalLDAFlag(boolean globalLDAFlag) {
        this.globalLDAFlag = globalLDAFlag;
    }

    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway) {
        RunwaySide side = physicalRunway.getRunwayDirection();
        DynamicLengthCalculator lengthCalculator = physicalRunway.getDynamicLengthCalculator();
        DynamicPositionCalculator positionCalculator = physicalRunway.getDynamicPositionCalculator();

        int startX = positionCalculator.getLandingObstacleOffset(side);
        int distance = lengthCalculator.getLda(side);

        if (getGlobalLDAFlag()) {
            switch (side) {
                case LOWER_THRESHOLD:
                    DrawUtils.dashedLabelledDistance(g2d, startX, distance, DrawConstants.LDA_POSITION, "LDA");
                    break;
                case HIGHER_THRESHOLD:
                    DrawUtils.dashedLabelledDistance(g2d, startX, -distance, DrawConstants.LDA_POSITION, "LDA");
                    break;
                default:
                    throw new UnsupportedOperationException("Cannot draw LDA for side " + side);
            }
        }
    }
}
