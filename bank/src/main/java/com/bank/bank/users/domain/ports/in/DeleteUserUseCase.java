package com.bank.bank.users.domain.ports.in;

import reactor.core.publisher.Mono;

public interface DeleteUserUseCase {

    Mono<Void> deleteUserById(String id);
}
