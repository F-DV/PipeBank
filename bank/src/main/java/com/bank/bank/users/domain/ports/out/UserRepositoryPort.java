package com.bank.bank.users.domain.ports.out;

import com.bank.bank.users.domain.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface UserRepositoryPort {

    Mono<User> findById(String id);

    Flux<User> findAllUsers();

    Mono<User> save(User user);

    Mono<Void> deleteById(String id);

    Mono<User> updateUser(User user);

}
