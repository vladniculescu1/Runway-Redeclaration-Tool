package uk.ac.soton.comp2211.view.south;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import uk.ac.soton.comp2211.model.Notification;

/**
 * This panel displays notifications.
 */
public class NotificationsPanel extends JPanel {

    Notification notification;
    
    /**
     * Constructs a new notification panel.
     * @param notif the notification to be displayed
     */
    public NotificationsPanel(Notification notif) {
        
        JLabel test = new JLabel("LOOKS GOOD");
        
        
        notification = notif;
        Font font = new Font("Courier", Font.BOLD,16);
        notification.setFont(font);;
        notification.setForeground(Color.RED);
        //this.add(notification);
        
        test.setFont(font);
        test.setForeground(Color.RED);;
        this.add(test);
    }
}
