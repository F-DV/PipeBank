package com.bank.bank.domain.services;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {

    //Todo: Ponerle a las transacciones un estado para saber si fue exitosa o no
    //Todo: Tambien tipo de transaccion, si fue un retiro, deposito o transferencia
    //Todo: Si fue una transferencia, poner de hacia que cuenta fue la transferencia

    private static final String DATE_FORMAT = "dd/mm/yyyy";
    private static final String EMPTY_VALUE = "          ";

    private SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

    private Amount value;
    private Date date;

}
