package com.learn.webSpring;

import java.util.List;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public List<String> handleValidationException(MethodArgumentNotValidException exception){
		return exception.getFieldErrors().stream().map(error -> error.getDefaultMessage()).toList();
	}
}
