package oops.multilevelinheritance;

public class BrezzaExtendsCar {
private int noofAirBags;
private int fuelCapacity;

public BrezzaExtendsCar () {
}
public BrezzaExtendsCar (String vehicleNo,intprice,Stringname,Boolean isAcOrNonAc,int noofAirBags,int fuelCapacity) {
	

super(vehicleNo,price,name,isAcOrNonAc);
this.noofAirBags = noofAirBags;
this.fuelCapacity = fuelCapacity;}

public int getNoOfAirBags() {
	
	return noofAirBags;

	}
public void setNoOfAirBags(int NoOFAirBags) {
	this.noofAirBags = noofAirBags;
}
public int getfuelCapacity() {
	return fuelCapacity;
}
public void getfuelCapacity(int fuelCapacity) {
	this.fuelCapacity = fuelCapacity;
}
}