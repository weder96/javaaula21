package PackOCP13GenericsAndCollections.projectGenerics.main;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class A05GenericsCollections {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,2,3); 
		assert sum(ints) == 6.0;

		List<Double> doubles = Arrays.asList(2.78,3.14); 
		assert sum(doubles) == 5.92;
		
		List<Number> nums = Arrays.asList(1,2,2.78,3.14);
		assert sum(nums) == 8.92;
	}
	
	public static double sum(Collection<? extends Number> nums) { 
		double s = 0.0;
			for (Number num : nums) 
				s += num.doubleValue();
			return s;
	}
}
