<<<<<<<< HEAD:bank/src/main/java/com/bank/bank/users/infrastructure/controllers/model/dtos/requests/UserRequest.java
package com.bank.bank.users.infrastructure.controllers.model.dtos.requests;

import com.bank.bank.users.infrastructure.controllers.model.dtos.UserDto;
========
package com.bank.bank.users.infrastructure.entities.dtos.requests;

import com.bank.bank.users.infrastructure.entities.dtos.UserDto;
>>>>>>>> 0af65fe2e003c6b131cfe2f9fc51bd5e173bbe39:bank/src/main/java/com/bank/bank/users/infrastructure/entities/dtos/requests/UserRequest.java

public class UserRequest extends UserDto {
    public UserRequest() {
    }

    public UserRequest(Long id, String userName, String lastName, String numberAccount) {
        super(id, userName, lastName, numberAccount);
    }
}
