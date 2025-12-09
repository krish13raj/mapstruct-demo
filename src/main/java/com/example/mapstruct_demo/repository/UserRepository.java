package com.example.mapstruct_demo.repository;

import com.example.mapstruct_demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}

