package com.app.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.entity.Bike;
import com.app.repository.IBikeRepository;
import com.app.service.IBikeSrv;



@RunWith(SpringRunner.class)
@SpringBootTest
public class BikeSrvImplTest {
	@Autowired  
	private IBikeSrv bikeSrv;
	
	@MockBean
	private IBikeRepository bikeRepository;
	
	@Before
	public void setUp() throws Exception {
	}


	@SuppressWarnings("deprecation")
	public void testCreateNewBike() {
		
		Bike bike = new Bike(11,"herohonda","barathnagar","hyderabad");
		Bike bike2 = new Bike(12, "pulser", "madhapur", "hyd");
		
		when( bikeRepository.save(bike)).thenReturn(bike2);  
		Bike actualBikeReceived = bikeSrv.createNewBike(bike);
		Bike expectedBike = bike2;
		
		assertEquals(actualBikeReceived.getId(), expectedBike.getId());
		
	}

	@Ignore
	@Test
	public void testUpdateNewBike() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testDeleteBike() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testGetAllBikes() {
		fail("Not yet implemented");
	}

	@Ignore
	@Test
	public void testGetBike() {
		fail("Not yet implemented");
	}

}


