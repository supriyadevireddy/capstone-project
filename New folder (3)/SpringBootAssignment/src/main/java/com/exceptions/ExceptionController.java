package com.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pojo.ResponseEntity;

@ControllerAdvice
public class ExceptionController {
@ExceptionHandler (value = UserNotFoundException .class)
	public ResponseEntity  handleExceptions() {
		
		ResponseEntity  resp = new ResponseEntity();
		resp.setMessage("user not found");
		resp.setStatusCode(500);
		
		return resp;
	}
@ExceptionHandler(value = NullPointerException.class)
public ResponseEntity  handleNullPointerExceptions() {
	
	ResponseEntity  resp = new ResponseEntity("method being called on the value is null" , 500);
	return  resp;
}
@ExceptionHandler(value = Exception.class)
public ResponseEntity  handleUnknownExceptions() {
	
	ResponseEntity  resp = new ResponseEntity("exception occured" , 500);
	return  resp;
}
}