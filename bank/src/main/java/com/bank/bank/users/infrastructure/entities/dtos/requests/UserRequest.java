package com.bank.bank.users.infrastructure.entities.dtos.requests;

import com.bank.bank.users.infrastructure.entities.dtos.UserDto;
import lombok.Getter;

@Getter
public class UserRequest extends UserDto {

    public UserRequest() {
    }

    public UserRequest(String id, String userName, String lastName) {
        super(id, userName, lastName);

    }
    public UserRequest(String userName, String lastName) {
        super(userName, lastName);

    }


}
