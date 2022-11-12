package com.pojo;

public class ResponseEntity {

	private Object message;
	private int statusCode;
	
	public ResponseEntity() {
		super();
	}
	public ResponseEntity(Object message, int statusCode) {
		super();
		this.message = message;
		this.statusCode = statusCode;
	}
	public Object getMessage() {
		return message;
	}
	public void setMessage(Object message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	@Override
	public String toString() {
		return "ResponseEntity [message=" + message + ", statusCode=" + statusCode + "]";
	}
	
	
}
