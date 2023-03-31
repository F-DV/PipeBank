package com.bank.bank.infrastructure.config;

import com.bank.bank.domain.ports.UserPersistencePort;
import com.bank.bank.domain.ports.UserServicePort;
import com.bank.bank.domain.ports.UserServiceImpl;
import com.bank.bank.infrastructure.mappers.UserRestMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public UserServicePort userServicePort(UserPersistencePort userPersistencePort){
        return new UserServiceImpl(userPersistencePort);
    }

}
