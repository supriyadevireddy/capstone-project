package oops.multilevelinheritance;

public class MultileveInheritanceDemo {

	public static   void main(String[] args) {
		// TODO Auto-generated method stub
    Vehicles vObj = new Vehicles();
    vObj.setVehicleNo("ABAB3434");
    vObj.setprice(9000);
    
    car cObj = new car();
    cObj.setvehicleNo("TL343434");
    cObj.setprice(8000);
    cObj.setAcOrNonAc(true);
    cObj.setName("Thar");
    
    Brezza bObj = new Brezza();
    bObj.setvehicleNo("ER3434343");
    bObj.setprice(7000);
    bObj.setAcOrNonAc(true);
    bObj.setName("Brezza");
    bObj.setNoOfAirBags(4);
    
    vd vObj = new vd();
    vObj.setvehicleNo("RE12121");
    vObj.setprice(5000);
    vObj.setAcOrNonAc(false);
    vObj.setName("swift");
    vObj.setfuelCapacity(100);
    vObj.setNoOfAirBags(2);
    vObj.setTouchAvailable(true);
    vObj.setSunRoofed(false);
	}}