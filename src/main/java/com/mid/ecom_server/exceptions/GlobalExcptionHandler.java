package com.mid.ecom_server.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExcptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String>handlenotfound(String msg) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
		
	}

}
