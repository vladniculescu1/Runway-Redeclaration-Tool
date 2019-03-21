package uk.ac.soton.comp2211.view.south;

import java.awt.Color;
import java.awt.Font;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

/**
 * This panel displays notifications.
 */
public class NotificationsPanel extends JPanel {

    JLabel notificationText;
    int secondsToWait;
    
    /**
     * Constructs a new notification panel.
     */
    public NotificationsPanel() {
        
        notificationText = new JLabel("... content placeholder ...");
        
        Font font = new Font("Courier", Font.BOLD,16);
        notificationText.setFont(font);
        notificationText.setForeground(Color.RED);
        this.add(notificationText);
        
        this.notificationUpdate("Obstacle sucessfully added");
    }
    
    /**
     * This method displays a notification for a given number of seconds.
     * @param text the notification to be displayed
     */
    public void notificationUpdate(String text) {
        
        secondsToWait = 2;
        notificationText.setText(text);
        
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
        
        Runnable task = new Runnable() {
            @Override
            public void run() {
                secondsToWait--;
                if (secondsToWait == 0) {
                    notificationText.setText("");
                    exec.shutdown();
                }
            }
        };   
        exec.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);       
    }
}
