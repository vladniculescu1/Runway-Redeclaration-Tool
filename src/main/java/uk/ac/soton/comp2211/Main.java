package uk.ac.soton.comp2211;

import uk.ac.soton.comp2211.controller.DirectionController;
import uk.ac.soton.comp2211.controller.UsageController;
import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.*;
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

import java.util.List;

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

        LogicalRunway logicalRunway1 = new LogicalRunway(3600, 3700,
                3700, 3902, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3700, 3962,
                3700, 3884, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1,
                RunwaySide.LOWER_THRESHOLD, RunwayMode.TAKEOFF);

        RunwaySelection runwaySelection = new RunwaySelection(DrawMode.TOP_DOWN);
        runwaySelection.setSelectedRunway(physicalRunway);

        List<Drawer> topDownDrawer = List.of(
                new StripDrawer(), new StopwayDrawer(), new ClearwayDrawer(),
                new RunwayDrawer(), new CentreLineDrawer(), new ThresholdDrawer()
        );
        DrawExecutor topDownDrawExecutor = new DrawExecutor(topDownDrawer, runwaySelection);

        new MainFrame(
                new MainPanel(
                        new DisplayTabbedPane(
                                new TopDownPanel(topDownDrawExecutor),
                                new TopDownRotatedPanel(),
                                new SideOnPanel()
                        ),
                        new EastPanel(
                                new RunwayPanel(),
                                new ObstaclePanel(),
                                new DistancesPanel()
                        ),
                        new SouthPanel(
                                new DirectionPanel(runwaySelection, new DirectionController(runwaySelection)),
                                new UsagePanel(runwaySelection, new UsageController(runwaySelection)),
                                new XmlPanel(),
                                new NotificationsPanel()
                        )
                )
        );
    }

}
