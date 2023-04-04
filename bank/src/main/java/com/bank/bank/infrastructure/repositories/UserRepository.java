package com.bank.bank.infrastructure.repositories;

import com.bank.bank.infrastructure.entities.entities.UserEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<UserEntity,Long> {
}
