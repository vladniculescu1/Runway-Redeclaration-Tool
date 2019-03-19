package uk.ac.soton.comp2211.view.south;

import java.awt.Color;

import javax.swing.*;

import uk.ac.soton.comp2211.Observer;

/**
 * This panel displays notifications.
 */
public class NotificationsPanel extends JPanel implements Observer {


    /**
     * Constructs a new notification panel.
     */
    public NotificationsPanel() {
        
        JLabel notificationText = new JLabel("... content placeholder ...");
        notificationText.setForeground(Color.RED);
        this.add(notificationText);
    }

    @Override
    public void notifyUpdate() {
        // TODO Auto-generated method stub
        
    }

}
