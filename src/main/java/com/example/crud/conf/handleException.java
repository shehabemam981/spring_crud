package com.example.crud.conf;

import com.example.crud.model.ExceptionResponseModel;
import com.example.crud.service.LocalTranslatorMessages;
import jakarta.transaction.SystemException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class handleException extends ResponseEntityExceptionHandler{
    @ExceptionHandler(SystemException.class)
    public ResponseEntity<ExceptionResponseModel> handleSystemExcepition(SystemException e){
        return ResponseEntity.ok(new ExceptionResponseModel(
                HttpStatus.BAD_REQUEST, LocalTranslatorMessages.getMessagesinArandEn(e.getMessage())

        ));
    }
}
