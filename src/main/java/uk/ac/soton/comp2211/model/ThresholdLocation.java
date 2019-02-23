package uk.ac.soton.comp2211.model;

/**
 * Determines the location of the thresholds.
 * If there are runways in parallel, the threshold location distinguishes between them.
 */
public enum ThresholdLocation {

    LEFT("L"), RIGHT("R"), CENTRE("C"), NONE("");

    private String letter;

    ThresholdLocation(String letter) {
        this.letter = letter;
    }

    public String getLetter() {
        return letter;
    }
}
