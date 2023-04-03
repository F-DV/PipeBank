package com.bank.bank.users.infrastructure.config;

import com.bank.bank.users.domain.ports.out.UserRepositoryPort;
import com.bank.bank.users.domain.ports.out.UserServicePort;
import com.bank.bank.users.domain.ports.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserServicePort userServicePort(UserRepositoryPort userRepositoryPort){
        return new UserServiceImpl(userRepositoryPort);
    }

}
