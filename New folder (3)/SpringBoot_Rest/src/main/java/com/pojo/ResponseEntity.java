package com.pojo;

public class ResponseEntity {
	
private Object mesage;
private int statusCode;

public ResponseEntity() {
	super();
}
public ResponseEntity(Object mesage, int statusCode) {
	super();
	this.mesage = mesage;
	this.statusCode = statusCode;
}
public Object getMesage() {
	return mesage;
}
public void setMesage(Object mesage) {
	this.mesage = mesage;
}
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
@Override
public String toString() {
	return "ResponseEntity [mesage=" + mesage + ", statusCode=" + statusCode + "]";
}

}

