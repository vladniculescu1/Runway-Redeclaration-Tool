package uk.ac.soton.comp2211.view.center;

import uk.ac.soton.comp2211.Observer;
import uk.ac.soton.comp2211.draw.DrawExecutor;
import uk.ac.soton.comp2211.model.RunwaySelection;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;


/**
 * This panel shows the runway in a top down view, with the runway rotated corresponding to its heading.
 */
public class TopDownRotatedPanel extends JPanel implements Observer {

    private DrawExecutor drawExecutor;
    private RunwaySelection runwaySelection;

    /**
     * Constructs a new top down rotated panel.
     * @param runwaySelection the selected runway
     * @param drawExecutor the draw executor that is used for visualisation
     */
    public TopDownRotatedPanel(RunwaySelection runwaySelection, DrawExecutor drawExecutor) {
        runwaySelection.subscribe(this);
        this.runwaySelection = runwaySelection;
        this.drawExecutor = drawExecutor;
        this.setBackground(new Color(208, 240, 249));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        BufferedImage image = this.getImage();
        if (runwaySelection.hasSelectedRunway()) {
            double rotationAngle =
                    Math.toRadians((runwaySelection.getSelectedRunway().getLowerThreshold().getHeading()) * 10);

            // create the transform, note that the transformations happen in reversed order (so check them backwards)
            AffineTransform at = new AffineTransform();
            // 4. translate it to the center of the component
            at.translate(this.getWidth() / 2, this.getHeight() / 2);

            // 3. scale the image
            at.scale(this.getHeight() / ((this.getWidth() * Math.abs(Math.cos(rotationAngle)))
                            + (this.getHeight() * Math.abs(Math.sin(rotationAngle)))),
                    this.getHeight() / ((this.getWidth() * Math.abs(Math.cos(rotationAngle)))
                            + (this.getHeight() * Math.abs(Math.sin(rotationAngle)))));

            // 2. do the actual rotation
            at.rotate(Math.toRadians(90) + rotationAngle);
            // 1. translate the object so that you rotate it around the center
            at.translate(-image.getWidth() / 2, -image.getHeight() / 2);

            g2d.drawImage(image, at,null);
        }
        g2d.dispose();
    }

    /**
     * Gets the topDown runway and puts it in a bufferedImage.
     * @return the image that is created of the runway
     */
    private BufferedImage getImage() {

        BufferedImage image = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, // Anti-alias!
                RenderingHints.VALUE_ANTIALIAS_ON);
        this.drawExecutor.executeDrawers(g2d, this.getWidth(), this.getHeight());
        g2d.dispose();
        return image;
    }

    @Override
    public void notifyUpdate() {
        this.repaint();
    }
}
