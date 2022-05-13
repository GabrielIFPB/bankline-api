package com.dio.santander.banklineapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CorrentistaNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CorrentistaNotFoundException() {
        super();
    }
    public CorrentistaNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public CorrentistaNotFoundException(String message) {
        super(message);
    }
    public CorrentistaNotFoundException(Throwable cause) {
        super(cause);
    }
}
