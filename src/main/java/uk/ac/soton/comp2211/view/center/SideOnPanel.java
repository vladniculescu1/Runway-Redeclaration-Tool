package uk.ac.soton.comp2211.view.center;

import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.draw.DrawExecutor;
import uk.ac.soton.comp2211.model.RunwaySelection;

import javax.swing.*;
import java.awt.*;

/**
 * This panel shows the runway in a side on view.
 */
public class SideOnPanel extends JPanel implements Observer {

    private DrawExecutor drawExecutor;
    private RunwaySelection runwaySelection;

    /**
     * Constructs a new side on panel.
     */
    public SideOnPanel(RunwaySelection runwaySelection, DrawExecutor drawExecutor) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;
        this.drawExecutor = drawExecutor;
    }

    @Override
    public void notifyUpdate() {
        this.repaint();
    }
}
