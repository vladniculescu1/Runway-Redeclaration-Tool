package uk.ac.soton.comp2211.view.south;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.Observer;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This panel contains the settings for the landing and take-off direction. The user can switch between landing/
 * taking-off towards the lower/higher threshold.
 */
public class DirectionPanel extends JPanel implements Observer {

    private JRadioButton towardsLowerRadio;
    private JRadioButton towardsHigherRadio;

    public static final String TOWARDS_HIGHER_COMMAND = "towardsHigher";
    public static final String TOWARDS_LOWER_COMMAND = "towardsLower";

    private RunwaySelection runwaySelection;

    /**
     * Constructs a new direction panel.
     *
     * @param runwaySelection the current runway selection - the model
     * @param directionController the controller reacting to user inputs
     */
    public DirectionPanel(RunwaySelection runwaySelection, ActionListener directionController) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;

        this.setBorder(BorderFactory.createTitledBorder("Landing/Take-off Direction"));

        towardsLowerRadio = new JRadioButton("Towards lower threshold");
        towardsLowerRadio.setEnabled(false);
        towardsLowerRadio.setActionCommand(TOWARDS_LOWER_COMMAND);
        towardsLowerRadio.addActionListener(directionController);

        towardsHigherRadio = new JRadioButton("Towards higher threshold");
        towardsHigherRadio.setEnabled(false);
        towardsHigherRadio.setActionCommand(TOWARDS_HIGHER_COMMAND);
        towardsHigherRadio.addActionListener(directionController);

        ButtonGroup radioButtons = new ButtonGroup();
        radioButtons.add(towardsLowerRadio);
        radioButtons.add(towardsHigherRadio);

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(towardsLowerRadio).fillX();
        gridBag.row().cell(towardsHigherRadio).fillX();
        gridBag.done();

        this.notifyUpdate();
    }

    @Override
    public void notifyUpdate() {

        if (runwaySelection.hasSelectedRunway()) {

            towardsLowerRadio.setEnabled(true);
            towardsHigherRadio.setEnabled(true);

            PhysicalRunway runway = runwaySelection.getSelectedRunway();

            switch (runway.getRunwayDirection()) {

                case LOWER_THRESHOLD: {
                    this.towardsHigherRadio.setSelected(false);
                    this.towardsLowerRadio.setSelected(true);
                    break;
                }
                case HIGHER_THRESHOLD: {
                    this.towardsLowerRadio.setSelected(false);
                    this.towardsHigherRadio.setSelected(true);
                    break;
                }
                default:
                    throw new UnsupportedOperationException("Cannot update view for runway direction"
                            + runway.getRunwayDirection());

            }
        }
    }
}
