package com.bank.bank.infrastructure.mappers;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.infrastructure.entities.dtos.requests.UserRequest;
import com.bank.bank.infrastructure.entities.dtos.responses.UserResponse;
import com.bank.bank.infrastructure.entities.entities.UserEntity;


public interface UserRestMapper {

    UserResponse usertoUserResponse(User user);

    UserRequest usertoUserRequest(User user);

    User userResquesttoUser(UserRequest userRequest);

    User userResponsetoUser(UserResponse userResponse);

    UserEntity usertoUserModel(User user);

    User userModeltoUser(UserEntity userModel);



}
