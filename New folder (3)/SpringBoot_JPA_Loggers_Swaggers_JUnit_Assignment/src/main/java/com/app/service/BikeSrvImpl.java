package com.app.service;

import java.util.List;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.entity.Bike;
import com.app.repository.IBikeRepository;

@Service
public abstract class BikeSrvImpl implements IBikeSrv {
org.slf4j.Logger log = LoggerFactory.getLogger(BikeSrvImpl.class);
	
	@Autowired
	private IBikeRepository bikeRepository;
	
	public Bike createNewBike(Bike bike) {
		log.debug("create new bike service layer is invoked with input - {}", bike);
		Bike b2 =bikeRepository.save(bike);
		log.debug("output from service layer of createNewBike method is {}", b2);
		return b2;
	}

	public Bike updateNewBike(Bike bike) {
		log.info("update old bike service layer is invoked with input - {}", bike);
		Bike b2 = bikeRepository.save(bike);
		log.debug("output from update server layer is {}", b2);
		return b2;
	}

	public String deleteBike(int id) {
		 bikeRepository.delete(id);
		return "bike deletion success";
	}

	public List<Bike> getAllBike() {
		List<Bike> bike = bikeRepository.findAll();
		return bike;
	}

	public Bike getBike(int id) {
		Bike bike = bikeRepository.findOne(id);
		return bike;

}
}