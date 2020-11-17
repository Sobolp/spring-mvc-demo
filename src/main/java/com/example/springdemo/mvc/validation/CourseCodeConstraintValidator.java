package com.example.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    private String coursPrifix;

    public void initialize(CourseCode constraint) {
        coursPrifix = constraint.value();
    }

    public boolean isValid(String theCode, ConstraintValidatorContext context) {

        return theCode == null || theCode.startsWith(coursPrifix);
    }
}
