package PackOCP13GenericsAndCollections.projectGenerics.main;

import java.util.ArrayList;
import java.util.List;

public class A10GenericsReturnArraysType {

	public static <T> List<T> factory() { return new ArrayList<T>(); } 

	public static void main(String[] args) {
		List<Integer> list = A10GenericsReturnArraysType.factory();
		List<?> list2 = A10GenericsReturnArraysType.<Object>factory();
	}

}
