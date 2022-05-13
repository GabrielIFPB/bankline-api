package com.dio.santander.banklineapi.models;

import org.springframework.http.HttpStatus;

import java.sql.Timestamp;


public class CorrentistaHandlerException {

    private String message;
    private HttpStatus httpStatus;
    private int status;
    private Timestamp timestamp;

    public CorrentistaHandlerException() {
    }

    public CorrentistaHandlerException(String message, HttpStatus httpStatus, int status, Timestamp timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.status = status;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
