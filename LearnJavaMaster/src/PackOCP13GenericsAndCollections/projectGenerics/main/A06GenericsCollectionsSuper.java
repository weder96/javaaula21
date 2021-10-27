package PackOCP13GenericsAndCollections.projectGenerics.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class A06GenericsCollectionsSuper {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>(); 
		count(ints, 5);
		assert ints.toString().equals("[0, 1, 2, 3, 4]");
		
		List<Number> nums = new ArrayList<Number>(); 
		count(nums, 5); 
		nums.add(5.0);
		assert nums.toString().equals("[0, 1, 2, 3, 4, 5.0]");
		
		List<Object> objs = new ArrayList<Object>(); 
		objs.add("five");
		count(objs, 5);
		System.out.println(objs.toString());
		assert objs.toString().equals("[five, 0, 1, 2, 3, 4]");

	}
	
	public static void count(Collection<? super Integer> ints, int n) {
		for (int i = 0; i < n; i++) 
			ints.add(i); 
		}

}
