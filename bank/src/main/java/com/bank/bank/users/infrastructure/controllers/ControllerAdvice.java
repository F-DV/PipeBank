package com.bank.bank.users.infrastructure.controllers;

import com.bank.bank.users.infrastructure.entities.dtos.errors.ErrorDto;
import com.bank.bank.users.infrastructure.exceptions.BussinesException;
import com.bank.bank.users.infrastructure.exceptions.RequestException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorDto> runtimeExceptionHandler(RuntimeException ex){

        ErrorDto error = ErrorDto.builder().code("P-400").message("ex").build();

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(value = RequestException.class)
    public ResponseEntity<ErrorDto> requestExceptionHandler(RequestException ex){

        ErrorDto error = ErrorDto.builder().code(ex.getCode()).message(ex.getMessage()).build();

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = BussinesException.class)
    public ResponseEntity<ErrorDto> bussinesExceptionHandler(BussinesException ex){

        ErrorDto error = ErrorDto.builder().code(ex.getCode()).message(ex.getMessage()).build();

        return new ResponseEntity<>(error, ex.getStatus());
    }


}
