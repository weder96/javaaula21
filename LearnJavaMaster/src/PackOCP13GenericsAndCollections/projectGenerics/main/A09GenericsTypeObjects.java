package PackOCP13GenericsAndCollections.projectGenerics.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A09GenericsTypeObjects {

	public static void main(String[] args) {
		List<Object> objs = Arrays.<Object>asList("one", 2, 3.14, 4); 
		A09GenericsTypeObjects.reverse(objs);
		System.out.println(objs);
		
		List<Integer> ints = Arrays.<Integer>asList(2, 314, 4); 
		A09GenericsTypeObjects.reverse(ints);
		System.out.println(ints);
	}
	
	public static <T> void  reverse(List<T> list) { 
		List<T> tmp = new ArrayList<T>(list);
			for (int i = 0; i < list.size(); i++) {
				list.set(i, tmp.get(list.size()-i-1)); 
		}
	}

}
