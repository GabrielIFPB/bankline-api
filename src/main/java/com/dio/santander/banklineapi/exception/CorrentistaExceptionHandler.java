package com.dio.santander.banklineapi.exception;

import com.dio.santander.banklineapi.builders.HandlerExceptionBuilder;
import com.dio.santander.banklineapi.models.CorrentistaHandlerException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.Timestamp;


@ControllerAdvice
public class CorrentistaExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {CorrentistaNotFoundException.class})
    public ResponseEntity<Object> correntistaNotFoundException(CorrentistaNotFoundException e) {

        HandlerExceptionBuilder handlerExceptionBuilder = new HandlerExceptionBuilder();

        CorrentistaHandlerException correntistaHandlerException = this.constructHandlerException(
                handlerExceptionBuilder, e
        );
        ResponseEntity<Object> responseEntity = new ResponseEntity<>(
                correntistaHandlerException,
                HttpStatus.NOT_FOUND
        );
        return responseEntity;
    }

    private CorrentistaHandlerException constructHandlerException(HandlerExceptionBuilder builder, CorrentistaNotFoundException e) {
        builder.setMessage(e.getMessage());
        builder.setHttpStatus(HttpStatus.NOT_FOUND);
        builder.setStatus(HttpStatus.NOT_FOUND.value());
        builder.setTimestamp(new Timestamp(System.currentTimeMillis()));
        return builder.getResult();
    }
}
