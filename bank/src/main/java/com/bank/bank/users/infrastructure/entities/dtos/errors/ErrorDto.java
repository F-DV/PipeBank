package com.bank.bank.users.infrastructure.entities.dtos.errors;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDto {

    private String code;
    private String message;
}
