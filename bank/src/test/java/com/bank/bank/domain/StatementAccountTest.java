package com.bank.bank.domain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class StatementAccountTest {

    // Mock o clase que sera simulada
    @Mock
    private Account myAccount;

    //  Clase que necesita el Mock o en la que se inyectará el Mock
    @InjectMocks
    private StatementAccount statementAccount;

    @Test
    public void get_statementAccount(){
        when(myAccount.getUserName()).thenReturn("hello world");

        String result = statementAccount.getStatement();

        Assert.assertEquals("hello world",result);
    }


}
