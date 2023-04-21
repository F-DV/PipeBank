package com.bank.bank.accounts.domain.services;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Statement {

    private static final int TOP_OF_THE_LIST = 0;
    private static final String STATEMENT_HEADER = "   Date    ||  Balance ||  Type ";


    private List<StatementLine> statementLines = new LinkedList<>(); //Lista de transacciones

    /**
     *Agrega la linea al inicio de la lista
     */
    public void addLineContaining(Transaction transaction,Amount currenBalance){
        statementLines.add(TOP_OF_THE_LIST,new StatementLine(transaction,currenBalance));
    }

    //imprimer el header y la lista de operaciones sobre la cuenta despues
    public void printTo(PrintStream printer){
        printer.println(STATEMENT_HEADER);
        printStatementLine(printer);
    }

    //imprime cada fila de la lista
    public void printStatementLine(PrintStream printer){

        // Consumer que enviar el printer a cada linea
        Consumer<StatementLine> printTo = statementLine -> statementLine.printTo(printer);

        //Recorremos la lista y aplicamos el consumer a cada dato
        statementLines
                .stream()
                .forEach(printTo);

    }

}
