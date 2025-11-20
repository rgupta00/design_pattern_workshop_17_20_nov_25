package com.bankapp.controller;

import java.time.LocalDateTime;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bankapp.dto.ErrorResponse;

@RestControllerAdvice
public class AccountAppExHandlerController {

	// ResponseEntity= data +Status code
	@ExceptionHandler({ AccountNotFoundException.class, EmptyResultDataAccessException.class })
	public ResponseEntity<ErrorResponse> handleNotFound(RuntimeException e) {

		String message = e instanceof EmptyResultDataAccessException ? "record is not found" : e.getMessage();

		ErrorResponse errorResponse = ErrorResponse.builder().status(HttpStatus.NOT_FOUND.value())
				.timestamp(LocalDateTime.now()).error(message).toContact("foo@foo.com").build();

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	}

//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorResponse> handle500(Exception e) {
//		ErrorResponse errorResponse = ErrorResponse.builder()
//				.status(HttpStatus.INTERNAL_SERVER_ERROR.value())
//				.timestamp(LocalDateTime.now())
//				.error("pls try after some time")
//				.toContact("foo@foo.com").build();
//		
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
//				.body(errorResponse);
//	}
}
