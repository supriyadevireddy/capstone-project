package oops.multilevelinheritance;

public class SuperDemo {

	public static <car, Brezza> void main(String[] args) {
		// TODO Auto-generated method stub
    Vehicles vObj=new Vehicles("ABAB232332");
    car cObj=new car("UP3343",8000,"Thar",false);
    Brezza bObj= new Brezza("UP3343",8000,"Thar",false,4,200);
    vd vObj1 new Void();
     
    
    System.out.println("information of vehicle__");
    System.out.println(vObj1.getvehicleNo());
    System.out.println(vObj1.getprice());
    System.out.println();
    
    
    System.out.println("information of car__");
    System.out.println(cObj.getvehicleNo());
    System.out.println(cObj.getprice());
    System.out.println(cObj.getName());
    System.out.println(cObj.isAcOrNonAc());
    System.out.println();
    
    
    System.out.println("information of Brezza__");
    System.out.println(bObj.getvehicleNo());
    System.out.println(bObj.getprice());
    System.out.println(bObj.getName());
    System.out.println(bObj.getNoOfAirBags());
    System.out.println(bObj.isAcOrNonAc());
    System.out.println();
    
    
    System.out.println("information of vd__");
    System.out.println(vObj1.getvehicleNo());
    System.out.println(vObj1.getprice());
    System.out.println(vObj1.getName());
    System.out.println(vObj1.isAcOrNonAc());
    System.out.println(vObj1.getfuelCapacity());
    System.out.println(vObj1.getNoOFAirBags());
    System.out.println();
	}

}
