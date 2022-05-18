package com.dio.santander.banklineapi.builders;

import com.dio.santander.banklineapi.models.CorrentistaHandlerException;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

public class HandlerExceptionBuilder implements ExceptionBuilder {

    private String message;
    private HttpStatus httpStatus;
    private int status;
    private Timestamp timestamp;

    @Override
    public ExceptionBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public ExceptionBuilder setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
        return this;
    }

    @Override
    public ExceptionBuilder setStatus(int status) {
        this.status = status;
        return this;
    }

    @Override
    public ExceptionBuilder setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public static ExceptionBuilder builder() {
        return new HandlerExceptionBuilder();
    }

    public CorrentistaHandlerException getResult() {
        return new CorrentistaHandlerException(
                this.message, this.httpStatus, this.status, this.timestamp
        );
    }
}
