package com.bank.bank.users.infrastructure.repositories.dao;

<<<<<<< HEAD
import com.bank.bank.users.infrastructure.controllers.model.entities.UserModel;
=======
import com.bank.bank.users.infrastructure.entities.entities.UserEntity;
>>>>>>> 0af65fe2e003c6b131cfe2f9fc51bd5e173bbe39
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserDao {

    Mono<UserEntity> saveUser(UserEntity user);
    Flux<UserEntity> findAllUsers();


}
