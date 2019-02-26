package uk.ac.soton.comp2211.view.center;

import org.apache.commons.logging.Log;
import uk.ac.soton.comp2211.draw.DrawExecutor;
import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;


/**
 * This panel shows the runway in a top down view, with the runway rotated corresponding to its heading.
 */
public class TopDownRotatedPanel extends JPanel {

    private DrawExecutor drawExecutor;
    private LogicalRunway logicalRunway;

    /**
     * Constructs a new top down rotated panel.
     */
    public TopDownRotatedPanel(DrawExecutor drawExecutor) {

        this.drawExecutor = drawExecutor;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        BufferedImage image = this.getImage();

        // create the transform, note that the transformations happen in reversed order (so check them backwards)
        AffineTransform at = new AffineTransform();
        // 3. translate it to the center of the component
        at.translate(this.getWidth() / 2, this.getHeight() / 2);
        // 2. do the actual rotation
//        at.rotate(Math.PI);
        at.rotate(Math.PI/2);
        // 1. translate the object so that you rotate it around the center
        at.translate(-image.getWidth()/2, -image.getHeight()/2);

        g2d.drawImage(image, at,null);
    }

    /**
     * Gets the topDown runway and puts it in a bufferedImage.
     * @return the image that is created of the runway
     */
    private BufferedImage getImage() {
        BufferedImage image = new BufferedImage(this.getWidth(), this.getHeight(), Transparency.TRANSLUCENT);
        Graphics2D g2d = image.createGraphics();
        this.drawExecutor.executeDrawers(g2d, this.getWidth(), this.getHeight());
        g2d.dispose();
        return image;
    }
}
