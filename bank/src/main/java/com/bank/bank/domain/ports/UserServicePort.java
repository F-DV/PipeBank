package com.bank.bank.domain.ports;

import com.bank.bank.domain.model.User;
import reactor.core.publisher.Flux;

public interface UserServicePort {

    Flux<User> findAllUsers();

}
