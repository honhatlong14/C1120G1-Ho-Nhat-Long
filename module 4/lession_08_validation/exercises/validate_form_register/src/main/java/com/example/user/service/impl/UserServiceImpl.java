package com.example.user.service.impl;

import com.example.user.model.User;
import com.example.user.repository.UserRepository;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
