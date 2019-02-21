package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.geom.Path2D;

public class ChevronSeries extends Path2D.Double {

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
