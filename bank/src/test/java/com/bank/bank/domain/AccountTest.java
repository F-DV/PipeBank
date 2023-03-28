package com.bank.bank.domain;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void return_true_when_deposit() {

        Account account = new Account();
        Assert.assertTrue(account.deposit(1000.0));
    }
    @Test
    public void return_false_when_deposit_is_Zero(){

        Account account1 = new Account();
        Assert.assertEquals(false,account1.deposit(0.0));
    }

    @Test
    public void return_amount_when_deposit(){

        Account account = new Account();//Creo cuenta
        account.deposit(1000.0); //Hago deposito

        Assert.assertEquals((Double)1000.0,account.getAmount()); //Verifico deposito 1

        account.deposit(1000.0); //Hago deposito
        Assert.assertEquals((Double)2000.0,account.getAmount()); //Verifico deposito 2
    }
}
