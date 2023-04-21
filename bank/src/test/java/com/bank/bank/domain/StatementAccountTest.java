package com.bank.bank.domain;

import com.bank.bank.accounts.domain.services.Account;
import com.bank.bank.accounts.domain.services.Statement;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class StatementAccountTest {

    // Mock o clase que sera simulada
    @Mock
    private Account myAccount;

    //  Clase que necesita el Mock o en la que se inyectará el Mock
    @InjectMocks
    private Statement statement;

    @Test
    public void get_statementAccount(){

    }


}
