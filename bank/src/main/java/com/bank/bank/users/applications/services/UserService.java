package com.bank.bank.users.applications.services;

import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.domain.ports.in.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public class UserService implements CreateUserUseCase, GetUsersUseCase, DeleteUserUseCase, GetUserUseCase, UpdateUserUseCase {

    private final CreateUserUseCase createUserUseCase;

    private final GetUsersUseCase getUsersUseCase;

    private final DeleteUserUseCase deleteUserUseCase;

    private final GetUserUseCase getUserUseCase;

    private final UpdateUserUseCase updateUserUseCase;

    public UserService(CreateUserUseCase createUserUseCase, GetUsersUseCase getUsersUseCase, DeleteUserUseCase deleteUserUseCase, GetUserUseCase getUserUseCase, UpdateUserUseCase updateUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.getUsersUseCase = getUsersUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
        this.getUserUseCase = getUserUseCase;
        this.updateUserUseCase = updateUserUseCase;
    }

    @Override
    public Mono<User> createUser(User user) {
        return createUserUseCase.createUser(user);
    }


    @Override
    public Flux<User> getUsers() {

        //Todo: debemos devolver una copia de la lista de usuarios, no los usuarios reales de la base de datos
        //ArrayList<User> usersCopy = getUserUseCase.getUsers();

        return getUsersUseCase.getUsers();
    }


    @Override
    public Mono<Void> deleteUserById(String id) {
        return deleteUserUseCase.deleteUserById(id);
    }

    @Override
    public Mono<User> getById(String id) {
        return getUserUseCase.getById(id);
    }

    @Override
    public Mono<User> updateUser(User user) {
        return updateUserUseCase.updateUser(user);
    }
}
