package br.com.systechfeeder.systechcollector.util.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = MACAddressValidator.class)
@Documented
public @interface MACAddress {

    String message() default "InvalidMACAddress";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
