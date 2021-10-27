package PackOCP13GenericsAndCollections.projectSort.main;

import java.util.ArrayList;
import java.util.Collections;

public class S03CollectiosPOJO {

	public static void main(String[] args) {
		ArrayList<Estudante> al=new ArrayList<Estudante>();  
		al.add(new Estudante(101,"Vijay",23));  
		al.add(new Estudante(106,"Ajay",27));  
		al.add(new Estudante(105,"Jai",21));  
		  
		Collections.sort(al);  
		
		for(Estudante st:al){  
		System.out.println(st.toString());  
		}  

	}

}
