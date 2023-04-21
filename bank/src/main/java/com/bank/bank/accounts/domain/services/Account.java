package com.bank.bank.accounts.domain.services;

import java.io.PrintStream;
import java.time.LocalDate;
import java.util.UUID;

public class Account {

    private String accountNumber;
    private Statement statement;
    private Amount balance = Amount.amountOf(0);

    public Account() {
        this.accountNumber = UUID.randomUUID().toString().substring(0,11);
        this.statement = new Statement();
    }

    //Deposito en cuenta
    public void deposit(Amount value){
        recordTransaction(value, LocalDate.now(),TypeTransaction.DEPOSIT);
    }
    public void withdrawal(Amount value){
        recordTransaction(value, LocalDate.now(),TypeTransaction.WITHDRAW);
    }
    //Transferencia
    public void transfer(Amount money, Account anotherAccount){
        anotherAccount.deposit(money);
        recordTransaction(money,LocalDate.now(),TypeTransaction.TRANSFER);

    }

    public void printStatement(PrintStream printer){
        statement.printTo(printer);
    }

    /**
     * Crea la transacción, realiza la acción sobre el balance y
     * agrega el movimiento al estado de cuenta
     * @param value
     * @param date
     * @param typeTransaction
     */
    private void recordTransaction(Amount value,LocalDate date,TypeTransaction typeTransaction){
        Transaction transaction = new Transaction(value,date,typeTransaction);

        //Realiza la accion sobre el balance
        Amount balanceAfterTransaction = transaction.balanceAfterTransaction(balance,typeTransaction);

        //Actualiza el balance de esta cuenta
        this.balance = balanceAfterTransaction;

        //Agregamos 1 registro a la lista del estado de cuenta
        statement.addLineContaining(transaction, balanceAfterTransaction);

    }


    //Metodo Get para acceder al balance actual de esta cuenta
    public Amount getBalance() {
        return balance;
    }
}
