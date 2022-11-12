package oops.multilevelinheritance;

import javax.print.DocFlavor.STRING;

public class VdExtendsBrezza {
   private boolean isTouchAvailable;
   private boolean isSunRoofed;
   
   public VdExtendsBrezza() {
	   
   }
	
   public void set void isTouchAvailable(boolean isTouchAvailable) {
	   this.isTouchAvailable=isTouchAvailable;
   }
   public boolean isSunRoofed() {
	   return isSunRoofed;
   }
   public void set1 void isSunRoofed(boolean isSunRoofed) {
	   this.isSunRoofed=isSunRoofed;
   
   

public VdExtendsBrezza (STRING vehicleNo,intprice,StringName,boolean isAcOrNonAc,intfuelCapacity,boolean isTouchAvailable,boolean isSunRoofed) {
	super(vehicleNo,price,name,isAcOrNonAc,noofAirBags,fuelCapacity);
	this.isTouchAvailable=isTouchAvailable;
	this.isSunRoofed=isSunRoofed;
}
