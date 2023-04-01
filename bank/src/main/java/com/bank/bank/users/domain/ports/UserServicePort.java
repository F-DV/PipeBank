package com.bank.bank.users.domain.ports;

import com.bank.bank.users.domain.model.User;
import reactor.core.publisher.Flux;

public interface UserServicePort {

    Flux<User> findAllUsers();

}