package uk.ac.soton.comp2211.view.modal;

import uk.ac.soton.comp2211.view.MainFrame;

import javax.swing.*;

public class ShowCalculationFrame extends JDialog {
    /**
     * (View) Constructor for AssignObstacleFrame.
     * @param mainFrame The frame of the main program, to allow blocking input to it.
     */
    public ShowCalculationFrame(MainFrame mainFrame)    {
        super(mainFrame, ModalityType.APPLICATION_MODAL);

        this.setTitle("Assign Obstacle to Runway");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    public void close() {
        this.setVisible(false);
    }

    /**
     * 'Creates' this frame (makes it visible and fixes related issues).
     * @param assignObstaclePanel The content visible in this frame.
     */
    public void create(AssignObstaclePanel assignObstaclePanel) {
        this.setContentPane(assignObstaclePanel);
        this.pack();
        this.setVisible(true);
    }

}
