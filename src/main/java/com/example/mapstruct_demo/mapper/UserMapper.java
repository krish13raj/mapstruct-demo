package com.example.mapstruct_demo.mapper;


import com.example.mapstruct_demo.model.User;
import com.example.mapstruct_demo.response.UserResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse mapUserToUserResponse(User user);

}
