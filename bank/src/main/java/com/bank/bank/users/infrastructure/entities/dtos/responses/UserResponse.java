<<<<<<<< HEAD:bank/src/main/java/com/bank/bank/users/infrastructure/controllers/model/dtos/responses/UserResponse.java
package com.bank.bank.users.infrastructure.controllers.model.dtos.responses;

import com.bank.bank.users.infrastructure.controllers.model.dtos.UserDto;
========
package com.bank.bank.users.infrastructure.entities.dtos.responses;

import com.bank.bank.users.infrastructure.entities.dtos.UserDto;
>>>>>>>> 0af65fe2e003c6b131cfe2f9fc51bd5e173bbe39:bank/src/main/java/com/bank/bank/users/infrastructure/entities/dtos/responses/UserResponse.java


public class UserResponse extends UserDto {

    public UserResponse() {
    }

    public UserResponse(Long id, String userName, String lastName, String numberAccount) {
        super(id, userName, lastName, numberAccount);
    }
}
