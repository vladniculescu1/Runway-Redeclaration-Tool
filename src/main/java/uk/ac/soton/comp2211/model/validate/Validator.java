package uk.ac.soton.comp2211.model.validate;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import java.util.HashSet;
import java.util.Set;

/**
 * Validator that is used to validate constraints that are present on some object.
 *
 * @param <T> generic parameter denoting the type of the object to validate
 */
public class Validator<T> {

    private javax.validation.Validator validator;
    private Set<ConstraintViolation<T>> violations;
    private T objectToValidate;
    private boolean hasBeenValidated;

    /**
     * Create a new instance of a validator for a specific object an return it.
     *
     * @param object the object to validate
     * @param <T> type of the object
     * @return a new validator instance for the object
     */
    public static <T> Validator<T> forObject(T object) {
        return new Validator<>(object);
    }

    private Validator(T objectToValidate) {
        this.validator = Validation.buildDefaultValidatorFactory().getValidator();
        this.objectToValidate = objectToValidate;
        this.hasBeenValidated = false;
        this.violations = new HashSet<>();
    }

    /**
     * Check if the object is valid, i.e. validate all constraints present.
     *
     * @return true if the object is valid, false otherwise
     */
    public boolean isValid() {
        this.violations = validator.validate(objectToValidate);
        this.hasBeenValidated = true;
        return this.violations.isEmpty();
    }

    /**
     * Return all violation messages seperated by a newline. Can only be called after isValid().
     *
     * @return all violation messages present.
     */
    public String getViolationMessages() {
        if (hasBeenValidated) {
            StringBuilder builder = new StringBuilder();
            violations.forEach(violation -> {
                builder.append(violation.getMessage()).append("\n");
            });
            return builder.toString();
        } else {
            throw new IllegalStateException("You must call isValid() before calling getViolationMessages()!");
        }
    }





}
