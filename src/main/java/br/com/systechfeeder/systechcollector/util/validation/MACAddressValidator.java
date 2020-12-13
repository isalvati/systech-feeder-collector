package br.com.systechfeeder.systechcollector.util.validation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class MACAddressValidator implements ConstraintValidator<MACAddress, String>{

    private Logger LOGGER = LoggerFactory.getLogger(MACAddressValidator.class);

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        Pattern macPattern = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
        return macPattern.matcher(value).matches();
    }
}
