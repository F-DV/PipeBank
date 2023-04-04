package com.bank.bank.infrastructure.entities.dtos.responses;

import com.bank.bank.infrastructure.entities.dtos.UserDto;

public class UserResponse extends UserDto {

    public UserResponse() {
    }

    public UserResponse(String id, String userName, String lastName, String numberAccount) {
        super(id, userName, lastName, numberAccount);
    }
}
