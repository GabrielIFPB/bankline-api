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

    @ExceptionHandler(value = {CorrentistaBadRequest.class})
    public ResponseEntity<Object> correntistaBadRequest(CorrentistaBadRequest e) {

        CorrentistaHandlerException correntistaHandlerException = this.constructHandlerException(
                e
        );
        return new ResponseEntity<>(
                correntistaHandlerException,
                HttpStatus.BAD_REQUEST
        );
    }

    @ExceptionHandler(value = {CorrentistaNotFoundException.class})
    public ResponseEntity<Object> correntistaNotFoundException(CorrentistaNotFoundException e) {

        CorrentistaHandlerException correntistaHandlerException = this.constructHandlerException(
                e
        );
        return new ResponseEntity<>(
                correntistaHandlerException,
                HttpStatus.NOT_FOUND
        );
    }

    private CorrentistaHandlerException constructHandlerException(RuntimeException e) {
        // the two ways to use patterns builder
//        HandlerExceptionBuilder builder = new HandlerExceptionBuilder();
//        builder.setMessage(e.getMessage());
//        builder.setHttpStatus(HttpStatus.NOT_FOUND);
//        builder.setStatus(HttpStatus.NOT_FOUND.value());
//        builder.setTimestamp(new Timestamp(System.currentTimeMillis()));
//       return builder.getResult();

        return HandlerExceptionBuilder.builder()
                .setMessage(e.getMessage())
                .setHttpStatus(HttpStatus.NOT_FOUND)
                .setStatus(HttpStatus.NOT_FOUND.value())
                .setTimestamp(new Timestamp(System.currentTimeMillis()))
                .getResult();
    }
}
