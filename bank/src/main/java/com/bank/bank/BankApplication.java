package com.bank.bank;

import com.bank.bank.domain.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class BankApplication {

	private final static Logger log = Logger.getLogger(Account.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);

		Account cuentaFelipe = new Account("Felipe",1000.0);
		log.info(cuentaFelipe.getAccountNumber());

	}

}
