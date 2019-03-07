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

        LogicalRunway logicalRunway3 = new LogicalRunway(2985, 3346,
                3346, 3346, 7, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway4 = new LogicalRunway(2985, 2986,
                2986, 2986, 25, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1,
                RunwaySide.LOWER_THRESHOLD);
        PhysicalRunway physicalRunway2 = new PhysicalRunway(logicalRunway4, logicalRunway3,
                RunwaySide.LOWER_THRESHOLD);

        airport.addRunway(physicalRunway);
        airport.addRunway(physicalRunway2);


        RunwaySelection runwaySelection = new RunwaySelection(DrawMode.TOP_DOWN);
        runwaySelection.setSelectedRunway(physicalRunway);

        List<Drawer> topDownDrawer = List.of(

                new SurroundingsDrawer(), new StripDrawer(),
                new StopwayDrawer(), new ClearwayDrawer(),
                new RunwayDrawer(), new CentreLineDrawer(), new ThresholdDrawer(),
                new TodaDrawer(), new ToraDrawer(), new AsdaDrawer(), new LdaDrawer(),
                new RunwayDrawer(), new CentreLineDrawer(), new ThresholdDrawer(),
                new DesignatorDrawer(), new ObstacleDrawer()

        );

        DrawExecutor topDownDrawExecutor = new DrawExecutor(topDownDrawer, runwaySelection);
        AssignObstacleController assignObstacleController = new AssignObstacleController(runwaySelection);
        RunwaySelectionController runwaySelectionController = new RunwaySelectionController(runwaySelection,airport);
        

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
                                new RunwayPanel(airport, runwaySelection, runwaySelectionController),
                                new ObstaclePanel(runwaySelection, assignObstacleController),
                                new DistancesPanel(runwaySelection)
                        ),
                        new SouthPanel(
                                new DirectionPanel(runwaySelection, new DirectionController(runwaySelection)),
                                new XmlPanel(),
                                new NotificationsPanel()
                        )
                )
        );
        assignObstacleController.addMainFrame(mainFrame);
        runwaySelectionController.addMainFrame(mainFrame);
    }

}
