package com.spring.beer.sfgbeerservice.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException exception){
            List<String> errorList = new ArrayList<>(exception.getConstraintViolations().size());
            exception.getConstraintViolations().forEach(error->errorList.add(error.toString()));
            return ResponseEntity.badRequest().body(errorList);
    }
}
