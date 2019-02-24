package uk.ac.soton.comp2211.draw.shape;

import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.geom.Path2D;

/**
 * A shape that represents a series of consecutive chevrons.
 */
public class ChevronSeries extends Path2D.Double {

    /**
     * A series of chevrons starting from a given position, with a given with. The runway side adjust the direction
     * in which the chevrons are drawn.
     *
     * @param startPos the starting position
     * @param width the width of each chevron
     * @param length the length of the series (all chevrons)
     * @param side the side of the runway
     */
    public ChevronSeries(double startPos, double width, double length, RunwaySide side) {

        switch (side) {
            case LOWER_THRESHOLD: {
                var currentPos = startPos + length;
                while (currentPos > startPos + 50) {
                    moveTo(currentPos, 0);
                    lineTo(currentPos - 50, - width / 2);
                    moveTo(currentPos, 0);
                    lineTo(currentPos - 50, width / 2);
                    currentPos -= 50;
                }
                break;
            }
            case HIGHER_THRESHOLD: {
                var currentPos = startPos;
                var endPos = currentPos + length;
                while (currentPos < endPos - 50) {
                    moveTo(currentPos, 0);
                    lineTo(currentPos + 50, - width / 2);
                    moveTo(currentPos, 0);
                    lineTo(currentPos + 50, width / 2);
                    currentPos += 50;
                }
                break;
            }
            default:
                throw new UnsupportedOperationException("Cannot draw chevron series for side " + side);
        }

    }

}
