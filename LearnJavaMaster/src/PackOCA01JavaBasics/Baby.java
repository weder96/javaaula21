package PackOCA01JavaBasics;

public class Baby {
	public static String play(int toy, int age) {
		String game ="";
		if(toy<2){
			 // game = age > 1 ? 1 : 10; // p1 not copila nesta linha incompativeis
		}
		else{
			game = age > 3 ? "Ball" : "Swim"; // p2
		}

		return game;
	}
	public static void main(String[] variables) {
		System.out.print(play(5,2));
	}
}