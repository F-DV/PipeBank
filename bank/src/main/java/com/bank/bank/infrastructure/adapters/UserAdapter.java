package com.bank.bank.infrastructure.adapters;
import com.bank.bank.infrastructure.mappers.UserRestMapper;
import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import com.bank.bank.infrastructure.entities.entities.UserEntity;
import com.bank.bank.infrastructure.repositories.dao.UserDao;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserAdapter implements UserRepositoryPort {

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

    @Override
    public Mono<User> save(User user) {

        UserEntity userEntity = mapper.usertoUserModel(user);



        return userDao.saveUser(userEntity).map(us -> mapper.userModeltoUser(us));
    }
}
