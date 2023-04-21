package com.bank.bank.users.applications.usecases;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.in.GetUsersUseCase;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import reactor.core.publisher.Flux;

public class GetUsersUseCaseImpl implements GetUsersUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public GetUsersUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Flux<User> getUsers() {
        return userRepositoryPort.findAllUsers();
    }
}
