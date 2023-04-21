package com.bank.bank.users.domain.ports.in;

import com.bank.bank.users.domain.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface GetUsersUseCase {

    Flux<User> getUsers();
}
