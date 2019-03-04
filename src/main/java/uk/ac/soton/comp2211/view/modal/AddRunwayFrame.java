package uk.ac.soton.comp2211.view.modal;

import javax.swing.*;
import uk.ac.soton.comp2211.view.MainFrame;

public class AddRunwayFrame extends JDialog {
    /**
     * (View) Constructor for AddRunwayFrame.
     * @param mainFrame The frame of the main program, to allow blocking input to it.
     */
    public AddRunwayFrame(MainFrame mainFrame) {
        super(mainFrame, ModalityType.APPLICATION_MODAL);

        this.setTitle("Add Runway");
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    public void close() {
        this.setVisible(false);
    }

    /**
     * 'Creates' this frame (makes it visible and fixes related issues).
     * @param addRunwayPanel The content visible in this frame.
     */
    public void create(AddRunwayPanel addRunwayPanel) {
        this.setContentPane(addRunwayPanel);
        this.pack();
        this.setVisible(true);
    }
}
