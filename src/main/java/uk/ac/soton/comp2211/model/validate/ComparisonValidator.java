package uk.ac.soton.comp2211.model.validate;

import javax.validation.ConstraintValidatorContext;
import java.lang.reflect.Field;

/**
 * Abstract validator used to validate two integer fields by comparing them to each other.
 */
public abstract class ComparisonValidator {

    private String baseField;
    private String comparisonField;

    /**
     * Initialises the validator with the names of the base and comparison field.
     *
     * @param baseField the base field name
     * @param comparisonField the field that the base field will be compared to
     */
    public void initialize(String baseField, String comparisonField) {
        this.baseField = baseField;
        this.comparisonField = comparisonField;
    }

    /**
     * Implements the validation logic.
     * The state of value must not be altered.
     *
     * @param value object to validate
     * @return false if value does not pass the constraint
     */
    public boolean isValid(Object value) {
        try {
            int baseFieldValue = getFieldValue(value, baseField);
            int comparisonFieldValue = getFieldValue(value, comparisonField);

            return this.compareFields(baseFieldValue, comparisonFieldValue);

        } catch (NoSuchFieldException | IllegalAccessException | ClassCastException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Compares the base field value to the comparison field value and returns the result.
     *
     * @param baseFieldValue the value of the base field
     * @param comparisonFieldValue the value of the comparison field
     * @return comparison result
     */
    public abstract boolean compareFields(int baseFieldValue, int comparisonFieldValue);

    private int getFieldValue(Object object, String fieldName)
            throws NoSuchFieldException, IllegalAccessException, ClassCastException {
        Class<?> clazz = object.getClass();
        Field field = clazz.getDeclaredField(fieldName);
        field.setAccessible(true);
        return (int) field.get(object);
    }
}

