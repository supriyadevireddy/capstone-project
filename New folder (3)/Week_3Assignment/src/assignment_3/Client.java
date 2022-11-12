package assignment_3;

public class Client {

	public static void main(String[] args) {
		Player p1 = new Batsmen(101, "Virat", "batsmen", 180, 9000, 10000, 50);
		Player p2 = new Bowler1(102, "Bumrah", "bowler", 35, 8000, 200, 8);
		
		System.out.println("bonus generated for batsmen is "+p1.getbonus());//2700.0
		System.out.println("bonus generated for bowler is "+p2.getbonus());//1600.0

	}

}
