package com.unal.skyway.services;

import com.unal.skyway.models.User;
import com.unal.skyway.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(String id) {return userRepository.findUserById(id);}
}
