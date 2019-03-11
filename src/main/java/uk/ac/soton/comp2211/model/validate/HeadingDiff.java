package uk.ac.soton.comp2211.model.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {HeadingValidator.class})
public @interface HeadingDiff {

    /**
     * The message that will be attached to a constraint violation in case of a failed validation.
     *
     * @return message indicating failed validation.
     */
    String message();

    /**
     * @return the groups the validation constraint belongs to.
     */
    Class<?>[] groups() default {};

    /**
     * @return payload used for extendability.
     */
    Class<? extends Payload>[] payload() default {};
}
