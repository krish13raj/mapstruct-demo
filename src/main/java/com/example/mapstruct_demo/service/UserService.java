package com.example.mapstruct_demo.service;


import com.example.mapstruct_demo.mapper.UserMapper;
import com.example.mapstruct_demo.model.User;
import com.example.mapstruct_demo.repository.UserRepository;
import com.example.mapstruct_demo.response.UserResponse;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;
    private UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse getUserById(String id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User Not Found"));
        return userMapper.mapUserToUserResponse(user);
    }
}
