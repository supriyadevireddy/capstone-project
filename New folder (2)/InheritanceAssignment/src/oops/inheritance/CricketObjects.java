package oops.inheritance;

public class CricketObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Players p1=new Players(10, "sushanth" , "wicketkeeper",20, 1000   );
        Players p2=new Players();
        Players p3=new Bowlers(12, "yuvaraj", "third man", 40, 3000, 5, 9);
        
	System.out.println("players bonus 10% is"+" " +p1.getbonus());
	p2.getbonus();
	p3.getbonus();
 
	}


	}


