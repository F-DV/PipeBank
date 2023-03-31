package com.bank.bank.infrastructure.model.dtos.responses;

import com.bank.bank.infrastructure.model.dtos.UserDto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class UserResponse extends UserDto {

    public UserResponse() {
    }

    public UserResponse(Long id, String userName, String lastName, String numberAccount) {
        super(id, userName, lastName, numberAccount);
    }
}
