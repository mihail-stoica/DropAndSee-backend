package com.mihailstoica.dropandsee.validator.impl;

import com.mihailstoica.dropandsee.entity.User;
import com.mihailstoica.dropandsee.repository.UserRepository;
import com.mihailstoica.dropandsee.validator.UniqueUserName;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUserNameValidatorImpl implements ConstraintValidator<UniqueUserName, String> {

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        User inDB = userRepository.findByUserName(value);
        if(inDB == null) {
            return true;
        }

        return false;
    }
}
