package com.bank.bank.users.domain.ports;

import com.bank.bank.users.domain.model.User;
import reactor.core.publisher.Flux;

public class UserServiceImpl implements UserServicePort {

    private final UserPersistencePort userPersistencePort;

    //Constructor
    public UserServiceImpl(UserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public Flux<User> findAllUsers() {
        return userPersistencePort.findAllUsers();
    }
}
