package uk.ac.soton.comp2211;

import uk.ac.soton.comp2211.controller.*;
import uk.ac.soton.comp2211.draw.*;
import uk.ac.soton.comp2211.draw.sideon.*;
import uk.ac.soton.comp2211.draw.topdown.*;
import uk.ac.soton.comp2211.model.Airport;
import uk.ac.soton.comp2211.model.Notification;
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
import uk.ac.soton.comp2211.view.modal.DisplayPopUpFrame;
import uk.ac.soton.comp2211.view.south.*;
import uk.ac.soton.comp2211.view.south.VisibleDistancesPanel;
import uk.ac.soton.comp2211.view.south.DirectionPanel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the application consisting of the main UI frame and its data.
 *
 */
public class Application {

    private JFrame mainFrame;
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

        if (mainFrame != null) {
            mainFrame.dispose();
        }
        Airport airport = data.getAirport();
        ObstacleStorage obstacleStorage = data.getObstacleStorage();
        RunwaySelection runwaySelection = data.getRunwaySelection();
        Notification notification = new Notification(" ");

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

        DrawExecutor topDownDrawExecutor = new DrawExecutor(topDownDrawer, runwaySelection, true);
        DrawExecutor sideOnDrawExecutor = new DrawExecutor(sideOnDrawer, runwaySelection, false);

        AssignObstacleController assignObstacleController = new AssignObstacleController(runwaySelection,
                obstacleStorage, notification);
        RunwaySelectionController runwaySelectionController = new RunwaySelectionController(runwaySelection,
                airport, notification);
        ShowCalculationController showCalculationController = new ShowCalculationController(runwaySelection);
        ImportExportController importExportController =
                new ImportExportController(topDownDrawExecutor, sideOnDrawExecutor, this);
        VisibleDistancesController visibleDistancesController = new VisibleDistancesController(runwaySelection,
                topDownDrawExecutor, sideOnDrawExecutor);

        this.mainFrame = new MainFrame(
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
                        new VisibleDistancesPanel(runwaySelection, visibleDistancesController),
                        new ExportPanel(importExportController),
                        new ImportPanel(importExportController)
                    ),
                    new NotificationsPanel(notification)
                )
        );
        importExportController.addMainFrame(mainFrame);
        runwaySelectionController.addMainFrame(mainFrame);
        DisplayPopUpFrame.setMainFrame(mainFrame);
    }

    public ApplicationData getData() {
        return data;
    }

    public void setData(ApplicationData data) {
        this.data = data;
    }
}
