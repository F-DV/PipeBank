package com.bank.bank.users.infrastructure.entities.dtos;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    /*
        El DTO es inmutable
     */

    private String id;
    private String userName;
    private String lastName;

    public UserDto(String userName, String lastName){
        this.userName = userName;
        this.lastName = lastName;

    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
