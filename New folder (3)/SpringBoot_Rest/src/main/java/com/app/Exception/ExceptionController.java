package com.app.Exception;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.pojo.ResponseEntity;

@ControllerAdvice
public class ExceptionController {
@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity handleExceptions() {
		ResponseEntity resp = new ResponseEntity();
		resp.setMesage("EMPLOYEE NOT FOUND");
		resp.setStatusCode(500);
		return resp;
		
	}
	
@ExceptionHandler(value= NullPointerException.class)
public ResponseEntity handleNullPointer(){
	ResponseEntity resp = new ResponseEntity("method being called on the value null", 500);
	return resp;
}

@ExceptionHandler(value=Exception.class)
public ResponseEntity handleUnKnownExceptions(){
	
	ResponseEntity resp = new ResponseEntity("exception occurred", 500);
	return resp;
	
}


}

