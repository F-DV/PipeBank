package com.bank.bank.users.infrastructure.entities.dtos.requests;

import com.bank.bank.users.infrastructure.entities.dtos.UserDto;

public class UserRequest extends UserDto {
    public UserRequest() {
    }

    public UserRequest(String id, String userName, String lastName, String numberAccount) {
        super(id, userName, lastName, numberAccount);
    }
    public UserRequest(String userName, String lastName, String numberAccount) {
        super(userName, lastName, numberAccount);
    }

}
