package uk.ac.soton.comp2211.draw;

import com.google.common.graph.Graph;
import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class BasicRunwayDrawer implements Drawer {


    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {
        var calculator = runwaySelection.getSelectedRunway().getCalculator();
        var visualisationLength = calculator.getTotalVisualisationLength();

        this.drawStrip(g2d, calculator, visualisationLength);
        this.drawClearways(g2d, calculator, visualisationLength);
        this.drawStopways(g2d, calculator, visualisationLength);
        this.drawRunway(g2d, calculator, visualisationLength);
        this.drawCentreLine(g2d, calculator);

    }

    private void drawRunway(Graphics2D g2d, Calculator calculator, int visualisationLength) {
        var runwayLength = calculator.getRunwayLength();
        var runwayWidth = visualisationLength * (DrawConstants.RUNWAY_WIDTH_PERCENTAGE / 100);
        var runwayPosition = calculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);

        g2d.draw(new Rectangle2D.Double(runwayPosition, - (runwayWidth / 2), runwayLength, runwayWidth));
    }

    private void drawStrip(Graphics2D g2d, Calculator calculator, int visualisationLength) {
        var stripLength = calculator.getStripLength();
        var stripWidth = visualisationLength * (DrawConstants.STRIP_WIDTH_PERCENTAGE / 100);
        var stripPosition = calculator.getStripPosition();

        g2d.draw(new Rectangle2D.Double(stripPosition, - (stripWidth / 2), stripLength, stripWidth));
    }

    private void drawClearways(Graphics2D g2d, Calculator calculator, int visualisationLength) {
        g2d.setColor(Color.red);

        var clearwayLengthHigher = calculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
        var clearwayPositionHigher = calculator.getClearwayPosition(RunwaySide.HIGHER_THRESHOLD);

        var clearwayLengthLower = calculator.getClearwayLength(RunwaySide.LOWER_THRESHOLD);
        var clearwayPositionLower = calculator.getClearwayPosition(RunwaySide.LOWER_THRESHOLD);

        var clearwayWidth = visualisationLength * (DrawConstants.CLEARWAY_WIDTH_PERCENTAGE / 100);

        if (clearwayLengthHigher > 0) {
            g2d.draw(new Rectangle2D.Double(clearwayPositionHigher, - (clearwayWidth / 2),
                    clearwayLengthHigher, clearwayWidth));
            g2d.drawString("CWY", clearwayPositionHigher, - (int) (clearwayWidth / 2) - 50);
        }
        if (clearwayLengthLower > 0) {
            g2d.draw(new Rectangle2D.Double(clearwayPositionLower, - (clearwayWidth / 2),
                    clearwayLengthLower, clearwayWidth));
            g2d.drawString("CWY", clearwayPositionLower, - (int) (clearwayWidth / 2) - 50);

        }

        g2d.setColor(Color.black);
    }

    private void drawStopways(Graphics2D g2d, Calculator calculator, int visualisationLength) {
        g2d.setColor(Color.blue);

        var stopwayLengthLower = calculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD);
        var stopwayWidth = visualisationLength * (DrawConstants.RUNWAY_WIDTH_PERCENTAGE / 100);
        var stopwayPositionLower = calculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        var stopwayLengthHigher = calculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var stopwayPositionHigher = calculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

        if (stopwayLengthHigher > 0) {
            g2d.draw(new Rectangle2D.Double(stopwayPositionHigher, - (stopwayWidth / 2),
                    stopwayLengthHigher, stopwayWidth));
            g2d.drawString("SWY", stopwayPositionHigher, - (int) (stopwayWidth / 2) - 30);

        }
        if (stopwayLengthLower > 0) {
            g2d.draw(new Rectangle2D.Double(stopwayPositionLower, - (stopwayWidth / 2),
                    stopwayLengthLower, stopwayWidth));
            g2d.drawString("SWY", stopwayPositionLower, - (int) (stopwayWidth / 2) - 30);

        }

        g2d.setColor(Color.black);
    }

    private void drawCentreLine(Graphics2D g2d, Calculator calculator) {
        var runwayLength = calculator.getRunwayLength();
        var runwayPosition = calculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);

        Stroke dashed = new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
                0, new float[]{100}, 0);
        g2d.setStroke(dashed);
        g2d.draw(new Line2D.Double(runwayPosition, 0, runwayLength, 0));
    }
}
