package PackOCP13GenericsAndCollections.projectGenerics.main;

public class A11GenericsCompareTo {

	public static void main(String[] args) {
		Integer int0 = 0;
		Integer int1 = 1;
		
		Double num1 =0.0;
		Double num2 =0.0;
		
		System.out.println(int0.compareTo(int1));
		System.out.println(int1.compareTo(int0));
		
		System.out.println(num1.compareTo(num2));

		//nao funciona para number
		assert int0.compareTo(int1) < 0;
	}

}
