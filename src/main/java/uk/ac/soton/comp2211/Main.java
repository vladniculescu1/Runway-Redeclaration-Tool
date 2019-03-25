package uk.ac.soton.comp2211;

import com.alee.laf.LookAndFeelException;
import com.alee.laf.WebLookAndFeel;
import uk.ac.soton.comp2211.model.*;

import java.awt.*;

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

        SplashScreen.getSplashScreen();

        try {
            WebLookAndFeel.install();
        } catch (LookAndFeelException e) {
            System.err.println(e.getMessage());
        }

        Application application;

        if (args.length >= 1) {
            ApplicationData data = getDemoData();
            application = new Application(data);
        } else {
            application = new Application();
        }

        application.createMainframe();

    }

    private static ApplicationData getDemoData() {

        Airport airport = new Airport();

        ObstacleStorage obstacleStorage = new ObstacleStorage();

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

        RunwaySelection runwaySelection = new RunwaySelection();
        runwaySelection.setSelectedRunway(physicalRunway);

        return new ApplicationData(airport, runwaySelection, obstacleStorage);

    }

}