package com.bank.bank.users.applications.usecases;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.in.UpdateUserUseCase;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import reactor.core.publisher.Mono;

public class UpdateUserUseCaseImpl implements UpdateUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public UpdateUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public Mono<User> updateUser(User user) {
        return userRepositoryPort.updateUser(user);
    }

}
