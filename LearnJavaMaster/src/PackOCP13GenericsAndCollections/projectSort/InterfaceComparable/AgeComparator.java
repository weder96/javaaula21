package PackOCP13GenericsAndCollections.projectSort.InterfaceComparable;

import java.util.Comparator;

public class AgeComparator implements Comparator{
	
	public int compare(Object o1,Object o2){  
		Estudante s1 = (Estudante)o1;  
		Estudante s2 = (Estudante)o2;  
		  
		if(s1.age==s2.age)  
		return 0;  
		else if(s1.age>s2.age)  
		return 1;  
		else  
		return -1;  
		}  

}
