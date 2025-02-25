package com.mrizkisaputra;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class ValidatorTest {
    @Test
    public void testValidator() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Assertions.assertNotNull(validator);
    }

    @Test
    public void testSingletonValidator() {
        Validator validator1 = BeanValidation.getValidator();
        Validator validator2 = BeanValidation.getValidator();

        System.out.println(validator1);
        System.out.println(validator2);
    }

    @Test
    public void test() {
        Validator validator = BeanValidation.getValidator();

        Address address = new Address(null);
        User user = new User("kiki", 10, address);
        Set<ConstraintViolation<User>> violations = validator.validate(user);

        violations.forEach(violation -> {
            System.out.println(violation.getMessage());
            System.out.println(violation.getLeafBean());
            System.out.println(violation.getInvalidValue());
        });
    }


}
