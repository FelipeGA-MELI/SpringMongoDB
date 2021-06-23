package com.example.mongo_demo.service;

import com.example.mongo_demo.dto.UserDTO;
import com.example.mongo_demo.repository.AdressRepostiroy;
import com.example.mongo_demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final AdressRepostiroy adressRepostiroy;

    public UserService(UserRepository userRepository, AdressRepostiroy adressRepostiroy) {
        this.adressRepostiroy = adressRepostiroy;
        this.userRepository = userRepository;
    }

    public UserDTO createUser(UserDTO userDTO) {
        adressRepostiroy.saveAll(userDTO.getAddresses());
        return userRepository.save(userDTO);
    }

    public List<UserDTO> findAllUsers() {
        return userRepository.findAll();
    }
}
