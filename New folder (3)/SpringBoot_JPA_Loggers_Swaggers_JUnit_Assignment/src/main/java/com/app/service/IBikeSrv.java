package com.app.service;

import java.util.List;

import com.app.entity.Bike;

public interface IBikeSrv {
Bike createNewBike(Bike bike);
	
	Bike updateNewBike(Bike bike);
	
	String deleteBike(int id);
	
	List<Bike> getAllBikes();
	
	Bike getBike(int id);
}
