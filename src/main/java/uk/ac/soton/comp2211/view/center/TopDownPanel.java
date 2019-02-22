package uk.ac.soton.comp2211.view.center;

import uk.ac.soton.comp2211.draw.DrawExecutor;

import javax.swing.*;
import java.awt.*;

/**
 * This panel shows the runway in a top down view, with the runway aligned horizontally.
 */
public class TopDownPanel extends JPanel {

    private DrawExecutor drawExecutor;

    /**
     * Constructs a new top down panel.
     * @param drawExecutor the draw executor that is used for visualisation
     */
    public TopDownPanel(DrawExecutor drawExecutor) {
        this.drawExecutor = drawExecutor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        this.drawExecutor.executeDrawers(g2d, this.getWidth(), this.getHeight());

        g2d.dispose();
    }
}
