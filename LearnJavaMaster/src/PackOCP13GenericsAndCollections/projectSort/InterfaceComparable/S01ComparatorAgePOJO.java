package PackOCP13GenericsAndCollections.projectSort.InterfaceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class S01ComparatorAgePOJO {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();  
		al.add(new Estudante(101,"Vijay",23));  
		al.add(new Estudante(106,"Ajay",27));  
		al.add(new Estudante(105,"Jai",21));  
		  
		System.out.println("Sorting by Name...");  
		  
		Collections.sort(al,new NameComparator());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			Estudante st=(Estudante)itr.next();  
		System.out.println(st.toString());  
		}  
		  
		System.out.println("sorting by age...");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
			Estudante st=(Estudante)itr2.next();  
		System.out.println(st.toString());  
		}  
		  

	}

}
