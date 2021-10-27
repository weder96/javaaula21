package PackOCP13GenericsAndCollections.projectGenerics.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class A02ArrayListIntegerPrimitive {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		System.out.println(A02ArrayListIntegerPrimitive.sum(lista));
		System.out.println(A02ArrayListIntegerPrimitive.sumInteger(lista));
		
		List<Integer> bigs = Arrays.asList(100,200,300);
		assert A02ArrayListIntegerPrimitive.sumInteger(bigs) == A02ArrayListIntegerPrimitive.sum(bigs);
		assert A02ArrayListIntegerPrimitive.sumInteger(bigs) != A02ArrayListIntegerPrimitive.sumInteger(bigs); //not recomendado
		assert A02ArrayListIntegerPrimitive.sumInteger(bigs).equals(A02ArrayListIntegerPrimitive.sumInteger(bigs));
		assert A02ArrayListIntegerPrimitive.sumInteger(bigs) != A02ArrayListIntegerPrimitive.sumIntegerIterator(bigs);
	}

	
	public static int sum (List<Integer> ints) { 
		int s = 0;
			for (int n : ints) { 
			s += n; 
			}
		return s;
	}
	
	public static Integer sumInteger (List<Integer> ints) { 
		Integer s = 0;
			for (Integer n : ints) { 
			s += n; 
			}
		return s;
	}
	
	public static Integer sumIntegerIterator (List<Integer> ints) { 
		Integer s = 0;
		for (Iterator<Integer> it = ints.iterator(); it.hasNext(); ) { 
			int n = it.next();
		     s += n;
		}
		return s;
	}
	
	
	
	
}