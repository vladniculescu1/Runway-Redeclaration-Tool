package uk.ac.soton.comp2211.controller;

import org.apache.commons.io.FilenameUtils;
import uk.ac.soton.comp2211.Application;
import uk.ac.soton.comp2211.ApplicationData;
import uk.ac.soton.comp2211.draw.DrawExecutor;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;
import uk.ac.soton.comp2211.view.modal.ShowCalculationPanel;
import uk.ac.soton.comp2211.view.south.ExportPanel;
import uk.ac.soton.comp2211.view.south.ImportPanel;
import uk.ac.soton.comp2211.xml.XmlImporterExporter;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.xml.bind.JAXBException;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Optional;

public class ImportExportController implements ActionListener {

    private DrawExecutor sideOnDrawExecutor;
    private DrawExecutor topDownDrawExecutor;
    private Application application;

    private JFrame mainFrame;

    /**
     * (Controller) Provides the functionality for the exporting and importing buttons.
     * @param sideOnDrawExectutor Used in exporting as PNG.
     * @param topDownDrawExecutor Used in exporting as PNG.
     * @param application Used in exporting as XML
     */
    public ImportExportController(DrawExecutor topDownDrawExecutor,
                                  DrawExecutor sideOnDrawExectutor, Application application) {
        this.application = application;
        this.sideOnDrawExecutor = sideOnDrawExectutor;
        this.topDownDrawExecutor = topDownDrawExecutor;
    }

    public void addMainFrame(JFrame mainFrame) {
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

            case (ExportPanel.PNG_EXPORT_BUTTON_COMMAND): {

                Optional<File> pngFileOptional = getExportLocation("png");

                if (pngFileOptional.isPresent()) {

                    int height = 800;
                    int width = (int) (((float) height) * 1.5);

                    BufferedImage topImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
                    Graphics2D topGraphics = topImage.createGraphics();
                    topDownDrawExecutor.executeDrawers(topGraphics, width, height, false);

                    BufferedImage sideImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
                    Graphics2D sideGraphics = sideImage.createGraphics();
                    sideOnDrawExecutor.executeDrawers(sideGraphics, width, height, false);

                    BufferedImage exportedImage = new BufferedImage(width * 2, height, BufferedImage.TYPE_INT_ARGB);
                    Graphics2D exportedGraphics = exportedImage.createGraphics();
                    exportedGraphics.setBackground(new Color(208, 240, 249));
                    exportedGraphics.clearRect(0, 0, width * 2, height);
                    exportedGraphics.drawImage(topImage, 0, 0, null);
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
            }

            case (ExportPanel.TXT_EXPORT_BUTTON_COMMAND): {

                Optional<File> txtFileOptional = getExportLocation("txt");
                if (txtFileOptional.isPresent()) {
                    ArrayList<String> outputStrings = new ArrayList<String>();


                    for (PhysicalRunway runway : application.getData().getAirport().getRunways()) {
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
                        for (String outputString : outputStrings) {
                            out.println(outputString);
                        }
                        out.println();
                        JOptionPane.showMessageDialog(mainFrame, "Successfully saved to TXT.");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(mainFrame, "Failed to save TXT.");
                    }
                }
                break;
            }

            case (ExportPanel.XML_EXPORT_BUTTON_COMMAND): {
                Optional<File> fileOptional = getExportLocation("xml");

                if (fileOptional.isPresent()) {
                    File file = fileOptional.get();
                    try {
                        XmlImporterExporter xmlImporterExporter = new XmlImporterExporter(file);
                        xmlImporterExporter.exportXml(application.getData());
                        JOptionPane.showMessageDialog(mainFrame, "Successfully saved as XML.");
                    } catch (JAXBException e1) {
                        e1.printStackTrace();
                        JOptionPane.showMessageDialog(mainFrame, "Failed to save as XML.");
                    }
                }
                break;
            }

            case (ImportPanel.XML_IMPORT_BUTTON_COMMAND): {
                Optional<File> fileOptional = getImportLocation("xml");

                if (fileOptional.isPresent()) {
                    File file = fileOptional.get();
                    try {
                        XmlImporterExporter xmlImporterExporter = new XmlImporterExporter(file);
                        ApplicationData data = xmlImporterExporter.importXml();
                        application.setData(data);
                        application.createMainframe();
                        JOptionPane.showMessageDialog(mainFrame, "Successfully imported airport settings");
                    } catch (JAXBException | ClassCastException e2) {
                        e2.printStackTrace();
                        JOptionPane.showMessageDialog(mainFrame, "Failed to import airport settings");
                    }
                }
                break;
            }

            default:
                throw new UnsupportedOperationException("Operation not supported");
        }
    }

    private Optional<File> getImportLocation(String fileType) {
        JFileChooser fileChooser = this.createFileChooser(fileType);
        fileChooser.setDialogType(JFileChooser.OPEN_DIALOG);

        do {
            int fileChooserOutput = fileChooser.showOpenDialog(mainFrame);

            if (fileChooserOutput == JFileChooser.APPROVE_OPTION) {

                File file = fileChooser.getSelectedFile();

                if (file.exists()) {
                    return Optional.of(file);

                } else {
                    JOptionPane.showMessageDialog(mainFrame, "File does not exist");
                }
            } else {
                return Optional.empty();
            }

        } while (true);
    }

    private Optional<File> getExportLocation(String fileType) {

        JFileChooser fileChooser = this.createFileChooser(fileType);
        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);

        do {
            int fileChooserOutput = fileChooser.showSaveDialog(mainFrame);

            if (fileChooserOutput == JFileChooser.APPROVE_OPTION) {

                File file = fileChooser.getSelectedFile();
                if (!FilenameUtils.getExtension(file.getName()).equalsIgnoreCase(fileType)) {
                    file = new File(file.getPath() + "." + fileType);
                }

                if (file.exists()) {

                    int result = JOptionPane.showConfirmDialog(fileChooser,
                            "This file already exists, overwrite?", "Existing file",
                            JOptionPane.YES_NO_OPTION);

                    if (result == JOptionPane.YES_OPTION) {
                        return  Optional.of(file);
                    }

                } else {
                    return  Optional.of(file);
                }

            } else {
                return Optional.empty();
            }

        } while (true);
    }

    private JFileChooser createFileChooser(String fileType) {
        FileNameExtensionFilter filter = new FileNameExtensionFilter(fileType.toUpperCase() + " Files",
                fileType.toLowerCase());
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
        return fileChooser;
    }

    private void addStringArray(ArrayList<String> list, String[] array) {
        for (String arrayElem: array) {
            list.add(arrayElem);
        }
    }
}
