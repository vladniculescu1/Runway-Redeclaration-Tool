package uk.ac.soton.comp2211.model.validate;

import uk.ac.soton.comp2211.model.PhysicalRunway;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Validates the heading values of the two logical runways that are part of a physical runway. The heading values
 * must have a difference of 18, with the lower heading being lower.
 */
public class HeadingValidator implements ConstraintValidator<HeadingDiff, PhysicalRunway> {

    @Override
    public boolean isValid(PhysicalRunway runway, ConstraintValidatorContext context) {

        return runway.getLowerThreshold() != null
                && runway.getHigherThreshold() != null
                && runway.getLowerThreshold().getHeading() + 18 == runway.getHigherThreshold().getHeading();
    }
}
