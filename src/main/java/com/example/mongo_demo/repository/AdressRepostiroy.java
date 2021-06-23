package com.example.mongo_demo.repository;

import com.example.mongo_demo.dto.AddressDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdressRepostiroy extends MongoRepository<AddressDTO,String> {
}
