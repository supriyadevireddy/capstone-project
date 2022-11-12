package com.app.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="st_tab_jpa")
	public class Student {
		
		@Id
		@Column(name="roll_no")
		private int rollNo;
		@Column(name="st_name")
		private String name;
		@Column(name="st_gender")
		private char gender;
		
		@ManyToOne
		@JoinColumn
		private Address address;

	}


