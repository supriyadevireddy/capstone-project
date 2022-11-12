package com.depCheck;

public class Address {
	private int  streetNo;
	private String city;
	private String state;

	public Address() {
		super();
	}
	public Address(int streetNo, String city, String state) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		this.state = state;
	}
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
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
		return "Address [streetNum=" + streetNo + ", city=" + city + ", state=" + state + "]";
	}



	}



