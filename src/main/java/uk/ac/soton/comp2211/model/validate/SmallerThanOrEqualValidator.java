package uk.ac.soton.comp2211.model.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * A validator to validate if a field is smaller than or equal to another field.
 */
public class SmallerThanOrEqualValidator extends ComparisonValidator
        implements ConstraintValidator<SmallerThanOrEqual, Object> {

    @Override
    public boolean compareFields(int baseFieldValue, int comparisonFieldValue) {
        return baseFieldValue <= comparisonFieldValue;
    }

    @Override
    public void initialize(SmallerThanOrEqual constraintAnnotation) {
        super.initialize(constraintAnnotation.baseField(), constraintAnnotation.comparisonField());
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        return super.isValid(value);
    }

}
