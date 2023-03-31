package com.bank.bank.infrastructure.model.dtos.requests;

import com.bank.bank.infrastructure.model.dtos.UserDto;

public class UserRequest extends UserDto {
    public UserRequest() {
    }

    public UserRequest(Long id, String userName, String lastName, String numberAccount) {
        super(id, userName, lastName, numberAccount);
    }
}
