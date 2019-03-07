package uk.ac.soton.comp2211.view.modal;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.controller.RunwaySelectionController;
import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;
import uk.ac.soton.comp2211.model.ThresholdLocation;
import uk.ac.soton.comp2211.model.validate.Validator;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.NumberFormat;
import java.util.Optional;

public class AddRunwayPanel extends JPanel {

    private ActionListener controller;
    private JLabel logicalRunwayLabelA;
    private JLabel logicalRunwayLabelB;
    private JComboBox locationComboBoxA;
    private JComboBox locationComboBoxB;
    private JTextField headingTextFieldA;
    private JTextField headingTextFieldB;
    private JTextField ldaTextFieldA;
    private JTextField ldaTextFieldB;
    private JTextField todaTextFieldA;
    private JTextField todaTextFieldB;
    private JTextField asdaTextFieldA;
    private JTextField asdaTextFieldB;
    private JTextField toraTextFieldA;
    private JTextField toraTextFieldB;
    private JButton addButton;

    public static final String RUNWAY_ADD_BUTTON = "runwayAddButton";
    public static final String RUNWAY_CANCEL_BUTTON = "runwayCancelButton";


    /**
     * (View) Constructor for AddRunwayPanel.
     * @param controller (Controller) The controller for this view's inputs.
     */
    public AddRunwayPanel(ActionListener controller) {
        this.controller = controller;

        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));

        PainlessGridBag gridBag = new PainlessGridBag(this, false);

        logicalRunwayLabelA = new JLabel("--");
        logicalRunwayLabelB = new JLabel("--");
        JSeparator spacer = new JSeparator(SwingConstants.VERTICAL);
        gridBag.row().cellX(logicalRunwayLabelA, 2).fillX().cellY(spacer,7).fillX()
                .cellX(logicalRunwayLabelB, 2).fillX();
        logicalRunwayLabelA.setHorizontalAlignment(JLabel.CENTER);
        logicalRunwayLabelB.setHorizontalAlignment(JLabel.CENTER);

        String[] thresholdLocationStrings = {"Left", "Right", "Centre", "None"};
        locationComboBoxA = new JComboBox<>(thresholdLocationStrings);
        locationComboBoxB = new JComboBox<>(thresholdLocationStrings);
        locationComboBoxA.addActionListener(e -> updateNamesA());
        locationComboBoxB.addActionListener(e -> updateNamesB());
        gridBag.row().cell(new JLabel("Location"))
                .cell(locationComboBoxA).fillX().cell()
                .cell(new JLabel("Location"))
                .cell(locationComboBoxB).fillX();

        NumberFormat integerFormat = NumberFormat.getNumberInstance();
        integerFormat.setGroupingUsed(false);
        NumberFormatter integerFormatter = new NumberFormatter(integerFormat);
        integerFormatter.setAllowsInvalid(true);
        integerFormatter.setMaximum(99999);
        integerFormatter.setMinimum(0);
        NumberFormatter headingFormatter = new NumberFormatter(integerFormat);
        integerFormatter.setAllowsInvalid(true);
        integerFormatter.setMaximum(35);
        integerFormatter.setMinimum(0);


        headingTextFieldA = new JFormattedTextField(headingFormatter);
        headingTextFieldB = new JFormattedTextField(headingFormatter);
        headingTextFieldA.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                updateNamesA();
            }
        });
        headingTextFieldB.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                updateNamesB();
            }
        });
        //validation etc.
        gridBag.row().cell(new JLabel("Heading"))
                .cell(headingTextFieldA).fillX().cell()
                .cell(new JLabel("Heading"))
                .cell(headingTextFieldB).fillX();

        ldaTextFieldA = new JFormattedTextField(integerFormatter);
        ldaTextFieldB = new JFormattedTextField(integerFormatter);
        //validation etc.
        gridBag.row().cell(new JLabel("LDA (m):"))
                .cell(ldaTextFieldA).fillX().cell()
                .cell(new JLabel("LDA (m):"))
                .cell(ldaTextFieldB).fillX();

        todaTextFieldA = new JFormattedTextField(integerFormatter);
        todaTextFieldB = new JFormattedTextField(integerFormatter);
        //validation etc.
        gridBag.row().cell(new JLabel("TODA (m):"))
                .cell(todaTextFieldA).fillX().cell()
                .cell(new JLabel("TODA (m):"))
                .cell(todaTextFieldB).fillX();

        asdaTextFieldA = new JFormattedTextField(integerFormatter);
        asdaTextFieldB = new JFormattedTextField(integerFormatter);
        //validation etc.
        gridBag.row().cell(new JLabel("ASDA (m):"))
                .cell(asdaTextFieldA).fillX().cell()
                .cell(new JLabel("ASDA (m):"))
                .cell(asdaTextFieldB).fillX();

        toraTextFieldA = new JFormattedTextField(integerFormatter);
        //validation etc.
        //TODO must have same value
        gridBag.row().cell(new JLabel("TORA (m):"))
                .cell(toraTextFieldA).fillX().cell()
                .cell(new JLabel("TORA (m):"))
                .cell(toraTextFieldB).fillX();

        addButton = new JButton("Add Runway --/--");
        JButton cancelButton = new JButton("Cancel");
        addButton.setActionCommand(RUNWAY_ADD_BUTTON);
        addButton.addActionListener(controller);
        cancelButton.setActionCommand(RUNWAY_CANCEL_BUTTON);
        cancelButton.addActionListener(controller);
        gridBag.row().cell().cellX(addButton,3).fillX().cell(cancelButton);
        gridBag.done();
    }

    private void updateNamesA() {
        String locationA = (String)locationComboBoxA.getSelectedItem();
        String locationB = getOppositeLocation(locationA);
        if (!headingTextFieldA.getText().equals("")) {
            String headingA = addZeroToHeading(headingTextFieldA.getText());
            String headingB = addZeroToHeading(Integer.toString((Integer.parseInt(headingA) + 18) % 36));
            setNames(headingA,headingB,locationA,locationB);
        } else {
            setComboBox(locationA,locationB);
        }
    }

    private void updateNamesB() {
        String locationB = (String)locationComboBoxB.getSelectedItem();
        String locationA = getOppositeLocation(locationB);
        if (!headingTextFieldB.getText().equals("")) {
            String headingB = addZeroToHeading(headingTextFieldB.getText());
            String headingA = addZeroToHeading(Integer.toString((Integer.parseInt(headingB) + 18) % 36));
            setNames(headingA,headingB,locationA,locationB);
        } else {
            setComboBox(locationA,locationB);
        }
    }

    private String addZeroToHeading(String heading) {
        if (heading.length() == 1) {
            return "0" + heading;
        } else {
            return heading;
        }
    }

    private void setComboBox(String locationA, String locationB) {
        locationComboBoxA.setSelectedItem(locationA);
        locationComboBoxB.setSelectedItem(locationB);
    }

    private void setNames(String headingA, String headingB, String locationA, String locationB) {
        String nameA = headingA + getShortLocation(locationA);
        String nameB = headingB + getShortLocation(locationB);
        logicalRunwayLabelA.setText(nameA);
        logicalRunwayLabelB.setText(nameB);
        headingTextFieldA.setText(headingA);
        headingTextFieldB.setText(headingB);
        setComboBox(locationA,locationB);
        addButton.setText("Add Runway" + nameA + "/" + nameB);
    }

    private String getShortLocation(String location) {
        switch (location) {
            case "Left":
                return "L";
            case "Right":
                return "R";
            case "Centre":
                return "C";
            case "None":
                return "";
            default:
                throw new UnsupportedOperationException("Invalid location string");
        }
    }

    private String getOppositeLocation(String location) {
        switch (location) {
            case "Left":
                return "Right";
            case "Right":
                return "Left";
            case "Centre":
                return "Centre";
            case "None":
                return "None";
            default:
                throw new UnsupportedOperationException("Invalid location string");
        }
    }

    private ThresholdLocation getThresholdLocation(String location) {
        switch (location) {
            case "Left":
                return ThresholdLocation.LEFT;
            case "Right":
                return ThresholdLocation.RIGHT;
            case "Centre":
                return ThresholdLocation.CENTRE;
            case "None":
                return ThresholdLocation.NONE;
            default:
                throw new UnsupportedOperationException("Invalid location string");
        }
    }

    /**
     * Returns the PhysicalRunway created from the inputs on this panel.
     * @return Empty if not valid inputs, otherwise the runway
     */
    public Optional<PhysicalRunway> getRunwayFromInputs() {
        String issues = "";
        int ldaA = 1000;
        int todaA = 1000;
        int toraA = 1000;
        int asdaA = 1000;
        int headingA = 2;
        ThresholdLocation locationA = getThresholdLocation((String)locationComboBoxA.getSelectedItem());
        int ldaB = 1000;
        int todaB = 1000;
        int toraB = 1000;
        int asdaB = 1000;
        int headingB = 20;
        ThresholdLocation locationB = getThresholdLocation((String)locationComboBoxB.getSelectedItem());

        LogicalRunway lowerThreshold;
        LogicalRunway higherThreshold;
        if (headingA < headingB) {
            lowerThreshold = new LogicalRunway(ldaA,
                                               todaA,
                                               toraA,
                                               asdaA,
                                               headingA,
                                               locationA);
            higherThreshold = new LogicalRunway(ldaB,
                                                todaB,
                                                toraB,
                                                asdaB,
                                                headingB,
                                                locationB);
        } else {
            lowerThreshold = new LogicalRunway(ldaB,
                                               todaB,
                                               toraB,
                                               asdaB,
                                               headingB,
                                               locationB);
            higherThreshold = new LogicalRunway(ldaA,
                                                todaA,
                                                toraA,
                                                asdaA,
                                                headingA,
                                                locationA);
        }
        PhysicalRunway physicalRunway = new PhysicalRunway(higherThreshold,lowerThreshold, RunwaySide.LOWER_THRESHOLD);
        Validator validator = Validator.forObject(lowerThreshold);
        if (!validator.isValid()) {
            issues += validator.getViolationMessages();
        }
        validator = Validator.forObject(higherThreshold);
        if (!validator.isValid()) {
            issues += validator.getViolationMessages();
        }
        validator = Validator.forObject(physicalRunway);
        if (!validator.isValid()) {
            issues += validator.getViolationMessages();
        }
        if (issues != "") {
            JOptionPane.showMessageDialog(this, issues);

            return Optional.empty();
        } else {
            return Optional.of(physicalRunway);
        }
    }


}
