package uk.ac.soton.comp2211.model;

public enum RunwaySide {

    HIGHER_THRESHOLD, LOWER_THRESHOLD;

    /**
     * Get the opposite of a given runway side.
     *
     * @param runwaySide the side of the runway
     * @return the opposite side
     */
    public static RunwaySide opposite(RunwaySide runwaySide) {
        switch (runwaySide) {
            case LOWER_THRESHOLD:
                return HIGHER_THRESHOLD;
            case HIGHER_THRESHOLD:
                return LOWER_THRESHOLD;
            default:
                throw new IllegalArgumentException("Cannot get opposite of side " + runwaySide);
        }
    }

}
