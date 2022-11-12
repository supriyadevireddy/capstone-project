package com.app.exceptionHandling;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
Logger log = LoggerFactory.getLogger(ExceptionController.class);
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> handleInvalidInput(MethodArgumentNotValidException ex){
		log.debug(ex.toString());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Please check the input data");
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleNullPointerException(NullPointerException ex){
		log.error(ex.toString());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Please check the data given before operating on null");
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception ex){
		log.error(ex.toString());
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.toString());
	}
	
}
