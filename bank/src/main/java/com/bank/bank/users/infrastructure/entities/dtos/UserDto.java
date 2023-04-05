package com.bank.bank.users.infrastructure.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private String id;
    private String userName;
    private String lastName;
    private String numberAccount;

    public UserDto(String userName, String lastName, String numberAccount) {
        this.userName = userName;
        this.lastName = lastName;
        this.numberAccount = numberAccount;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numberAccount='" + numberAccount + '\'' +
                '}';
    }
}
