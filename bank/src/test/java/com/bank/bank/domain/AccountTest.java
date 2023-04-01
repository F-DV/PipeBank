package com.bank.bank.domain;

import com.bank.bank.accounts.domain.services.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTest {

    private Account account;

    @Test
    public void return_true_when_deposit() {

        account = new Account();
        Assert.assertTrue(account.deposit(1000.0));
    }
    @Test
    public void return_false_when_deposit_is_Zero(){

        account = new Account();
        Assert.assertEquals(false,account.deposit(0.0));
    }

    @Test
    public void return_amount(){

        account = new Account();//Creo cuenta
        account.deposit(1000.0); //Hago deposito

        Assert.assertEquals((Double)1000.0,account.getAmount()); //Verifico deposito 1

        account.deposit(1000.0); //Hago deposito
        Assert.assertEquals((Double)2000.0,account.getAmount()); //Verifico deposito 2
    }
    @Test
    public void return_dates_of_user(){

        account = new Account("Felipe",1000.0);

        Assert.assertEquals("Felipe",account.getUserName());
        Assert.assertEquals((Double)1000.0,account.getAmount());
        System.out.println(account.getAccountNumber());
    }

    @Test
    public void return_true_if_subtract_correctly(){

        account = new Account("Felipe",1000.0);
        Assert.assertTrue(account.withDrawal(500.0));
    }
    @Test
    public void return_false_if_not_subtract(){

        account = new Account("Felipe",400.0);
        Assert.assertFalse(account.withDrawal(500.0));

    }
    @Test
    public void should_subtract_amount(){

        account = new Account("Felipe",1000.0);
        account.withDrawal(500.0);

        Assert.assertEquals((Double)500.0,account.getAmount());

    }
}
