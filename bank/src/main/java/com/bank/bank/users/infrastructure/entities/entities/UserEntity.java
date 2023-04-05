package com.bank.bank.users.infrastructure.entities.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

//Todo: Investigar como Modelar la tabla en la base de datos para webflux, por ahora estoy integrando una clase normal
@Document(collection = "users")
@Getter
@Setter
public class UserEntity {

    @Id
    private String id;
    private String name;
    private String lastName;
    private Date birthday;
    private String phoneNumber;
    private String numberAccount;

    public UserEntity() {
    }

    public UserEntity(String id, String name, String lastName, Date birthday, String phoneNumber, String numberAccount) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.numberAccount = numberAccount;
    }

    public UserEntity(String name, String lastName, Date birthday, String phoneNumber, String numberAccount) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.numberAccount = numberAccount;
    }

    public UserEntity(String name, String lastName, String numberAccount) {
        this.name = name;
        this.lastName = lastName;
        this.numberAccount = numberAccount;
    }
}
