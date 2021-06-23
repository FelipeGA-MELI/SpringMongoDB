package com.example.mongo_demo.repository;

import com.example.mongo_demo.dto.UserDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserDTO, String> {
    UserDTO findByLogin(String login);

    void deleteByLogin(String login);
}
