package com.bank.bank.users.infrastructure.config;

import com.bank.bank.users.domain.ports.UserPersistencePort;
import com.bank.bank.users.domain.ports.UserServicePort;
import com.bank.bank.users.domain.ports.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserServicePort userServicePort(UserPersistencePort userPersistencePort){
        return new UserServiceImpl(userPersistencePort);
    }

}
