package com.bank.bank.infrastructure.repositories.dao;

import com.bank.bank.infrastructure.model.entities.UserModel;
import reactor.core.publisher.Flux;

public interface UserDao {

    Flux<UserModel> findAllUsers();
}
