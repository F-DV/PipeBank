package com.bank.bank.infrastructure.controllers;
import com.bank.bank.infrastructure.entities.dtos.requests.UserRequest;
import com.bank.bank.infrastructure.entities.dtos.responses.UserResponse;
import com.bank.bank.infrastructure.mappers.UserRestMapper;
import com.bank.bank.users.applications.services.UserService;
import com.bank.bank.users.domain.model.User;

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

    @GetMapping()
    public Flux<UserResponse> getUsers(){

        /*
        // Crear flujo Flux, a partir de cada dato Mono

        Mono<User> mono = userServicePort.findAllUsers().elementAt(0);
        Mono<User> mono1 = userServicePort.findAllUsers().elementAt(1);
        Mono<User> mono2 = userServicePort.findAllUsers().elementAt(2);
        Flux<UserResponse> flujo = Flux.merge(mono,mono1,mono2).map(user -> mapper.usertoUserResponse(user));
        */

        return Flux.from(userService.getUsers()).map(user -> mapper.usertoUserResponse(user));
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<UserResponse> create(@RequestBody UserRequest userRequest){

        User user1 = mapper.userResquesttoUser(userRequest);

        return userService.createUser(user1).map(use -> mapper.usertoUserResponse(use));
    }


    /*
    //Datos quemados aqui mismo

    @GetMapping(path = "users")
    public List<UserResponse> getUsers(){

        UserResponse userDto1 = new UserResponse(12L,"Felipe","Quiceno","23423nkm23-32");
        UserResponse userDto2 = new UserResponse(13L,"Andres","Romero","2342323-32");
        UserResponse userDto3 = new UserResponse(14L,"Carlos","Quintero","23456nkm23-32");

        ArrayList<UserResponse> users = new ArrayList<>();
        users.add(userDto1);
        users.add(userDto2);
        users.add(userDto3);

        return users;
    }
     */

}
