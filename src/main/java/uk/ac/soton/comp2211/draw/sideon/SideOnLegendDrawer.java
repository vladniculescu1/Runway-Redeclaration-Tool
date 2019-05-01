package uk.ac.soton.comp2211.draw.sideon;

import uk.ac.soton.comp2211.draw.DrawUtils;
import uk.ac.soton.comp2211.draw.Drawer;
import uk.ac.soton.comp2211.model.PhysicalRunway;

import java.awt.*;

public class SideOnLegendDrawer implements Drawer {
    @Override
    public void draw(Graphics2D g2d, PhysicalRunway physicalRunway, boolean flipText) {
        DrawUtils.legend(g2d, 0, g2d.getFontMetrics().getHeight() / 12);
    }
}
