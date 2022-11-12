package java_8_features;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = (x, y, z) -> {
			System.out.println("input received are "+x+" - "+y+" - "+z);
				return (x+y+z);
		  };

int sum = obj.generateSum(10,  20,  30);
System.out.println("result is "+sum);
	}

}
