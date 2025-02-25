package com.mrizkisaputra;

import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

public class BeanValidation {
    private final static ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    public static Validator getValidator() {
        return factory.getValidator();
    }
}
