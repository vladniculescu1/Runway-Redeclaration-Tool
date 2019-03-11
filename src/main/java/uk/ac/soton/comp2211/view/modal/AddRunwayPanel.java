package uk.ac.soton.comp2211.view.modal;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.controller.RunwaySelectionController;
import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;
import uk.ac.soton.comp2211.model.ThresholdLocation;
import uk.ac.soton.comp2211.model.validate.Validator;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.NumberFormatter;
import java.awt.event.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Optional;

public class AddRunwayPanel extends JPanel {

    private class DocumentListenerA implements DocumentListener {

        /**
         * Gives notification that there was an insert into the document.  The
         * range given by the DocumentEvent bounds the freshly inserted region.
         *
         * @param e the document event
         */
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateNamesA();
        }

        /**
         * Gives notification that a portion of the document has been
         * removed.  The range is given in terms of what the view last
         * saw (that is, before updating sticky positions).
         *
         * @param e the document event
         */
        @Override
        public void removeUpdate(DocumentEvent e) {
            updateNamesA();
        }

        /**
         * Gives notification that an attribute or set of attributes changed.
         *
         * @param e the document event
         */
        @Override
        public void changedUpdate(DocumentEvent e) {
            updateNamesA();
        }
    }

    private class DocumentListenerB implements DocumentListener {

        /**
         * Gives notification that there was an insert into the document.  The
         * range given by the DocumentEvent bounds the freshly inserted region.
         *
         * @param e the document event
         */
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateNamesB();
        }

        /**
         * Gives notification that a portion of the document has been
         * removed.  The range is given in terms of what the view last
         * saw (that is, before updating sticky positions).
         *
         * @param e the document event
         */
        @Override
        public void removeUpdate(DocumentEvent e) {
            updateNamesB();
        }

        /**
         * Gives notification that an attribute or set of attributes changed.
         *
         * @param e the document event
         */
        @Override
        public void changedUpdate(DocumentEvent e) {
            updateNamesB();
        }
    }

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
    private JFormattedTextField toraTextFieldA;
    private JFormattedTextField toraTextFieldB;
    private JButton addButton;

    private boolean suppressChangeEvents = false;

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
        locationComboBoxB.setSelectedItem("Right");
        locationComboBoxA.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                updateNamesA();
            }
        });
        locationComboBoxB.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                updateNamesB();
            }
        });
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


        headingTextFieldA = new JTextField();
        headingTextFieldB = new JTextField();
        headingTextFieldA.getDocument().addDocumentListener(new DocumentListenerA());
        headingTextFieldB.getDocument().addDocumentListener(new DocumentListenerB());
        gridBag.row().cell(new JLabel("Heading"))
                .cell(headingTextFieldA).fillX().cell()
                .cell(new JLabel("Heading"))
                .cell(headingTextFieldB).fillX();

        ldaTextFieldA = new JFormattedTextField(integerFormatter);
        ldaTextFieldB = new JFormattedTextField(integerFormatter);
        gridBag.row().cell(new JLabel("LDA (m):"))
                .cell(ldaTextFieldA).fillX().cell()
                .cell(new JLabel("LDA (m):"))
                .cell(ldaTextFieldB).fillX();

        todaTextFieldA = new JFormattedTextField(integerFormatter);
        todaTextFieldB = new JFormattedTextField(integerFormatter);
        gridBag.row().cell(new JLabel("TODA (m):"))
                .cell(todaTextFieldA).fillX().cell()
                .cell(new JLabel("TODA (m):"))
                .cell(todaTextFieldB).fillX();

        asdaTextFieldA = new JFormattedTextField(integerFormatter);
        asdaTextFieldB = new JFormattedTextField(integerFormatter);
        gridBag.row().cell(new JLabel("ASDA (m):"))
                .cell(asdaTextFieldA).fillX().cell()
                .cell(new JLabel("ASDA (m):"))
                .cell(asdaTextFieldB).fillX();

        toraTextFieldA = new JFormattedTextField(integerFormatter);
        toraTextFieldB = new JFormattedTextField(integerFormatter);
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
        if (!suppressChangeEvents) {
            suppressChangeEvents = true;
            String locationA = (String) locationComboBoxA.getSelectedItem();
            String locationB = getOppositeLocation(locationA);
            if (!headingTextFieldA.getText().equals("")) {
                String headingA = headingTextFieldA.getText();
                boolean valid = true;
                try {
                    int parsed = Integer.parseInt(headingA);
                    valid = parsed > -1 && parsed < 36;
                } catch (Exception e) {
                    valid = false;
                }
                if (valid) {
                    String headingB = Integer.toString((Integer.parseInt(headingA) + 18) % 36);
                    headingTextFieldB.setText(headingB);
                    setNames(headingA, headingB, locationA, locationB);
                }
            }
            setComboBox(locationA, locationB);
            suppressChangeEvents = false;
        }
    }

    private void updateNamesB() {
        if (!suppressChangeEvents) {
            suppressChangeEvents = true;
            String locationB = (String) locationComboBoxB.getSelectedItem();
            String locationA = getOppositeLocation(locationB);
            if (!headingTextFieldB.getText().equals("")) {
                String headingB = headingTextFieldB.getText();
                boolean valid = true;
                try {
                    int parsed = Integer.parseInt(headingB);
                    valid = parsed > -1 && parsed < 36;
                } catch (Exception e) {
                    valid = false;
                }
                if (valid) {
                    String headingA = Integer.toString((Integer.parseInt(headingB) + 18) % 36);
                    headingTextFieldA.setText(headingA);
                    setNames(headingA, headingB, locationA, locationB);
                }
            }
            setComboBox(locationA, locationB);
            suppressChangeEvents = false;
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
        String nameA = addZeroToHeading(headingA) + getShortLocation(locationA);
        String nameB = addZeroToHeading(headingB) + getShortLocation(locationB);
        logicalRunwayLabelA.setText(nameA);
        logicalRunwayLabelB.setText(nameB);
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
        if (ldaTextFieldA.getText().equals("")) {
            issues += "LDA must not be blank.\n";
        } else {
            ldaA =  Integer.parseInt(ldaTextFieldA.getText());
        }
        int todaA = 1000;
        if (todaTextFieldA.getText().equals("")) {
            issues += "TODA must not be blank.\n";
        } else {
            todaA =  Integer.parseInt(todaTextFieldA.getText());
        }
        int toraA = 1000;
        if (toraTextFieldA.getText().equals("")) {
            issues += "TORA must not be blank.\n";
        } else {
            toraA =  Integer.parseInt(toraTextFieldA.getText());
        }
        int asdaA = 1000;
        if (asdaTextFieldA.getText().equals("")) {
            issues += "ASDA must not be blank.\n";
        } else {
            asdaA =  Integer.parseInt(asdaTextFieldA.getText());
        }
        int headingA = 2;
        if (headingTextFieldA.getText().equals("")) {
            issues += "Heading must not be blank.\n";
        } else {
            headingA =  Integer.parseInt(headingTextFieldA.getText());
        }
        ThresholdLocation locationA = getThresholdLocation((String)locationComboBoxA.getSelectedItem());
        int ldaB = 1000;
        if (ldaTextFieldB.getText().equals("")) {
            issues += "LDA must not be blank.\n";
        } else {
            ldaB =  Integer.parseInt(ldaTextFieldB.getText());
        }
        int todaB = 1000;
        if (todaTextFieldB.getText().equals("")) {
            issues += "TODA must not be blank.\n";
        } else {
            todaB =  Integer.parseInt(todaTextFieldB.getText());
        }
        int toraB = 1000;
        if (toraTextFieldB.getText().equals("")) {
            issues += "TORA must not be blank.\n";
        } else {
            toraB =  Integer.parseInt(toraTextFieldB.getText());
        }
        int asdaB = 1000;
        if (asdaTextFieldB.getText().equals("")) {
            issues += "ASDA must not be blank.\n";
        } else {
            asdaB =  Integer.parseInt(asdaTextFieldB.getText());
        }
        int headingB = 20;
        if (headingTextFieldB.getText().equals("")) {
            issues += "Heading must not be blank.\n";
        } else {
            headingB =  Integer.parseInt(headingTextFieldB.getText());
        }
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
        if (!issues.equals("")) {
            JOptionPane.showMessageDialog(this, issues);

            return Optional.empty();
        } else {
            return Optional.of(physicalRunway);
        }
    }


}
