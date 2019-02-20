package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.geom.Path2D;

public class ArrowSeries extends Path2D.Double {

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
