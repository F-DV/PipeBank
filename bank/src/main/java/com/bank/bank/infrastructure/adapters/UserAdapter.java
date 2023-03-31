package com.bank.bank.infrastructure.adapters;
import com.bank.bank.domain.model.User;
import com.bank.bank.domain.ports.UserPersistencePort;
import com.bank.bank.infrastructure.mappers.UserRestMapper;
import com.bank.bank.infrastructure.model.dtos.responses.UserResponse;
import com.bank.bank.infrastructure.model.entities.UserModel;
import com.bank.bank.infrastructure.repositories.dao.UserDao;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserAdapter implements UserPersistencePort {

    //Mapper
    private final UserRestMapper mapper;

    private final UserDao userDao;

    public UserAdapter(UserRestMapper mapper, UserDao userDao) {
        this.mapper = mapper;
        this.userDao = userDao;
    }

    @Override
    public Flux<User> findAllUsers() {
        Flux<User> flujo = Flux.from(userDao.findAllUsers()).map(user -> mapper.userModeltoUser(user));

        return flujo;

    }
}
