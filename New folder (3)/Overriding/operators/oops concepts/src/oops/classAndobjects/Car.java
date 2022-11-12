package oops.classAndobjects;

public class Car{
	
    private String model;
    private String colour;
    private String vehicleNo;
    private String price;
    private String millage;
	public static void main(String[] args) {
	}

	 Car c1 = new Car ();
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getMillage() {
		return millage;
	}
	public void setMillage(int i, String millage) {
		this.millage = millage;
	}
	public Car getC1() {
		return c1;
	}
	public void setC1(Car c1) {
		this.c1 = c1;
	}{
	 c1.setModel("THAR");
	 c1.setColour("Red");
	 c1.setVehicleNo("ABAB3434");
	 c1.setMillage(25, colour);
	 c1.setPrice(16);
}
{
   System.out.println(c1.getModel());
   System.out.println(c1.getColour());
   System.out.println(c1.getVehicleNo());
   System.out.println(c1.getMillage());
   System.out.println(c1.getPrice());
   
}
private void setPrice(int i) {
	// TODO Auto-generated method stub
	
}
}
