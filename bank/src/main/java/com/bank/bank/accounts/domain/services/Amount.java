package com.bank.bank.accounts.domain.services;

import java.text.DecimalFormat;

public class Amount {

    private int value;
    private DecimalFormat decimalFormat = new DecimalFormat("$ #.00");

    public Amount(int value){
        this.value = value;
    }

    public static Amount amountOf(int value){
        return new Amount(value);
    }

    //suma al Amount
    public Amount plus(Amount otherAmount){
        return amountOf(this.value + otherAmount.value);
    }

    //Resta al Amount
    public Amount minus(Amount otherAmount){
        return amountOf(this.value - otherAmount.value);
    }

    //Representa el valor en formato de dinero
    public String moneyRepresentation(){
        return decimalFormat.format(this.value);
    }

    // Retorna el valor en valor absoluto
    public Amount absoluteValue(){
        return amountOf(Math.abs(this.value));
    }

    public int getValue() {
        return value;
    }
}
