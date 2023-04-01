package com.bank.bank.users.infrastructure.mappers;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.infrastructure.model.dtos.requests.UserRequest;
import com.bank.bank.users.infrastructure.model.dtos.responses.UserResponse;
import com.bank.bank.users.infrastructure.model.entities.UserModel;


public interface UserRestMapper {

    UserResponse usertoUserResponse(User user);

    UserRequest usertoUserRequest(User user);

    User userResquesttoUser(UserRequest userRequest);

    User userResponsetoUser(UserResponse userResponse);

    UserModel usertoUserModel(User user);

    User userModeltoUser(UserModel userModel);



}
