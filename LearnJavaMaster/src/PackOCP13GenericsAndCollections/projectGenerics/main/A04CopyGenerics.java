package PackOCP13GenericsAndCollections.projectGenerics.main;

import java.util.Arrays;
import java.util.List;

public class A04CopyGenerics {

	public static void main(String[] args) {
		List<Object> objs = Arrays.<Object>asList(2, 3.14, 5, "four"); 
		List<Integer> ints = Arrays.asList(5, 6 ,10); 
		List<Integer> ints2 = Arrays.asList(10, 11 ,12);
		
		A04CopyGenerics.copy(objs, ints);
		A04CopyGenerics.copy1(ints, ints2);
		A04CopyGenerics.copy2(objs, ints);
		A04CopyGenerics.copy3(objs, ints);
		A04CopyGenerics.copy4(objs, ints);
		//assert objs.toString().equals("[5, 6, 10, four]");
		System.out.println(objs.toString());

	}
	
	public static <T> void copy(List<? super T> dst, List<? extends T> src) 
	{ 
		for (int i = 0; i < src.size(); i++) {
		 dst.set(i, src.get(i)); 
		 }
	}
	
	
	public static <T> void copy1(List<T> dst, List<T> src){ A04CopyGenerics.copy(dst, src);}
	public static <T> void copy2(List<T> dst, List<? extends T> src){ A04CopyGenerics.copy(dst, src);}
	public static <T> void copy3(List<? super T> dst, List<T> src){ A04CopyGenerics.copy(dst, src);}
	public static <T> void copy4(List<? super T> dst, List<? extends T> src){A04CopyGenerics.copy(dst, src);}

}
