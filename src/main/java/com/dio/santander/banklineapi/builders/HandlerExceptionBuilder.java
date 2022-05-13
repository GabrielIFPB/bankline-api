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
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    @Override
    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public CorrentistaHandlerException getResult() {
        return new CorrentistaHandlerException(
                this.message, this.httpStatus, this.status, this.timestamp
        );
    }
}
