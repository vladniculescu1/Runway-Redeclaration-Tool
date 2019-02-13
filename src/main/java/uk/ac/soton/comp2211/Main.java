package uk.ac.soton.comp2211;

import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.MainPanel;
import uk.ac.soton.comp2211.view.center.DisplayTabbedPane;
import uk.ac.soton.comp2211.view.center.SideOnPanel;
import uk.ac.soton.comp2211.view.center.TopDownPanel;
import uk.ac.soton.comp2211.view.center.TopDownRotatedPanel;
import uk.ac.soton.comp2211.view.east.DistancesPanel;
import uk.ac.soton.comp2211.view.east.EastPanel;
import uk.ac.soton.comp2211.view.east.ObstaclePanel;
import uk.ac.soton.comp2211.view.east.RunwayPanel;
import uk.ac.soton.comp2211.view.south.*;

/**
 * The class containing the application's main method.
 */
public class Main {

    /**
     * Constructs the main window frame.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        new MainFrame(
                new MainPanel(
                        new DisplayTabbedPane(
                                new TopDownPanel(),
                                new TopDownRotatedPanel(),
                                new SideOnPanel()
                        ),
                        new EastPanel(
                                new RunwayPanel(),
                                new ObstaclePanel(),
                                new DistancesPanel()
                        ),
                        new SouthPanel(
                                new DirectionPanel(),
                                new UsagePanel(),
                                new XmlPanel(),
                                new NotificationsPanel()
                        )
                )
        );
    }

}
