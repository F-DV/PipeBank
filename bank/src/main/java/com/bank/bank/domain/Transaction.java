package com.bank.bank.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    private static final String DATE_FORMAT = "dd/mm/yyyy";
    private static final String EMPTY_VALUE = "          ";

    private SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

    private Amount value;
    private Date date;

}
