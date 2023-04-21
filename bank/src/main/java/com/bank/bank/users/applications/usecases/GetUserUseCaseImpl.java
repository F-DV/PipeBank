package com.bank.bank.users.applications.usecases;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.in.GetUserUseCase;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import reactor.core.publisher.Mono;

public class GetUserUseCaseImpl implements GetUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public GetUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Mono<User> getById(String id) {
        return userRepositoryPort.findById(id);
    }
}
