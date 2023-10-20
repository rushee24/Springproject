package com.example.myspringproject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.myspringproject.model.User;
import com.example.myspringproject.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    } 
}
