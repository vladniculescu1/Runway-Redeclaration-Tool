package uk.ac.soton.comp2211.view.modal;

import javax.swing.*;

import uk.ac.soton.comp2211.view.MainFrame;

public class DisplayPopUpFrame extends JDialog {

    /**
     * (View) Constructor for DisplayPopUpFrame.
     * @param mainFrame The frame of the main program, to allow blocking input to it.
     * @param title The title of the JDialog Box
     */
    public DisplayPopUpFrame(MainFrame mainFrame, String title)    {
        super(mainFrame, ModalityType.APPLICATION_MODAL);
        
        this.setTitle(title);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(false);
    }

    public void close() {
        this.setVisible(false);
    }
    
    /**
     * 'Creates' this frame (makes it visible and fixes related issues).
     * @param panel The content visible in this frame.
     */
    public void create(JPanel panel) {
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);
    }
    
}
