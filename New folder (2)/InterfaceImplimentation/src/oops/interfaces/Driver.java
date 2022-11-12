package oops.interfaces;

public class Driver {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setFirstName("Supriya");
		user1.setLastName("Reddy");
		user1.setUserName("Sai");
		user1.setPassword("S@1234");	
		
		User user2 = new User();
		user2.setFirstName("Sai");
		user2.setLastName("Reddy");
		user2.setUserName("Supriya");
		user2.setPassword("S@1234");	
		
		User user3 = new User();
		user3.setFirstName("Tharak");
		user3.setLastName("Reddy");
		user3.setUserName("mastan");
		user3.setPassword("S@1234");	
		
		WorkOut workout1 = new WorkOut();
		workout1.setType("muscle");
	    workout1.setEquipment("dumbell");
	    workout1.setWeights(10);
	    workout1.setRepititions(5);
	    workout1.setReason("fairness");
	    
	    WorkOut workout2 = new WorkOut();
		workout2.setType("muscle");
	    workout2.setEquipment("dumbell");
	    workout2.setWeights(10);
	    workout2.setRepititions(5);
	    workout2.setReason("fairness");
	    
	    WorkOut workout3 = new WorkOut();
		workout3.setType("muscle");
	    workout3.setEquipment("dumbell");
	    workout3.setWeights(10);
	    workout3.setRepititions(5);
	    workout3.setReason("fairness");
	    
	    
	    
	    
	       UserImpl userImpl = new UserImpl();
			userImpl.register(user1, 0);
			userImpl.register(user2, 1);
			userImpl.register(user3, 2);
			userImpl.login(user1.getUserName(), user1.getPassword());
			userImpl.login(user2.getUserName(), user2.getPassword());
			userImpl.login(user3.getUserName(), user3.getPassword());
			
			WorkOutImpl workOutImpl = new WorkOutImpl();
			workOutImpl.addWorkout(workout1, 0);
			workOutImpl.addWorkout(workout2, 1);
			workOutImpl.addWorkout(workout3, 2);
			
			workOutImpl.getAllWorkOuts(workout1, 0);
			workOutImpl.getAllWorkOuts(workout2, 1);
			workOutImpl.getAllWorkOuts(workout3, 2);

	}




	}


