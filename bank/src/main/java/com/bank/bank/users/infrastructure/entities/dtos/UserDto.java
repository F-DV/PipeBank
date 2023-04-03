<<<<<<<< HEAD:bank/src/main/java/com/bank/bank/users/infrastructure/controllers/model/dtos/UserDto.java
package com.bank.bank.users.infrastructure.controllers.model.dtos;
========
package com.bank.bank.users.infrastructure.entities.dtos;
>>>>>>>> 0af65fe2e003c6b131cfe2f9fc51bd5e173bbe39:bank/src/main/java/com/bank/bank/users/infrastructure/entities/dtos/UserDto.java

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private Long id;
    private String userName;
    private String lastName;
    private String numberAccount;

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
