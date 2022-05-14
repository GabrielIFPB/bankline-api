package com.dio.santander.banklineapi.builders;

import org.springframework.http.HttpStatus;

import java.sql.Timestamp;

public interface ExceptionBuilder {
    void setMessage(String message);

    void setHttpStatus(HttpStatus httpStatus);

    void setStatus(int status);

    void setTimestamp(Timestamp timestamp);

}
