package PackOCP13GenericsAndCollections.projectGenerics.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A03ArrayListGenerics {

	public static void main(String[] args) {
		A03ArrayListGenerics.useGenericsDirect();
	}
	
	
	public static void numberString(){
		List<Number> nums = new ArrayList<Number>(); 
		nums.add(2);
		nums.add(3.14);
		System.out.println(nums.toString());
		assert nums.toString().equals("[2, 3.14]");
	}
	
	public static void IntegerAddNumber(){
		List<Integer> ints = new ArrayList<Integer>(); 
		ints.add(1);
		ints.add(2);
		
		//List<Number> nums = ints; // compile-time error nums.add(3.14);
		assert ints.toString().equals("[1, 2, 3.14]"); 
		/*Isso não deve ser permitido! O problema é evitado observando que aqui 
		 * o Princípio de Substituição não se aplica:
		 *  a atribuição na quarta linha não é permitida porque 
		 *  List <Integer> não é um subtipo de List <Number>, 
		 *  e o compilador informa que a quarta linha está em erro .*/	
	}
	
	public static void numberAddInteger(){
		List<Number> nums = new ArrayList<Number>(); 
		nums.add(2.78);
		nums.add(3.14);
		//List<Integer> ints = nums; // compile-time error
		//assert ints.toString().equals("[2.78, 3.14]"); 
		/*
		 O problema é observando que aqui o Princípio de Substituição não se aplica: 
		 a atribuição na quarta linha não é permitida porque 
		 List <Number> não é um subtipo de List <Integer>, 
		 e o compilador informa que a quarta linha está em erro .
		 * */
	}
	
	public static void numberAddSolutions(){
	List<Number> nums = new ArrayList<Number>(); 
	
	List<Integer> ints = Arrays.asList(1, 2); 
	List<Double> dbls = Arrays.asList(2.78, 3.14); 
	
	nums.addAll(ints);
	nums.addAll(dbls);
	
	assert nums.toString().equals("[1, 2, 2.78, 3.14]");
	System.out.println(nums.toString());
	}
	
	
	public static void useGenericsDirect(){
	List<Integer> ints = new ArrayList<Integer>(); 
	ints.add(1);
	ints.add(2);
	List<? extends Number> nums = ints; 
	//nums.add(3.14); // compile-time error
	assert ints.toString().equals("[1, 2, 3.14]"); // uh oh!
	}

}


/*
Integer         is a subtype of  Number
Double			is a subtype of  Number
ArrayList<E> 	is a subtype of  List<E>
List<E> 		is a subtype of  Collection<E>
Collection<E> 	is a subtype of  Iterable<E>
 */


/*Existem 3 tipos de Wildcards em Generics:

    List<?>, mas conhecido como Unknown Wildcard, ou seja, Wildcard desconhecido.
    List<? extends A>
    List<? super A>
*/
