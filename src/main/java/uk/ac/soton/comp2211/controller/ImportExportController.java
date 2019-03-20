package uk.ac.soton.comp2211.controller;

import org.apache.commons.io.FilenameUtils;
import org.checkerframework.checker.nullness.Opt;
import uk.ac.soton.comp2211.draw.DrawExecutor;
import uk.ac.soton.comp2211.model.*;
import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.modal.ShowCalculationPanel;
import uk.ac.soton.comp2211.view.south.ExportPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Optional;

public class ImportExportController implements ActionListener {

    private DrawExecutor sideOnDrawExecutor;
    private DrawExecutor topDownDrawExecutor;
    private Airport airport;

    private MainFrame mainFrame;

    /**
     * (Controller) Provides the functionality for the exporting and importing buttons.
     * @param sideOnDrawExectutor Used in exporting as PNG.
     * @param topDownDrawExecutor Used in exporting as PNG.
     * @param airport Used in exporting as TXT.
     */
    public ImportExportController(DrawExecutor topDownDrawExecutor,
                                  DrawExecutor sideOnDrawExectutor,
                                  Airport airport) {
        this.sideOnDrawExecutor = sideOnDrawExectutor;
        this.topDownDrawExecutor = topDownDrawExecutor;
        this.airport = airport;
    }

    public void addMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case (ExportPanel.PNG_EXPORT_BUTTON_COMMAND):
                Optional<File> pngFileOptional = getExportLocation("png");
                if (pngFileOptional.isPresent()) {
                    int height = 800;
                    int width = (int)(((float)height) * 1.5);

                    BufferedImage topImage = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
                    Graphics2D topGraphics = topImage.createGraphics();
                    topGraphics.setBackground(Color.white);
                    topDownDrawExecutor.executeDrawers(topGraphics, width, height);
                    BufferedImage sideImage = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
                    Graphics2D sideGraphics = sideImage.createGraphics();
                    sideGraphics.setBackground(Color.white);
                    sideOnDrawExecutor.executeDrawers(sideGraphics, width, height);

                    BufferedImage exportedImage = new BufferedImage(width * 2, height, BufferedImage.TYPE_INT_ARGB);
                    Graphics2D exportedGraphics = exportedImage.createGraphics();
                    exportedGraphics.drawImage(topImage, 0,0, null);
                    exportedGraphics.drawImage(sideImage, width, 0, null);

                    //export to location
                    try {
                        if (ImageIO.write(exportedImage, "png", pngFileOptional.get())) {
                            JOptionPane.showMessageDialog(mainFrame, "Successfully saved to PNG.");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(mainFrame, "Failed to save PNG.");
                    }
                    exportedGraphics.dispose();

                }


                break;
            case (ExportPanel.TXT_EXPORT_BUTTON_COMMAND):
                Optional<File> txtFileOptional = getExportLocation("txt");
                if (txtFileOptional.isPresent()) {
                    ArrayList<String> outputStrings = new ArrayList<String>();


                    for (PhysicalRunway runway : airport.getRunways()) {
                        outputStrings.add("Physical Runway " + runway.toString() + ":");
                        outputStrings.add("Logical Runway " + runway.getLowerThreshold().toString() + ":");
                        ShowCalculationPanel textMaker = new ShowCalculationPanel(runway,
                                0, RunwaySide.LOWER_THRESHOLD, null);
                        addStringArray(outputStrings, textMaker.getLdaCalculation());
                        addStringArray(outputStrings, textMaker.getToraCalculation());
                        addStringArray(outputStrings, textMaker.getTodaCalculation(false));
                        addStringArray(outputStrings, textMaker.getAsdaCalculation(false));


                        outputStrings.add("");
                        outputStrings.add("Logical Runway " + runway.getHigherThreshold().toString() + ":");
                        textMaker = new ShowCalculationPanel(runway,
                                0, RunwaySide.HIGHER_THRESHOLD, null);
                        addStringArray(outputStrings, textMaker.getLdaCalculation());
                        addStringArray(outputStrings, textMaker.getToraCalculation());
                        addStringArray(outputStrings, textMaker.getTodaCalculation(false));
                        addStringArray(outputStrings, textMaker.getAsdaCalculation(false));
                        outputStrings.add("");
                        outputStrings.add("");
                    }

                    try (PrintWriter out = new PrintWriter(txtFileOptional.get())) {
                        for (String outputString: outputStrings) {
                            out.println(outputString);
                        }
                        out.println();
                        JOptionPane.showMessageDialog(mainFrame, "Successfully saved to TXT.");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(mainFrame,"Failed to save TXT.");
                    }
                }
                break;
            case (ExportPanel.XML_EXPORT_BUTTON_COMMAND):
            //TODO
            //    break;
            //case (ImportPanel.XML_IMPORT_BUTTON_COMMAND):
            //TODO
            //    break;
            default:
                throw new UnsupportedOperationException("Operation not supported");
        }
    }

    private void addStringArray(ArrayList<String> list, String[] array) {
        for (String arrayElem: array) {
            list.add(arrayElem);
        }
    }

    private Optional<File> getExportLocation(String fileType) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter(fileType.toUpperCase() + " Files",
                fileType.toLowerCase());
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
        int fileChooserOutput = fileChooser.showSaveDialog(mainFrame);
        if (fileChooserOutput == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            if (!FilenameUtils.getExtension(file.getName()).equalsIgnoreCase(fileType.toLowerCase())) {
                file = new File(file.toString() + "." + fileType.toLowerCase());
            }
            return Optional.of(file);
        } else {
            return Optional.empty();
        }
    }
}
