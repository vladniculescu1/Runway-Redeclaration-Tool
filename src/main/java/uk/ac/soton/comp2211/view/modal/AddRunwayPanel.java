package uk.ac.soton.comp2211.view.modal;

import org.painlessgridbag.PainlessGridBag;
import uk.ac.soton.comp2211.controller.RunwaySelectionController;
import uk.ac.soton.comp2211.model.ThresholdLocation;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.NumberFormat;

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
        integerFormatter.setMaximum(9999);
        integerFormatter.setMinimum(-9999);
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
        toraTextFieldB = new JFormattedTextField(integerFormatter);
        //validation etc.
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
        if (!headingTextFieldA.getText().equals("")) {
            String headingA = headingTextFieldA.getText();
            String headingB = Integer.toString((Integer.parseInt(headingA) + 18) % 36);
            String locationA = (String)locationComboBoxA.getSelectedItem();
            String locationB = getOppositeLocation(locationA);
            setNames(headingA,headingB,locationA,locationB);
        }
    }

    private void updateNamesB() {
        if (!headingTextFieldB.getText().equals("")) {
            String headingB = headingTextFieldB.getText();
            String headingA = Integer.toString((Integer.parseInt(headingB) + 18) % 36);
            String locationB = (String)locationComboBoxB.getSelectedItem();
            String locationA = getOppositeLocation(locationB);
            setNames(headingA,headingB,locationA,locationB);
        }
    }

    private void setNames(String headingA, String headingB, String locationA, String locationB) {
        String nameA = headingA + getShortLocation(locationA);
        String nameB = headingB + getShortLocation(locationB);
        logicalRunwayLabelA.setText(nameA);
        logicalRunwayLabelB.setText(nameB);
        headingTextFieldA.setText(headingA);
        headingTextFieldB.setText(headingB);
        locationComboBoxA.setSelectedItem(locationA);
        locationComboBoxA.setSelectedItem(locationB);
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
}
