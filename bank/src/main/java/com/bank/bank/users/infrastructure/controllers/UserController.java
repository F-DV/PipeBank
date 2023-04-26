package com.bank.bank.users.infrastructure.controllers;
import com.bank.bank.users.applications.services.UserService;
import com.bank.bank.users.domain.model.User;
import com.bank.bank.users.infrastructure.entities.dtos.requests.UserRequest;
import com.bank.bank.users.infrastructure.mappers.UserRestMapper;
import com.bank.bank.users.infrastructure.entities.dtos.responses.UserResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api")
public class UserController {


    //Mapeador
    private final UserRestMapper mapper;

    private final UserService userService;


    public UserController(UserRestMapper mapper, UserService userService) {
        this.mapper = mapper;
        this.userService = userService;

    }

    @GetMapping(path = "/users")
    public Flux<UserResponse> getUsers(){

        return Flux.from(userService.getUsers())
                .map(user -> mapper.usertoUserResponse(user));
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<UserResponse> create(@RequestBody UserRequest userRequest){

        User user1 = mapper.userResquesttoUser(userRequest);

        return userService.createUser(user1)
                .map(use -> mapper.usertoUserResponse(use));
    }

    @GetMapping(path = "{id}")
    public Mono<UserResponse> getUserById(@PathVariable("id") String id){
        return userService.getById(id).map(user -> mapper.usertoUserResponse(user));
    }

    @PutMapping(path = "{id}")
    public Mono<User> updateUser(@PathVariable("id") String id, @RequestBody UserRequest userRequest){

        //Todo: Logica para actualizar usuario, aun no esta creada.

        Mono<User> userToUpdate = userService.getById(id);

        return null;
    }

    @DeleteMapping(path = "{id}")
    public Mono<Void> deleteUser(@PathVariable("id") String id){
        return userService.deleteUserById(id);
    }


}
