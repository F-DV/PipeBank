package com.bank.bank.users.infrastructure.adapters;
import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import com.bank.bank.users.infrastructure.entities.entities.UserEntity;
import com.bank.bank.users.infrastructure.mappers.UserRestMapper;
import com.bank.bank.users.infrastructure.repositories.dao.UserDao;
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

        Mono<UserEntity> savedUserEntity = userDao.saveUser(userEntity);

        User user1 = mapper.userModeltoUser(savedUserEntity.block());

        return Mono.just(user1);
    }
}
