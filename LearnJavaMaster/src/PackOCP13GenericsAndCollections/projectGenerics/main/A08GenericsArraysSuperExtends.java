package PackOCP13GenericsAndCollections.projectGenerics.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A08GenericsArraysSuperExtends {

	public static void main(String[] args) {
		/*Restrictions on Wildcards
		 Criação de instância Em uma expressão de criação de instância de classe, se o tipo 
		 for um tipo parametrizado, nenhum dos parâmetros de tipo pode ser curinga. 
		 */
		
		//List<?> list = new ArrayList<?>(); // compile-time error 
		//Map<String, ? extends Number> map = new HashMap<String, ? extends Number>(); // compile-time error
		
		List<Number> nums = new ArrayList<Number>(); 
		List<? super Number> sink = nums;
		List<? extends Number> source = nums;
		for (int i=0; i<10; i++) 
			sink.add(i);
		
		double sum=0; 
		for (Number num : source) 
			sum+=num.doubleValue();
		
		System.out.println(sum);
		
		List<List<?>> lists = new ArrayList<List<?>>(); 
		lists.add(Arrays.asList(1,2,3)); 
		lists.add(Arrays.asList("four","five"));
		assert lists.toString().equals("[[1, 2, 3], [four, five]]");
		System.out.println(lists.toString());
		
		/*Mesmo que a lista de listas seja criada em um tipo de caractere curinga, cada lista individual 
		 * dentro dela possui um tipo específico: a primeira é uma lista de inteiros e a segunda é uma lista de strings. 
		 * O tipo curinga nos proíbe de extrair elementos das listas internas como qualquer outro tipo que não Objeto, 
		 * mas como esse é o tipo usado pelo toString, esse código está bem escrito.*/
		
		List<?> list1 = new ArrayList<Object>(); // ok
		//List<?> list2 = new List<Object>(); // compile-time error 
		//List<?> list3 = new ArrayList<?>(); // compile-time error

	}

}

