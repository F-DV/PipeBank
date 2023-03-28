package com.bank.bank.domain;

public class Account {

    private Double amount = 0.0;

    public Boolean deposit(Double amount){

        if(amount > 0.0 && amount != null){
            this.amount = this.amount + amount;
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
}
