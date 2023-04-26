package com.bank.bank.accounts.domain.services;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();

        Amount cantidadADepositar = Amount.amountOf(1000);
        Amount cantidadARetirar = Amount.amountOf(500);
        Amount cantidadADepositar1 = Amount.amountOf(1000);
        Amount cantidadATransferir = Amount.amountOf(200);

        account1.deposit(cantidadADepositar);
        account1.withdrawal(cantidadARetirar);
        account1.deposit(cantidadADepositar1);

        Account account2 = new Account();

        account1.transfer(cantidadATransferir,account2);

        System.out.println("Estado de cuenta 1");
        account1.printStatement(System.out);

        System.out.println("");
        System.out.println("Estado de cuenta 2");
        account2.printStatement(System.out);
    }
}
