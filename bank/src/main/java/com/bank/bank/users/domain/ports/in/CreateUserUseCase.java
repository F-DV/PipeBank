package com.bank.bank.users.domain.ports.in;

import com.bank.bank.users.domain.model.User;
import reactor.core.publisher.Mono;

public interface CreateUserUseCase {

    Mono<User> createUser(User user);
}
