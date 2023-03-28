package com.bank.bank.domain;

import java.util.Date;

public class StatementAccount {


    private Account account;
    private static final String STATEMENT_HEADER = "Date       | Type    | balance  |";

    public String getStatement() {
        return account.getUserName();
    }
}
