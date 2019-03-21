package uk.ac.soton.comp2211.view;

import org.painlessgridbag.PainlessGridBag;
import org.painlessgridbag.PainlessGridbagConfiguration;
import uk.ac.soton.comp2211.view.center.DisplayTabbedPane;
import uk.ac.soton.comp2211.view.east.EastPanel;
import uk.ac.soton.comp2211.view.south.NotificationsPanel;
import uk.ac.soton.comp2211.view.south.SouthPanel;

import javax.swing.*;

/**
 * The main panel of the application, containing all other panels.
 */
public class MainPanel extends JPanel {

    /**
     * Constructs the main panel and places supplied child panels.
     *
     * @param displayTabbedPane the panel that will be placed in the centre of the main panel
     * @param eastPanel the panel that will be placed in the east of the main panel
     * @param southPanel the panel that will be place in the south of the main panel
     * @param notificationsPanel the panel for displaying notifications
     */
    public MainPanel(DisplayTabbedPane displayTabbedPane, EastPanel eastPanel, SouthPanel southPanel,
                     NotificationsPanel notificationsPanel) {

        // add a border of 10 px around the main panel
        this.setBorder(BorderFactory.createEmptyBorder(10,10,0,10));

        PainlessGridbagConfiguration gridbagConfiguration = new PainlessGridbagConfiguration();
        gridbagConfiguration.setFirstRowTopSpacing(0);
        gridbagConfiguration.setLastRowBottomSpacing(0);
        gridbagConfiguration.setFirstColumnLeftSpacing(0);
        gridbagConfiguration.setLastColumnRightSpacing(0);

        PainlessGridBag gridBag = new PainlessGridBag(this, gridbagConfiguration, false);
        gridBag.row().cell(displayTabbedPane).fillXY().cellY(eastPanel, 2).fillY();
        gridBag.row().cell(southPanel).fillX();
        gridBag.row().cellX(notificationsPanel, 2).fillX();

        gridBag.done();

    }
}
