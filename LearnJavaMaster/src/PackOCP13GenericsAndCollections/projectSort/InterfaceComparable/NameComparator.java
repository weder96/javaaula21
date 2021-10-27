package PackOCP13GenericsAndCollections.projectSort.InterfaceComparable;

import java.util.Comparator;

public class NameComparator  implements Comparator {
	
	public int compare(Object o1,Object o2){  
		Estudante s1 = (Estudante) o1;  
		Estudante s2 = (Estudante) o2;  
		  
		return s1.name.compareTo(s2.name);  
		}  

}
