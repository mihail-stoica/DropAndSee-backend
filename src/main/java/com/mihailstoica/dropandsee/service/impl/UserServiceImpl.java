package com.mihailstoica.dropandsee.service.impl;

import com.mihailstoica.dropandsee.entity.User;
import com.mihailstoica.dropandsee.repository.UserRepository;
import com.mihailstoica.dropandsee.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
