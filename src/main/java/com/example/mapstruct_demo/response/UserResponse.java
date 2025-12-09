package com.example.mapstruct_demo.response;


import com.example.mapstruct_demo.model.User;

public record UserResponse(
        String id,
        String name,
        String email,
        User.Address address
) {
    public record Address(
            String street,
            String city,
            String zip
    ) {
    }
}
