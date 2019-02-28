package uk.ac.soton.comp2211;

import uk.ac.soton.comp2211.controller.AssignObstacleController;
import uk.ac.soton.comp2211.controller.DirectionController;
import uk.ac.soton.comp2211.controller.RunwaySelectionController;
import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.model.*;
import uk.ac.soton.comp2211.model.validate.Validator;
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

        Airport airport = new Airport();

        LogicalRunway logicalRunway1 = new LogicalRunway(3360, 3660,
                3660, 3810, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3660, 4060,
                3660, 3810, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1,
                RunwaySide.LOWER_THRESHOLD);

        airport.addRunway(physicalRunway);

        RunwaySelection runwaySelection = new RunwaySelection(DrawMode.TOP_DOWN);
        runwaySelection.setSelectedRunway(physicalRunway);

        List<Drawer> topDownDrawer = List.of(
                new StripDrawer(), new StopwayDrawer(), new ClearwayDrawer(),
                new RunwayDrawer(), new CentreLineDrawer(), new ThresholdDrawer(),
                new TodaDrawer(), new ToraDrawer(), new AsdaDrawer(), new LdaDrawer(),
                new RunwayDrawer(), new CentreLineDrawer(), new ThresholdDrawer(),
                new DesignatorDrawer()
        );

        DrawExecutor topDownDrawExecutor = new DrawExecutor(topDownDrawer, runwaySelection);
        AssignObstacleController assignObstacleController = new AssignObstacleController(runwaySelection);
        

        // Validation example - TODO remove later
        Validator validator = Validator.forObject(physicalRunway);
        if (!validator.isValid()) {
            System.out.println(validator.getViolationMessages());
        }

        MainFrame mainFrame = new MainFrame(
                new MainPanel(
                        new DisplayTabbedPane(
                                new TopDownPanel(runwaySelection, topDownDrawExecutor),
                                new TopDownRotatedPanel(runwaySelection, topDownDrawExecutor),
                                new SideOnPanel()
                        ),
                        new EastPanel(
                                new RunwayPanel(airport, runwaySelection,
                                        new RunwaySelectionController(runwaySelection)),
                                new ObstaclePanel(runwaySelection, assignObstacleController),
                                new DistancesPanel()
                        ),
                        new SouthPanel(
                                new DirectionPanel(runwaySelection, new DirectionController(runwaySelection)),
                                new XmlPanel(),
                                new NotificationsPanel()
                        )
                )
        );
        assignObstacleController.addMainFrame(mainFrame);
    }

}
