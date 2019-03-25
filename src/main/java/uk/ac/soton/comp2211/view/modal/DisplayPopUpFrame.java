package uk.ac.soton.comp2211.view.modal;

import javax.swing.*;

public class DisplayPopUpFrame extends JDialog {

    private static JFrame mainFrame;

    /**
     * (View) Constructor for DisplayPopUpFrame.
     * @param title The title of the JDialog Box
     */
    public DisplayPopUpFrame(String title) {
        super(DisplayPopUpFrame.mainFrame, ModalityType.DOCUMENT_MODAL);
        
        this.setTitle(title);
        this.pack();
        this.setVisible(false);
        this.setResizable(false);
    }

    public static void setMainFrame(JFrame parent) {
        DisplayPopUpFrame.mainFrame = parent;
    }

    public static JFrame getMainFrame() {
        return DisplayPopUpFrame.mainFrame;
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
        this.setLocationRelativeTo(DisplayPopUpFrame.mainFrame);
        this.setVisible(true);
    }
    
}
