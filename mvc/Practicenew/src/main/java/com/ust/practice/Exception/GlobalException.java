package com.ust.practice.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@RestControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler{
@ExceptionHandler(IdNotFoundException.class)
public ResponseEntity<String> IdNotFound(){
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id is not found  so try another id");
}
}
