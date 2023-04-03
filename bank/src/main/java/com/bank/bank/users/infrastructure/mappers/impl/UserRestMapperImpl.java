package com.bank.bank.users.infrastructure.mappers.impl;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.infrastructure.mappers.UserRestMapper;
import com.bank.bank.users.infrastructure.entities.dtos.requests.UserRequest;
import com.bank.bank.users.infrastructure.entities.dtos.responses.UserResponse;
import com.bank.bank.users.infrastructure.entities.entities.UserEntity;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserRestMapperImpl implements UserRestMapper {

    @Override
    public UserResponse usertoUserResponse(User user) {
        if(user == null){
            return null;
        }
        Long id = user.getId();
        String userName = user.getName();
        String lastName = user.getLastName();
        String numberAccount = user.getNumberAccount();

        UserResponse userResponse = new UserResponse(id,userName,lastName,numberAccount);
        return userResponse;
    }

    @Override
    public UserRequest usertoUserRequest(User user) {
        if(user == null){
            return null;
        }
        Long id = user.getId();
        String userName = user.getName();
        String lastName = user.getLastName();
        String numberAccount = user.getNumberAccount();

        UserRequest userRequest = new UserRequest(id,userName,lastName,numberAccount);
        return userRequest;
    }

    @Override
    public User userResquesttoUser(UserRequest userRequest) {
        if(userRequest == null){
            return null;
        }

        Long id = userRequest.getId();
        String userName = userRequest.getUserName();
        String lastName = userRequest.getLastName();
        String numberAccount = userRequest.getNumberAccount();
        Date birthDay = null;
        String phoneNumer = null;

        User user = new User(id,userName,lastName,birthDay,phoneNumer,numberAccount);
        return user;
    }

    @Override
    public User userResponsetoUser(UserResponse userResponse) {
        if(userResponse == null){
            return null;
        }

        Long id = userResponse.getId();
        String userName = userResponse.getUserName();
        String lastName = userResponse.getLastName();
        String numberAccount = userResponse.getNumberAccount();
        Date birthDay = null;
        String phoneNumer = null;

        User user = new User(id,userName,lastName,birthDay,phoneNumer,numberAccount);
        return user;
    }

    @Override
    public UserEntity usertoUserModel(User user) {
        if(user == null){
            return null;
        }
        Long id = user.getId();
        String userName = user.getName();
        String lastName = user.getLastName();
        String numberAccount = user.getNumberAccount();
        Date birthDay = user.getBirthday();
        String phoneNumer = user.getPhoneNumber();

        UserEntity userModel = new UserEntity(id,userName,lastName,birthDay,phoneNumer,numberAccount);
        return userModel;
    }

    @Override
    public User userModeltoUser(UserEntity userModel) {
        if(userModel == null){
            return null;
        }

        Long id = userModel.getId();
        String userName = userModel.getName();
        String lastName = userModel.getLastName();
        String numberAccount = userModel.getNumberAccount();
        Date birthDay = null;
        String phoneNumer = null;

        User user = new User(id,userName,lastName,birthDay,phoneNumer,numberAccount);
        return user;
    }


}
