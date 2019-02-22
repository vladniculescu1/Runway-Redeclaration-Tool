package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.geom.Path2D;

/**
 * A shape that represents a series of consecutive arrows.
 */
public class ArrowSeries extends Path2D.Double {

    /**
     * A series of arrows starting from a given position, with a given with. The runway side adjust the direction
     * in which the arrows are drawn.
     *
     * @param startPos the starting position
     * @param width the width of each arrrow
     * @param length the length of the series (all arrows)
     * @param side the side of the runway
     */
    public ArrowSeries(double startPos, double width, double length, RunwaySide side) {

        switch (side) {
            case LOWER_THRESHOLD: {
                var currentPos = startPos + length;
                while (currentPos > startPos + 80) {
                    moveTo(currentPos, 0);
                    lineTo(currentPos - 30, - width / 15);
                    moveTo(currentPos, 0);
                    lineTo(currentPos - 30, width / 15);
                    moveTo(currentPos, 0);
                    lineTo(currentPos - 70, 0);
                    currentPos -= 80;
                }
                break;
            }
            case HIGHER_THRESHOLD: {
                var currentPos = startPos;
                var endPos = currentPos + length;
                while (currentPos < endPos - 80) {
                    moveTo(currentPos, 0);
                    lineTo(currentPos + 30, - width / 5);
                    moveTo(currentPos, 0);
                    lineTo(currentPos + 30, width / 5);
                    moveTo(currentPos, 0);
                    lineTo(currentPos + 70, 0);
                    currentPos += 80;
                }

                break;
            }
            default:
                throw new UnsupportedOperationException("Cannot draw chevron series for side " + side);
        }

    }

}
