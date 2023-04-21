package com.bank.bank.accounts.domain.services;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Transaction {

    //Todo: Ponerle a las transacciones un estado para saber si fue exitosa o no
    //Todo: Tambien tipo de transaccion, si fue un retiro, deposito o transferencia
    //Todo: Si fue una transferencia, poner de hacia que cuenta fue la transferencia

    private static final String DATE_FORMAT = "dd-MM-yyyy";
    private static final String EMPTY_VALUE = "          ";

    private DateTimeFormatter sdf = DateTimeFormatter.ofPattern(DATE_FORMAT);

    private Amount amount;
    private LocalDate date;
    private TypeTransaction typeTransaction;

    public Transaction(Amount value, LocalDate date, TypeTransaction typeTransaction) {
        this.amount = value;
        this.date = date;
        this.typeTransaction = typeTransaction;
    }

    public Amount balanceAfterTransaction(Amount currentBalance, TypeTransaction typeTransaction) {
        if(typeTransaction == TypeTransaction.DEPOSIT){
            return currentBalance.plus(this.amount);
        }
        return currentBalance.minus(this.amount);
    }

    public void printTo(PrintStream printer, Amount currentBalance){
        StringBuilder builder = new StringBuilder();

        addDateTo(builder);
        addCurrentBalance(builder,currentBalance);
        addTypeOfTransaction(builder,typeTransaction);

        //imprime el builder final
        printer.println(builder);
    }

    //agregamos la fecha al builder
    private void addDateTo(StringBuilder builder) {
        builder.append(sdf.format(date));
        builder.append(" |");
    }

    //agregamos el balance al builder
    private void addCurrentBalance(StringBuilder builder, Amount currentBalance) {
        builder.append(" ")
                .append(currentBalance.moneyRepresentation());
    }

    //Agregamos el tipo de transaccion
    private void addTypeOfTransaction(StringBuilder builder, TypeTransaction typeTransaction){
        builder.append("  |  ")
                .append(typeTransaction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(sdf, that.sdf) && Objects.equals(amount, that.amount) && Objects.equals(date, that.date) && typeTransaction == that.typeTransaction;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sdf, amount, date, typeTransaction);
    }
}
