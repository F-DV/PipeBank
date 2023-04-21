package com.bank.bank.users.infrastructure.adapters;
import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import com.bank.bank.users.infrastructure.entities.entities.UserEntity;
import com.bank.bank.users.infrastructure.exceptions.BussinesException;
import com.bank.bank.users.infrastructure.exceptions.RequestException;
import com.bank.bank.users.infrastructure.mappers.UserRestMapper;
import com.bank.bank.users.infrastructure.repositories.dao.UserDao;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.function.Supplier;

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
    public Mono<User> findById(String id) {
        Mono<User> user = userDao.findById(id).map(userEntity -> mapper.userModeltoUser(userEntity));

        //Supplier para retornar una exception cada vez que es llamado
        Supplier<RequestException> requestExceptionNotFound = () -> new RequestException("Not found",HttpStatus.NOT_FOUND,"User not found");



        return userDao.findById(id).map(userEntity -> mapper.userModeltoUser(userEntity));
    }

    @Override
    public Flux<User> findAllUsers() {
        Flux<User> flujo = Flux.from(userDao.findAllUsers()).map(user -> mapper.userModeltoUser(user));
        return flujo;

    }

    @Override
    public Mono<User> save(User user) {

        //Ejemplo Exception de Request
        if(user.getName().equals("") || user.getName() == null){
            throw new RequestException("P- toDefine",HttpStatus.BAD_REQUEST,"Name is required");
        }

        //Ejemplo Exception de negocio
        //Todo: Agregar logica que busque entre todos los numeros de cuentas de los usuarios para ver si existe o no
        if (user.getNumberAccount().equals("CA280-85")){
            throw new BussinesException("P- toDefine", HttpStatus.INTERNAL_SERVER_ERROR," Number account already exist");
        }

        UserEntity userEntity = mapper.usertoUserModel(user);



        return userDao.saveUser(userEntity).map(us -> mapper.userModeltoUser(us));
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return userDao.deleteById(id);
    }

    @Override
    public Mono<User> updateUser(User user) {
        UserEntity userEntity = mapper.usertoUserModel(user);


        return userDao.updateUser(userEntity).map(us -> mapper.userModeltoUser(us));
    }
}
