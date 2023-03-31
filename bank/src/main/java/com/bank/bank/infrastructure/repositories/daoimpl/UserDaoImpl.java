package com.bank.bank.infrastructure.repositories.daoimpl;

import com.bank.bank.infrastructure.model.entities.UserModel;
import com.bank.bank.infrastructure.repositories.dao.UserDao;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.ArrayList;

@Repository
public class UserDaoImpl implements UserDao {

    /*
        Esta implementacion es para datos quemados, si quiero traer datos
        de una base de datos, debo crear una implementación de acuerdo a la base
        de datos que utilize.
     */

    @Override
    public Flux<UserModel> findAllUsers() {
        UserModel userDto1 = new UserModel();
        userDto1.setId(12L);
        userDto1.setName("Felipe");
        userDto1.setLastName("Quiceno");
        userDto1.setNumberAccount("23423nkm23-32");

        UserModel userDto2 = new UserModel();
        userDto2.setId(13L);
        userDto2.setName("Andres");
        userDto2.setLastName("Romero");
        userDto2.setNumberAccount("2342323-32");

        UserModel userDto3 = new UserModel();
        userDto3.setId(14L);
        userDto3.setName("Carlos");
        userDto3.setLastName("Quintero");
        userDto3.setNumberAccount("23456nkm23-82");

        ArrayList<UserModel> users = new ArrayList<>();

        users.add(userDto1);
        users.add(userDto2);
        users.add(userDto3);

        return Flux.fromIterable(users);
    }
}
