package com.bank.bank.users.applications.services;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.in.CreateUserUseCase;
import com.bank.bank.users.domain.ports.in.GetUserUseCase;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public class UserService implements CreateUserUseCase, GetUserUseCase {

    private final CreateUserUseCase createUserUseCase;

    private final GetUserUseCase getUserUseCase;

    public UserService(CreateUserUseCase createUserUseCase, GetUserUseCase getUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.getUserUseCase = getUserUseCase;
    }

    @Override
    public Mono<User> createUser(User user) {
        return createUserUseCase.createUser(user);
    }

    @Override
    public Optional<Mono<User>> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Flux<User> getUsers() {
        return getUserUseCase.getUsers();
    }
}
