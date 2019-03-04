package uk.ac.soton.comp2211.view.center;

import javax.swing.*;

/**
 * This tabbed pane contains tabs for the different runway views: top down, top down (rotated) and side on.
 */
public class DisplayTabbedPane extends JTabbedPane {

    /**
     * Constructs a new tabbed pane with the child panels for the different views.
     *
     * @param topDownPanel the panel for the top down view.
     * @param topDownRotatedPanel the panel for the rotated top down view.
     * @param sideOnPanel the panel for the side-on view.
     */
    public DisplayTabbedPane(TopDownPanel topDownPanel, TopDownRotatedPanel topDownRotatedPanel,
                             SideOnPanel sideOnPanel) {
        this.addTab("Top Down", topDownPanel);
        this.addTab("Top Down Rotated", topDownRotatedPanel);
        this.addTab("Side On", sideOnPanel);

        // disable side on tab
//        this.setEnabledAt(2, false);
    }
}
