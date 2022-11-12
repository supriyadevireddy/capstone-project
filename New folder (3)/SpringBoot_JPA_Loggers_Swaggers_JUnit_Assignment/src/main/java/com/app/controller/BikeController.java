package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Bike;
import com.app.service.IBikeSrv;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/Bike")
@Api(value="BikeController", description="Rest apis to work on Bike entity")
public class BikeController {

	org.slf4j.Logger log = LoggerFactory.getLogger(BikeController.class);

	@Autowired
	private IBikeSrv BikeSrv;
	
	@PostMapping(value="/new")
	@ApiOperation(value="api to create a new bike in application")
	public ResponseEntity<Bike> createNewBike(@RequestBody @Valid Bike bike){
		log.debug("new bike - post rest api invoked with input {}", bike);
		Bike b2 = BikeSrv.createNewBike(bike);
		log.debug("output from new bike - post rest api is {}", b2);
		return ResponseEntity.ok(b2);
	}
	
	@PutMapping(value="/old")
	@ApiOperation(value="api to update the existing bike in application")
	public ResponseEntity<Bike> updateOldBike(@RequestBody Bike bike){
		log.debug("old bike - put rest api invoked with input {}", bike);
		Bike b2 = BikeSrv.updateNewBike(bike);
		log.info("old bike - put rest api output is {}", b2);
		return ResponseEntity.ok(b2);
	}

	@DeleteMapping(value="/old/{bikeId}")
	@ApiOperation(value="api to delete bike in application")
	public ResponseEntity<String> deleteBike(@PathVariable int bikeId){
		String result  = BikeSrv.deleteBike(bikeId);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value="/all")
	@ApiOperation(value="api to get all bikes data")
	public ResponseEntity<List<Bike>> getAllBikes(){
		List<Bike> bikes = BikeSrv.getAllBikes();
		return ResponseEntity.ok(bikes);
	}
	
	@GetMapping(value="/get/{bikeId}")
	@ApiOperation(value="to get specific bike")
	public ResponseEntity<Bike> getBike(@PathVariable int bikeId) {
		Bike bike = BikeSrv.getBike(bikeId);
		return ResponseEntity.ok(bike);
	}
	


}
