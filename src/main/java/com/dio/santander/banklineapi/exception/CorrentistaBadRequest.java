package com.dio.santander.banklineapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CorrentistaBadRequest extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CorrentistaBadRequest() {
        super();
    }
    public CorrentistaBadRequest(String message, Throwable cause) {
        super(message, cause);
    }
    public CorrentistaBadRequest(String message) {
        super(message);
    }
    public CorrentistaBadRequest(Throwable cause) {
        super(cause);
    }
}
