package uk.ac.soton.comp2211.draw;

/**
 * Constants used during during drawing - e.g. for width of the runway.
 * Constants denote factors of the font size.
 */
public class DrawConstants {

    public static double DRAW_MARGIN = 1;
    public static double CONSTANT_WIDTH_SIDE_ON = 0.5;

    public static float DESIGNATOR_FONTSIZE = 1.5F;

    public static double RUNWAY_WIDTH = 3;

    public static double CLEARWAY_WIDTH = 2 * RUNWAY_WIDTH;
            
    public static double STRIP_WIDTH = 1.1 * (RUNWAY_WIDTH / 2) + 18;

    public static double LDA_POSITION = 1.1 * (RUNWAY_WIDTH / 2) + 1;
    public static double TORA_POSITION = 1.1 * (RUNWAY_WIDTH / 2) + 3;
    public static double ASDA_POSITION = 1.1 * (RUNWAY_WIDTH / 2) + 5;
    public static double TODA_POSITION = 1.1 * (RUNWAY_WIDTH / 2) + 7;


}
