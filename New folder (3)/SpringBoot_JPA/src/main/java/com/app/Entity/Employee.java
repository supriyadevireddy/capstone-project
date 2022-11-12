package com.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name="emptable")
public class Employee  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -363579449885242157L;
	@Id
	@Column(name="emplId")
private int emplId;
	@Column(name="name")
private String name;
	@Column(name="salary")
private int salary;
	@Column(name="bonus")
private int bonus;

}

