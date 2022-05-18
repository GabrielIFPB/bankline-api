package com.dio.santander.banklineapi.builders;

import com.dio.santander.banklineapi.models.CorrentistaHandlerException;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

public interface ExceptionBuilder {
    ExceptionBuilder setMessage(String message);

    ExceptionBuilder setHttpStatus(HttpStatus httpStatus);

    ExceptionBuilder setStatus(int status);

    ExceptionBuilder setTimestamp(Timestamp timestamp);

    <T> T getResult();
}
