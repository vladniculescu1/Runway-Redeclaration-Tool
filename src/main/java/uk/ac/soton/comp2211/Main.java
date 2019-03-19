package uk.ac.soton.comp2211;

import uk.ac.soton.comp2211.controller.*;
import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.draw.sideon.*;
import uk.ac.soton.comp2211.draw.topdown.TopDownCentreLineDrawer;
import uk.ac.soton.comp2211.draw.topdown.TopDownClearwayDrawer;
import uk.ac.soton.comp2211.draw.topdown.TopDownDesignatorDrawer;
import uk.ac.soton.comp2211.draw.topdown.TopDownObstacleDrawer;
import uk.ac.soton.comp2211.draw.topdown.TopDownRunwayDrawer;
import uk.ac.soton.comp2211.draw.topdown.TopDownStopwayDrawer;
import uk.ac.soton.comp2211.draw.topdown.TopDownStripDrawer;
import uk.ac.soton.comp2211.draw.topdown.TopDownSurroundingsDrawer;
import uk.ac.soton.comp2211.draw.topdown.TopDownThresholdDrawer;
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

                new TopDownSurroundingsDrawer(), new TopDownStripDrawer(), new DirectionArrowDrawer(),
                new TopDownStopwayDrawer(), new TopDownClearwayDrawer(),
                new TopDownRunwayDrawer(), new TopDownCentreLineDrawer(), new TopDownThresholdDrawer(),
                new TodaDrawer(), new ToraDrawer(), new AsdaDrawer(), new LdaDrawer(),
                new ResaDrawer(), new TocsDrawer(), new BlastDrawer(),
                new TopDownRunwayDrawer(), new TopDownCentreLineDrawer(), new TopDownThresholdDrawer(),
                new TopDownDesignatorDrawer(), new TopDownObstacleDrawer()

        );
        
        List<Drawer> sideOnDrawer = List.of(
                new SideOnClearwayDrawer(), new SideOnStopwayDrawer(), 
                new TodaDrawer(), new ToraDrawer(), new AsdaDrawer(), new LdaDrawer(),
                new ResaDrawer(), new TocsDrawer(), new BlastDrawer(), new SideOnSlopeDrawer(),
                new SideOnRunwayDrawer(), new SideOnThresholdDrawer(), 
                new SideOnDesignatorDrawer(), new SideOnObstacleDrawer(), new DirectionArrowDrawer()
        );

        DrawExecutor topDownDrawExecutor = new DrawExecutor(topDownDrawer, runwaySelection);
        DrawExecutor sideOnDrawExecutor = new DrawExecutor(sideOnDrawer, runwaySelection);
        AssignObstacleController assignObstacleController = new AssignObstacleController(runwaySelection);
        RunwaySelectionController runwaySelectionController = new RunwaySelectionController(runwaySelection,airport);
        ShowCalculationController showCalculationController = new ShowCalculationController(runwaySelection);
        ImportExportController importExportController =
                new ImportExportController(topDownDrawExecutor, sideOnDrawExecutor);


        importExportController.addMainFrame(
                new MainFrame(
                    new MainPanel(
                        new DisplayTabbedPane(
                                new TopDownPanel(runwaySelection, topDownDrawExecutor),
                                new TopDownRotatedPanel(runwaySelection, topDownDrawExecutor),
                                new SideOnPanel(runwaySelection, sideOnDrawExecutor)
                        ),
                        new EastPanel(
                                new RunwayPanel(airport, runwaySelection, runwaySelectionController),
                                new ObstaclePanel(runwaySelection, assignObstacleController),
                                new DistancesPanel(runwaySelection, showCalculationController)
                        ),
                        new SouthPanel(
                                new DirectionPanel(runwaySelection, new DirectionController(runwaySelection)),
                                new ExportPanel(importExportController),
                                new ImportPanel(importExportController)
                        ),
                        new NotificationsPanel()
                    )
                )
        );
    }

}
