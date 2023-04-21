package com.bank.bank.users.applications.usecases;

import com.bank.bank.users.domain.ports.in.DeleteUserUseCase;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import reactor.core.publisher.Mono;

public class DeleteUserUseCaseImpl implements DeleteUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public DeleteUserUseCaseImpl(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }


    @Override
    public Mono<Void> deleteUserById(String id) {
        return userRepositoryPort.deleteById(id);
    }
}
