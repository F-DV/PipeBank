package com.bank.bank.infrastructure.repositories.daoimpl;

import com.bank.bank.infrastructure.entities.entities.UserEntity;
import com.bank.bank.infrastructure.repositories.UserRepository;
import com.bank.bank.infrastructure.repositories.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@Primary
public class UserDaoMongoImpl implements UserDao {

    @Autowired
    private final UserRepository userRepository;

    public UserDaoMongoImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<UserEntity> saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public Flux<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }
}
