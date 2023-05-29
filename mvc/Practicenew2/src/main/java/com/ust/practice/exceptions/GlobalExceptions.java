package com.ust.practice.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestControllerAdvice
public class GlobalExceptions extends ResponseEntityExceptionHandler{
@ExceptionHandler( IdNotFoundException.class)
public ResponseEntity<?> idnot(){
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id not found.......oops........");
}
}
