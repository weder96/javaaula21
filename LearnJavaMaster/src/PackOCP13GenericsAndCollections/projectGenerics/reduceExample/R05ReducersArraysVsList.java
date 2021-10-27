package PackOCP13GenericsAndCollections.projectGenerics.reduceExample;

import java.util.*;

public class R05ReducersArraysVsList {

	public static void main(String[] args) {
				//Reduce Array to sum.
				int[] array = {30, 10, 20, 40};
				int sum = Arrays.stream(array).reduce(0, (x, y) -> x + y);
				System.out.println("Sum of Array: "+ sum);
				
				//Reduce List to sum.
				List<Integer> list = Arrays.asList(30, 10, 20, 40);
				sum = list.stream().reduce(0, (x, y) -> x + y);
				System.out.println("Sum of List: "+ sum);

	}

}
