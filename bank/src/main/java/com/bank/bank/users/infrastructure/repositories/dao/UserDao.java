package com.bank.bank.users.infrastructure.repositories.dao;

import com.bank.bank.users.infrastructure.model.entities.UserModel;
import reactor.core.publisher.Flux;

public interface UserDao {

    Flux<UserModel> findAllUsers();
}