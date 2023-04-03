package com.bank.bank.users.applications.usecases;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.in.CreateUserUseCase;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import reactor.core.publisher.Mono;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public CreateUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }
    @Override
    public Mono<User> createUser(User user) {
        return userRepositoryPort.save(user);
    }
}
