package PackOCP13GenericsAndCollections.projectGenerics.example;

public class Main {

	public static void main(String[] args) {
		Pair<String, Integer, Double> pair = new Pair<String, Integer, Double>("one",2 , 3.0); 
		
		assert pair.getFirst().equals("one") && pair.getSecond() == 2;
		assert pair.getFirst().equals("one");
		assert pair.getSecond() == 2;
		assert pair.getThr() == 3.0;

	}

}
