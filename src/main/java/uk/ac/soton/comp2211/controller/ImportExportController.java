package uk.ac.soton.comp2211.controller;

import org.apache.commons.io.FilenameUtils;
import org.checkerframework.checker.nullness.Opt;
import uk.ac.soton.comp2211.draw.DrawExecutor;
import uk.ac.soton.comp2211.model.DrawMode;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.view.MainFrame;
import uk.ac.soton.comp2211.view.south.ExportPanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.util.Optional;

public class ImportExportController implements ActionListener {

    private DrawExecutor sideOnDrawExecutor;
    private DrawExecutor topDownDrawExecutor;

    private MainFrame mainFrame;

    /**
     * (Controller) Provides the functionality for the exporting and importing buttons.
     * @param sideOnDrawExectutor Used in exporting as PNG.
     * @param topDownDrawExecutor Used in exporting as PNG.
     */
    public ImportExportController(DrawExecutor topDownDrawExecutor,
                                  DrawExecutor sideOnDrawExectutor) {
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
            case (ExportPanel.PNG_EXPORT_BUTTON_COMMAND):
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

                    //export to location
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
            //case (ExportPanel.TXT_EXPORT_BUTTON_COMMAND):
            //TODO
            //    break;
            //case (ExportPanel.XML_EXPORT_BUTTON_COMMAND):
            //TODO
            //    break;
            //case (ImportPanel.XML_IMPORT_BUTTON_COMMAND):
            //TODO
            //    break;
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
