module com.java.switc {
	public static void main(string[]args) {
		int num1=10, num2=20;
		
		string operation  = "mul";
		switch (operation) {
		case "Add":
			system.out.println(num1+num2);
			break;
		case "mul":
			system.out.println(num1*num2);
			break;
		case "sub":
			system.out.println(num1-num2);
			break;case "Add":
				system.out.println(num1+num2);
				
			
		case "div":
			system.out.println(num1/num2);
			break;
			
		default:
			system.out.println("enter valid operation");
		
		}
	}
}