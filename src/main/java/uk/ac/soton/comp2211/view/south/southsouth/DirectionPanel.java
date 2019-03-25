package uk.ac.soton.comp2211.view.south.southsouth;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySelection;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * This panel contains the settings for the landing and take-off direction. The user can switch between landing/
 * taking-off towards the lower/higher threshold.
 */
public class DirectionPanel extends JPanel implements Observer {

    private JRadioButton fromLowerRadio;
    private JRadioButton fromHigherRadio;

    public static final String FROM_HIGHER_COMMAND = "fromHigher";
    public static final String FROM_LOWER_COMMAND = "fromLower";

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

        fromLowerRadio = new JRadioButton("Lower threshold");
        fromLowerRadio.setEnabled(false);
        fromLowerRadio.setActionCommand(FROM_LOWER_COMMAND);
        fromLowerRadio.addActionListener(directionController);

        fromHigherRadio = new JRadioButton("Higher threshold");
        fromHigherRadio.setEnabled(false);
        fromHigherRadio.setActionCommand(FROM_HIGHER_COMMAND);
        fromHigherRadio.addActionListener(directionController);

        ButtonGroup radioButtons = new ButtonGroup();
        radioButtons.add(fromLowerRadio);
        radioButtons.add(fromHigherRadio);

        PainlessGridBag gridBag = new PainlessGridBag(this, false);
        gridBag.row().cell(fromLowerRadio).fillX();
        gridBag.row().cell(fromHigherRadio).fillX();
        gridBag.done();

        this.notifyUpdate();
    }

    @Override
    public void notifyUpdate() {

        if (runwaySelection.hasSelectedRunway()) {

            PhysicalRunway runway = runwaySelection.getSelectedRunway();
            LogicalRunway lowerThreshold = runway.getLowerThreshold();
            LogicalRunway higherThreshold = runway.getHigherThreshold();

            fromLowerRadio.setText("Runway " + lowerThreshold.getHeadingAsString() + lowerThreshold.getLocation());
            fromLowerRadio.setEnabled(true);

            fromHigherRadio.setText("Runway " + higherThreshold.getHeadingAsString() + higherThreshold.getLocation());
            fromHigherRadio.setEnabled(true);



            switch (runway.getRunwayDirection()) {

                case LOWER_THRESHOLD: {
                    this.fromHigherRadio.setSelected(false);
                    this.fromLowerRadio.setSelected(true);
                    break;
                }
                case HIGHER_THRESHOLD: {
                    this.fromLowerRadio.setSelected(false);
                    this.fromHigherRadio.setSelected(true);
                    break;
                }
                default:
                    throw new UnsupportedOperationException("Cannot update view for runway direction"
                            + runway.getRunwayDirection());

            }
        } else {

            fromLowerRadio.setText("Lower threshold");
            fromLowerRadio.setEnabled(false);

            fromHigherRadio.setText("Higher threshold");
            fromHigherRadio.setEnabled(false);
        }
    }
}
