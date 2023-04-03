package com.bank.bank.users.applications.usecases;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.in.GetUserUseCase;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public class GetUserUseCaseImpl implements GetUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public GetUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Optional<Mono<User>> getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Flux<User> getUsers() {
        return userRepositoryPort.findAllUsers();
    }
}
