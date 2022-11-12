package com.app.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Bike;

public interface IBikeRepository extends JpaRepository<Bike, Integer>{

	public Bike save(Bike bike);

	public void delete(int id);

	public List<Bike> findAll();

	public Bike findOne(int id);

}
