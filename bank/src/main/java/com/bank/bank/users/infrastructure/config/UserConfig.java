package com.bank.bank.users.infrastructure.config;

import com.bank.bank.users.applications.services.UserService;
import com.bank.bank.users.applications.usecases.*;
import com.bank.bank.users.domain.ports.in.UpdateUserUseCase;
import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserService userService(UserRepositoryPort userRepositoryPort){
        return new UserService(new CreateUserUseCaseImpl(userRepositoryPort),
                new GetUsersUseCaseImpl(userRepositoryPort),
                new DeleteUserUseCaseImpl(userRepositoryPort),
                new GetUserUseCaseImpl(userRepositoryPort),
                new UpdateUserUseCaseImpl(userRepositoryPort));
    }


}
