package oops.interfaces;


public class WorkOutImpl  {

	public void addWorkout(WorkOut workout, int index) {
		
	}

	public void getAllWorkOuts(WorkOut workout, int index) {
		
		System.out.println(index + ". WorkOut List " +index);
		
		  System.out.println("Index = "+index +", Type = " + workout.getType());
		  System.out.println("Equipment = "+workout.getEquipment());
		  System.out.println("Weights = "+workout.getWeights());
		  System.out.println("Repititions = "+workout.getRepititions());
		  System.out.println("Reason = "+workout.getReason());

		 
		
		
	}
}
