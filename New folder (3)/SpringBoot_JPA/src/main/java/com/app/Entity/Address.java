package com.app.Entity;
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
	@Table(name="adr_tab_jpa")
	public class Address {
		
		@Id
		@Column(name="door_no")
		private int doorNo;
		@Column(name="city")
		private String city;
		@Column(name="state")
		private String state;
		@Column(name="pin_code")
		private int pinCode;

	}


