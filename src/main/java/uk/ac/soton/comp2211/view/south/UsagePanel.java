package uk.ac.soton.comp2211.view.south;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This panel contains elements for the runway usage, which is either landing or take-off.
 */
public class UsagePanel extends JPanel implements Observer {

    private JRadioButton landingRadio;
    private JRadioButton takeOffRadio;

    public static final String LANDING_COMMAND = "landing";
    public static final String TAKEOFF_COMMAND = "takeoff";

    private RunwaySelection runwaySelection;

    /**
     * Constructs a new usage panel.
     *
     * @param runwaySelection the current runway selection - the model
     * @param usageController the controller reacting to user inputs
     */
    public UsagePanel(RunwaySelection runwaySelection, ActionListener usageController) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;

        this.setBorder(BorderFactory.createTitledBorder("Runway Usage"));

        landingRadio = new JRadioButton("Landing");
        landingRadio.setEnabled(false);
        landingRadio.setActionCommand(LANDING_COMMAND);
        landingRadio.addActionListener(usageController);

        takeOffRadio = new JRadioButton("Take-off");
        takeOffRadio.setEnabled(false);
        takeOffRadio.setActionCommand(TAKEOFF_COMMAND);
        takeOffRadio.addActionListener(usageController);

        ButtonGroup radioButtons = new ButtonGroup();
        radioButtons.add(landingRadio);
        radioButtons.add(takeOffRadio);

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(landingRadio).fillX();
        gridBag.row().cell(takeOffRadio).fillX();
        gridBag.done();

        this.notifyUpdate();
    }

    @Override
    public void notifyUpdate() {

        if (runwaySelection.hasSelectedRunway()) {

            landingRadio.setEnabled(true);
            takeOffRadio.setEnabled(true);

            PhysicalRunway runway = runwaySelection.getSelectedRunway();

            switch (runway.getRunwayMode()) {

                case LANDING: {
                    this.takeOffRadio.setSelected(false);
                    this.landingRadio.setSelected(true);
                    break;
                }
                case TAKEOFF: {
                    this.landingRadio.setSelected(false);
                    this.takeOffRadio.setSelected(true);
                    break;
                }
                default:
                    throw new UnsupportedOperationException("Cannot update view for runway direction"
                            + runway.getRunwayDirection());

            }
        }
    }
}
