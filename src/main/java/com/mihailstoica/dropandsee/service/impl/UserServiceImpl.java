package com.mihailstoica.dropandsee.service.impl;

import com.mihailstoica.dropandsee.entity.User;
import com.mihailstoica.dropandsee.error.DuplicateUserNameException;
import com.mihailstoica.dropandsee.repository.UserRepository;
import com.mihailstoica.dropandsee.service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public User saveUser(User user) {
        User userInDb = userRepository.findByUserName(user.getUserName());
        if (userInDb != null) {
            throw new DuplicateUserNameException();
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
