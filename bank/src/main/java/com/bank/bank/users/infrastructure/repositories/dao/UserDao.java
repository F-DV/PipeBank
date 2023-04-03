package com.bank.bank.users.infrastructure.repositories.dao;

import com.bank.bank.users.infrastructure.entities.entities.UserEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserDao {

    Mono<UserEntity> saveUser(UserEntity user);
    Flux<UserEntity> findAllUsers();


}
