package com.bank.bank.users.infrastructure.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class RequestException extends RuntimeException{

    private String code;
    private HttpStatus status;

    public RequestException(String code,HttpStatus status,String message){
        super(message);
        this.code = code;
        this.status = status;

    }
}