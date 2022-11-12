package com.hasA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address_hasA")
public class Address {
	@Id
	@Column(name="doorNo")
private int doorNo;
	@Column(name="city")
private String city;
	@Column(name="state")
private String state;

public Address() {
	super();
}
public Address(int doorNo, String city, String state) {
	super();
	this.doorNo = doorNo;
	this.city = city;
	this.state = state;
}
public int getDoorNo() {
	return doorNo;
}
public void setDoorNo(int doorNo) {
	this.doorNo = doorNo;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [doorNo=" + doorNo + ", city=" + city + ", state=" + state + "]";
}


}

