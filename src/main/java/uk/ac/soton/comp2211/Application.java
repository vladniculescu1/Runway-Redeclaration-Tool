package uk.ac.soton.comp2211;

import uk.ac.soton.comp2211.controller.*;
import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.draw.sideon.*;
import uk.ac.soton.comp2211.draw.topdown.*;
import uk.ac.soton.comp2211.model.Airport;
import uk.ac.soton.comp2211.model.ObstacleStorage;
import uk.ac.soton.comp2211.model.RunwaySelection;
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
import uk.ac.soton.comp2211.view.south.southNorth.SouthNorthPanel;
import uk.ac.soton.comp2211.view.south.southNorth.VisibleDistancesPanel;
import uk.ac.soton.comp2211.view.south.southSouth.DirectionPanel;
import uk.ac.soton.comp2211.view.south.southSouth.NotificationsPanel;
import uk.ac.soton.comp2211.view.south.southSouth.SouthSouthPanel;
import uk.ac.soton.comp2211.view.south.southSouth.XmlPanel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the application consisting of the main UI frame and its data.
 *
 */
public class Application {

    private JFrame mainframe;
    private ApplicationData data;

    /**
     * Constructs a new application with empty application data.
     */
    public Application() {
        Airport airport = new Airport();
        ObstacleStorage obstacleStorage = new ObstacleStorage();
        RunwaySelection runwaySelection = new RunwaySelection();
        this.data = new ApplicationData(airport, runwaySelection, obstacleStorage);

    }

    /**
     * Constructs a new application with the given application data.
     *
     * @param applicationData initial data of the application
     */
    public Application(ApplicationData applicationData) {
        this.data = applicationData;
    }

    /**
     * Creates the main UI window.
     */
    public void createMainframe() {

        if (mainframe != null) {
            mainframe.dispose();
        }
        Airport airport = data.getAirport();
        ObstacleStorage obstacleStorage = data.getObstacleStorage();
        RunwaySelection runwaySelection = data.getRunwaySelection();

        List<Drawer> topDownDrawerWithoutDistance = new ArrayList<>(List.of(

                new TopDownSurroundingsDrawer(), new TopDownStripDrawer(), new DirectionArrowDrawer(),
                new TopDownStopwayDrawer(), new TopDownClearwayDrawer(),
                new TopDownRunwayDrawer(), new TopDownCentreLineDrawer(), new TopDownThresholdDrawer(),
                new ResaDrawer(), new TocsDrawer(), new BlastDrawer(),
                new TopDownRunwayDrawer(), new TopDownCentreLineDrawer(), new TopDownThresholdDrawer(),
                new TopDownDesignatorDrawer(), new TopDownObstacleDrawer()

        ));

        List<Drawer> sideOnDrawer = List.of(
                new SideOnClearwayDrawer(), new SideOnStopwayDrawer(),
                new TodaDrawer(), new ToraDrawer(), new AsdaDrawer(), new LdaDrawer(),
                new ResaDrawer(), new TocsDrawer(), new BlastDrawer(), new SideOnSlopeDrawer(),
                new SideOnRunwayDrawer(), new SideOnThresholdDrawer(),
                new SideOnDesignatorDrawer(), new SideOnObstacleDrawer(), new DirectionArrowDrawer()
        );


        DrawExecutor topDownDrawExecutor = new DrawExecutor(topDownDrawerWithoutDistance, runwaySelection);
        DrawExecutor sideOnDrawExecutor = new DrawExecutor(sideOnDrawer, runwaySelection);

        AssignObstacleController assignObstacleController = new AssignObstacleController(runwaySelection,
                obstacleStorage);
        RunwaySelectionController runwaySelectionController = new RunwaySelectionController(runwaySelection,airport);
        ShowCalculationController showCalculationController = new ShowCalculationController(runwaySelection);
        ImportExportController importExportController =
                new ImportExportController(topDownDrawExecutor, sideOnDrawExecutor, this);
        VisibleDistancesController visibleDistancesController = new VisibleDistancesController(runwaySelection,
                topDownDrawExecutor);


        this.mainframe = new MainFrame(
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
                                new SouthNorthPanel(
                                        new VisibleDistancesPanel(runwaySelection, visibleDistancesController)
                                ),
                                new SouthSouthPanel(
                                        new DirectionPanel(runwaySelection,
                                        new DirectionController(runwaySelection)),

                                        new ExportPanel(importExportController),
                                        new ImportPanel(importExportController))
                        ),
                        new NotificationsPanel()
                )
        );
        importExportController.addMainFrame(mainframe);
    }

    public ApplicationData getData() {
        return data;
    }

    public void setData(ApplicationData data) {
        this.data = data;
    }
}
