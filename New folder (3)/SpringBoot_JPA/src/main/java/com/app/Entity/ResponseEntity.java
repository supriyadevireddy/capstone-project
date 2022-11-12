package com.app.Entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseEntity implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = -2412171568059727186L;
private int statusCode;
private Object data;

}

