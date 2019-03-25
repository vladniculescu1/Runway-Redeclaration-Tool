package uk.ac.soton.comp2211.view.center;

import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.draw.DrawExecutor;
import uk.ac.soton.comp2211.model.RunwaySelection;

import javax.swing.*;
import java.awt.*;

/**
 * This panel shows the runway in a top down view, with the runway aligned horizontally.
 */
public class SideOnPanel extends JPanel implements Observer {

    private DrawExecutor drawExecutor;
    private RunwaySelection runwaySelection;

    /**
     * Constructs a new top down panel.
     * @param drawExecutor the draw executor that is used for visualisation
     * @param runwaySelection the selected runway
     */
    public SideOnPanel(RunwaySelection runwaySelection, DrawExecutor drawExecutor) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;
        this.drawExecutor = drawExecutor;
        this.setBackground(new Color(208, 240, 249));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        this.drawExecutor.executeDrawers(g2d, this.getWidth(), this.getHeight());

        g2d.dispose();
    }

    @Override
    public void notifyUpdate() {
        this.repaint();
    }
}
