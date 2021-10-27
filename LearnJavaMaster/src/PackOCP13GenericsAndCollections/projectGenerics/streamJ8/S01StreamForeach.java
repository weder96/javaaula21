package PackOCP13GenericsAndCollections.projectGenerics.streamJ8;

import java.util.Arrays;
import java.util.List;

public class S01StreamForeach {

	public static void main(String[] args) {
	
   List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 0);
	 
	//Implementação tradicional
	for(Integer n: list) {
	   System.out.print(n);
	}
	System.out.println("");
	
	//Implementação com expressões lambda e StreamAPI       
	list.forEach(n-> System.out.println(n));
}
	
}

//Uma das novidades que surgiram nessa nova versão é a Stream API 
//que está intimamente relacionada com o Collection Framework do Java