package uk.ac.soton.comp2211.view.south;

import javax.swing.*;
import org.painlessgridbag.PainlessGridBag;
import org.painlessgridbag.PainlessGridbagConfiguration;

/**
 * This panel contains all panels that are placed in the south of the main application window.
 */
public class SouthPanel extends JPanel {

    public SouthPanel(DirectionPanel directionPanel, VisibleDistancesPanel visibleDistancesPanel,
                      ExportPanel exportPanel, ImportPanel importPanel) {

        PainlessGridbagConfiguration gridbagConfiguration = new PainlessGridbagConfiguration();
        gridbagConfiguration.setFirstRowTopSpacing(0);
        gridbagConfiguration.setLastRowBottomSpacing(0);
        gridbagConfiguration.setFirstColumnLeftSpacing(0);
        gridbagConfiguration.setLastColumnRightSpacing(0);
        gridbagConfiguration.setVirticalSpacing(0);

        JPanel eastPanel = new JPanel();
        PainlessGridBag eastGridBag = new PainlessGridBag(eastPanel, gridbagConfiguration, false);
        eastGridBag.row().cellX(visibleDistancesPanel, 2).fillX();
        eastGridBag.row().cell(exportPanel).cell(importPanel);
        eastGridBag.done();

        gridbagConfiguration.setFirstRowTopSpacing(10);

        PainlessGridBag gridBag = new PainlessGridBag(this, gridbagConfiguration, false);
        gridBag.row().cell(directionPanel).fillXY().cell(eastPanel).fillY();
        gridBag.done();

    }

}
