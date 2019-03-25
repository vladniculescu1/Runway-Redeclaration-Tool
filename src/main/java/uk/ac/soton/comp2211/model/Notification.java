package uk.ac.soton.comp2211.model;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;

public class Notification extends JLabel {
    
    int secondsToWait;
    
    public Notification(String text) {
        
        this.setText(text);
    }
    
    /**
     * The method that displays notifications.
     * @param text the text of the notification
     */
    public void notificationUpdate(String text) {
        
        secondsToWait = 5;
        Notification notif = this;
        this.setText(text);
        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
        
        Runnable task = new Runnable() {
            @Override
            public void run() {
                secondsToWait--;
                if (secondsToWait == 0) {
                    notif.setText(" ");
                    exec.shutdown();
                }
            }
        };        
        exec.scheduleAtFixedRate(task, 1, 1, TimeUnit.SECONDS);    
    }
}
