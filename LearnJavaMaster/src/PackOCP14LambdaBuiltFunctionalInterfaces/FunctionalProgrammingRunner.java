package PackOCP14LambdaBuiltFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Bat", "Cat", "Dog");
		printWithFPWithFiltering(list);

	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printBasicWithFiltering(
			List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out
				.println("element - " + element));
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		list.stream()
				.filter(element -> element.endsWith("at"))
			.forEach(element -> System.out.println("element - " + element));
	}

}
