package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Address;

public interface IAddressRepo extends JpaRepository<Address , Integer> {

}

