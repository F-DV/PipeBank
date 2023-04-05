package com.bank.bank.users.infrastructure.repositories;

import com.bank.bank.users.infrastructure.entities.entities.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<UserEntity,Long> {
}
