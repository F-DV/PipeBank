package com.bank.bank.users.domain.ports.in;

import com.bank.bank.users.domain.model.User;
import reactor.core.publisher.Mono;

public interface UpdateUserUseCase {

    Mono<User> updateUser(User user);
}
