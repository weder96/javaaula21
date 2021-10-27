package PackOCP13GenericsAndCollections.projectGenerics.reduceExample;

import java.util.Arrays;

public class R01Reducers {

	public static void main(String[] args) {
	  int[] array = {23,43,56,97,32};
   	  //By default start value is 0. Result will be sum of array.
   	  Arrays.stream(array).reduce((x,y) -> x+y).ifPresent(s -> System.out.println(s));
   	  Arrays.stream(array).reduce(Integer::sum).ifPresent(s -> System.out.println(s));
   	  Arrays.stream(array).reduce(StatisticsUtility::addIntData).ifPresent(s -> System.out.println(s));

	}

}
