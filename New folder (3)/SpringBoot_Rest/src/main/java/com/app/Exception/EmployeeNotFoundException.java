package com.app.Exception;

public class EmployeeNotFoundException extends RuntimeException{

	public EmployeeNotFoundException() {
		super("employee not found");
	}

}

