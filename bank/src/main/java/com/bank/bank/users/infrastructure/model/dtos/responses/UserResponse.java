package com.bank.bank.users.infrastructure.model.dtos.responses;

import com.bank.bank.users.infrastructure.model.dtos.UserDto;


public class UserResponse extends UserDto {

    public UserResponse() {
    }

    public UserResponse(Long id, String userName, String lastName, String numberAccount) {
        super(id, userName, lastName, numberAccount);
    }
}
