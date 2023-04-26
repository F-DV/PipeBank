package com.bank.bank.users.infrastructure.entities.dtos.responses;

import com.bank.bank.users.infrastructure.entities.dtos.UserDto;
import lombok.Getter;

@Getter
public class UserResponse extends UserDto {


    public UserResponse() {
    }

    public UserResponse(String id, String userName, String lastName){
        super(id, userName, lastName);

    }
}
