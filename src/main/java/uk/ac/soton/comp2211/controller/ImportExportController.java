package uk.ac.soton.comp2211.controller;

import org.apache.commons.io.FilenameUtils;
import uk.ac.soton.comp2211.draw.DrawExecutor;
import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.south.ExportPanel;
import uk.ac.soton.comp2211.view.south.ImportPanel;
import uk.ac.soton.comp2211.xml.XmlContainer;
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
import java.util.Optional;

public class ImportExportController implements ActionListener {

    private DrawExecutor sideOnDrawExecutor;
    private DrawExecutor topDownDrawExecutor;
    private XmlContainer xmlContainer;

    private MainFrame mainFrame;

    /**
     * (Controller) Provides the functionality for the exporting and importing buttons.
     * @param sideOnDrawExectutor Used in exporting as PNG.
     * @param topDownDrawExecutor Used in exporting as PNG.
     * @param xmlContainer Used in exporting as XML
     */
    public ImportExportController(DrawExecutor topDownDrawExecutor,
                                  DrawExecutor sideOnDrawExectutor, XmlContainer xmlContainer) {
        this.xmlContainer = xmlContainer;
        this.sideOnDrawExecutor = sideOnDrawExectutor;
        this.topDownDrawExecutor = topDownDrawExecutor;
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
            case (ExportPanel.PNG_EXPORT_BUTTON_COMMAND): {
                Optional<File> fileOptional = getExportLocation("png");
                if (fileOptional.isPresent()) {
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

                    //exportXML to location
                    try {
                        if (ImageIO.write(exportedImage, "png", fileOptional.get())) {
                            JOptionPane.showMessageDialog(mainFrame, "Successfully saved to PNG.");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(mainFrame, "Failed to save PNG.");
                    }
                    exportedGraphics.dispose();

                }


                break;
            }
            //case (ExportPanel.TXT_EXPORT_BUTTON_COMMAND):
            //TODO
            //    break;
            case (ExportPanel.XML_EXPORT_BUTTON_COMMAND): {
                Optional<File> fileOptional = getExportLocation("xml");

                if (fileOptional.isPresent()) {
                    File file = fileOptional.get();
                    try {
                        XmlImporterExporter xmlImporterExporter = new XmlImporterExporter(file, xmlContainer);
                        xmlImporterExporter.exportXML();
                        JOptionPane.showMessageDialog(mainFrame, "Successfully saved as XML.");
                    } catch (JAXBException e1) {
                        JOptionPane.showMessageDialog(mainFrame, "Failed to save as XML.");
                    }
                }
                break;
            }
            case (ImportPanel.XML_IMPORT_BUTTON_COMMAND): {
                Optional<File> fileOptional = getExportLocation("xml");

                if (fileOptional.isPresent()) {
                    File file = fileOptional.get();
                    try {
                        XmlImporterExporter xmlImporterExporter = new XmlImporterExporter(file, xmlContainer);
                        xmlImporterExporter.importXML();
                        JOptionPane.showMessageDialog(mainFrame, "Successfully imported airport settings");
                    } catch (JAXBException | ClassCastException e2) {
                        JOptionPane.showMessageDialog(mainFrame, "Failed to import airport settings");
                    }


                }
                break;
            }
            default:
                throw new UnsupportedOperationException("Operation not supported");
        }
    }

    private Optional<File> getExportLocation(String fileType) {

        FileNameExtensionFilter filter = new FileNameExtensionFilter(fileType.toUpperCase() + " Files",
                fileType.toLowerCase());
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(filter);
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
}
