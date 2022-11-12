package com.app.Entity;

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
public class SelectedStudentInfo {
	
	private int rollNo;
	private String name;
	private String city;
	private String state;
	
	
}