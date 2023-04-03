package com.bank.bank.users.domain.ports;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import com.bank.bank.users.domain.ports.out.UserServicePort;
import reactor.core.publisher.Flux;

public class UserServiceImpl implements UserServicePort {

    private final UserRepositoryPort userRespositoryPort;

    //Constructor
    public UserServiceImpl(UserRepositoryPort userRepositoryPort) {
        this.userRespositoryPort = userRepositoryPort;
    }

    @Override
    public Flux<User> findAllUsers() {
        return userRespositoryPort.findAllUsers();
    }
}
