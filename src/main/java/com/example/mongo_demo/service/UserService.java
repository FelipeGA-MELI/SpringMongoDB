package com.example.mongo_demo.service;

import com.example.mongo_demo.dto.UserDTO;
import com.example.mongo_demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO createUser(UserDTO userDTO) {
        return userRepository.save(userDTO);
    }

    public List<UserDTO> findAllUsers() {
        return userRepository.findAll();
    }
}
