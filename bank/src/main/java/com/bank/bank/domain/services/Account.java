package com.bank.bank.domain.services;

import java.util.UUID;

public class Account {

    private String accountNumber;
    private String userName;
    private Double amount = 0.0;

    public Account() {}

    public Account(String username,Double amount) {
        this.accountNumber =  UUID.randomUUID().toString().substring(0,11);
        this.userName = username;
        this.amount = amount;

    }

    public Boolean deposit(Double amount){

        if(amount > 0.0 && amount != null){
            this.amount = this.amount + amount;
            return true;
        }
        return false;
    }
    public Boolean withDrawal(Double value) {

        if(this.amount >= value){
            this.amount = this.amount - value;
            return true;
        }
        return false;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
