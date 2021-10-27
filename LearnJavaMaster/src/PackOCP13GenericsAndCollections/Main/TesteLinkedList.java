package PackOCP13GenericsAndCollections.Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TesteLinkedList {

	public static void main ( String [] args ) {
		 List<Integer> arrayList = new ArrayList<Integer>();
		 List<Integer> linkedList = new LinkedList<Integer>();
		 Set<String> set = new HashSet<String>();
		 
		 
		 long tempo = TesteLinkedList.adicionaNoFinal ( arrayList ) ;
		 System.out.println (" ArrayList : " + tempo + "ms") ;
		
		 tempo = TesteLinkedList.adicionaNoFinal ( linkedList ) ;
		 System.out.println (" LinkedList : " + tempo + "ms") ;
		
		 //tempo = TesteLinkedList.adicionaNoFinal ( set ) ;
		 //System.out.println (" set : " + tempo + "ms") ;
		 set.add("weder");
		 set.add("edmilson");
		 set.add("weder");
		 set.add("weder");
		 set.add("weder");
		 set.add("edmilson");
		 set.add("daniel");
		 
		// for(int i = 0; i < set.size();i++ ){
		System.out.println(set);	 
		 
		 
		 }
		
		 public static <E> long adicionaNoFinal(Collection lista ) {
		 long inicio = System . currentTimeMillis () ;
		 int size = 1000000;
		 for (int i = 0; i < size ; i ++) {
		 lista.add(i) ;
		 }
		 long fim = System . currentTimeMillis () ;
		
		 return fim - inicio ;
		 }
}
		
