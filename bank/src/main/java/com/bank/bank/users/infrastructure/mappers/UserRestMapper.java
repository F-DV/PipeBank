package com.bank.bank.users.infrastructure.mappers;

import com.bank.bank.users.domain.model.User;
<<<<<<< HEAD
import com.bank.bank.users.infrastructure.controllers.model.dtos.requests.UserRequest;
import com.bank.bank.users.infrastructure.controllers.model.dtos.responses.UserResponse;
import com.bank.bank.users.infrastructure.controllers.model.entities.UserModel;
=======
import com.bank.bank.users.infrastructure.entities.dtos.requests.UserRequest;
import com.bank.bank.users.infrastructure.entities.dtos.responses.UserResponse;
import com.bank.bank.users.infrastructure.entities.entities.UserEntity;
>>>>>>> 0af65fe2e003c6b131cfe2f9fc51bd5e173bbe39


public interface UserRestMapper {

    UserResponse usertoUserResponse(User user);

    UserRequest usertoUserRequest(User user);

    User userResquesttoUser(UserRequest userRequest);

    User userResponsetoUser(UserResponse userResponse);

    UserEntity usertoUserModel(User user);

    User userModeltoUser(UserEntity userModel);



}
