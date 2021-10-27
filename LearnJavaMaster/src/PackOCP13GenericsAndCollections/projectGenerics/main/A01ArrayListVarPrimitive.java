package PackOCP13GenericsAndCollections.projectGenerics.main;

import java.util.ArrayList;
import java.util.List;

public class A01ArrayListVarPrimitive {
	Character d='w';
	char dea='d';
	
	public static void main(String[] args) {
		//Uma interface ou classe pode ser declarada para tomar um ou mais parâmetros 
		//de tipo, que estão escritos
		//Em colchetes angulares e deve ser fornecido quando você declara uma variável 
		//pertencente à interface ou classe
		//Ou quando você cria uma nova instância de uma classe.
			
		List<String> words = new ArrayList<String>(); 
		words.add("Hello ");
		words.add("world!");
		String s = words.get(0)+words.get(1);
		System.out.println(s);
		assert s.equals("Hello world!");

	}

}
/*
 *  
Primitive       References
byte 			Byte
short 			Short
int 			Integer
long 			Long
float 			Float
double 			Double
boolean 		Boolean
char 			Character
*/
