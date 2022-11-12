package com.app.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
			
			@ExceptionHandler(Exception.class)
	 		public ResponseEntity<String>handleAnyException(Exception ex){
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.toString());
	 			
	 		}

}

