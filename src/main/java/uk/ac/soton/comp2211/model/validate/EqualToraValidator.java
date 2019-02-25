package uk.ac.soton.comp2211.model.validate;

import uk.ac.soton.comp2211.model.PhysicalRunway;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Validates the TORA values of the two logical runways that are part of a physical runway. Both TORA values must
 * be the same.
 */
public class EqualToraValidator implements ConstraintValidator<EqualTora, PhysicalRunway> {

    @Override
    public boolean isValid(PhysicalRunway runway, ConstraintValidatorContext context) {

        return runway.getLowerThreshold() != null
                && runway.getHigherThreshold() != null
                && runway.getLowerThreshold().getOriginalTora() == runway.getHigherThreshold().getOriginalTora();
    }
}
