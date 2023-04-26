package com.bank.bank.users.infrastructure.mappers.impl;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.infrastructure.mappers.UserRestMapper;
import com.bank.bank.users.infrastructure.entities.dtos.requests.UserRequest;
import com.bank.bank.users.infrastructure.entities.dtos.responses.UserResponse;
import com.bank.bank.users.infrastructure.entities.entities.UserEntity;

import org.springframework.stereotype.Component;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

import java.util.Date;

@Component
public class UserRestMapperImpl implements UserRestMapper {

    @Override
    public UserResponse usertoUserResponse(User user) {
        if(user == null){
            return null;
        }
        String id = user.getId();
        String userName = user.getName();
        String lastName = user.getLastName();

        UserResponse userResponse = new UserResponse(id,userName,lastName);
        return userResponse;
    }

    @Override
    public UserRequest usertoUserRequest(User user) {
        if(user == null){
            return null;
        }
        String id = user.getId();
        String userName = user.getName();
        String lastName = user.getLastName();

        UserRequest userRequest = new UserRequest(id,userName,lastName);
        return userRequest;
    }

    @Override
    public User userResquesttoUser(UserRequest userRequest) {
        if(userRequest == null){
            return null;
        }

        String id = userRequest.getId();
        String userName = userRequest.getUserName();
        String lastName = userRequest.getLastName();
        Date birthDay = null;
        String phoneNumer = null;

        User user = new User(id,userName,lastName);
        return user;
    }

    @Override
    public User userResponsetoUser(UserResponse userResponse) {
        if(userResponse == null){
            return null;
        }

        String id = userResponse.getId();
        String userName = userResponse.getUserName();
        String lastName = userResponse.getLastName();

        User user = new User(id,userName,lastName);
        return user;
    }

    @Override
    public UserEntity usertoUserModel(User user) {
        if(user == null){
            return null;
        }
        String id = user.getId();
        String userName = user.getName();
        String lastName = user.getLastName();

        UserEntity userModel = new UserEntity(id,userName,lastName);
        return userModel;
    }

    @Override
    public User userModeltoUser(UserEntity userModel) {
        if(userModel == null){
            return null;
        }

        String id = userModel.getId();
        String userName = userModel.getName();
        String lastName = userModel.getLastName();
        String numberAccount = userModel.getNumberAccount();
        Date birthDay = null;
        String phoneNumer = null;

        User user = new User(id,userName,lastName);
        return user;
    }

    @Override
    public Mono<UserResponse> usertoUserResponseMono(Mono<User> user) {
        if(user == null){
            return null;
        }
        Mono<UserResponse> userResponse;
        userResponse = user.map(user1 -> {
            return new UserResponse(user1.getId(),user1.getName(),user1.getLastName());

        });

        return userResponse;
    }


}
