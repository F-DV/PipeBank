package com.bank.bank.users.infrastructure.adapters;
import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.UserPersistencePort;
import com.bank.bank.users.infrastructure.mappers.UserRestMapper;
import com.bank.bank.users.infrastructure.repositories.dao.UserDao;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

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
