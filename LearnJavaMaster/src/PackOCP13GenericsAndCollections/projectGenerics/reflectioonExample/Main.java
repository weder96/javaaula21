package PackOCP13GenericsAndCollections.projectGenerics.reflectioonExample;

import java.util.ArrayList;
import java.util.List;

public class Main {
	

	public static void main(String[] args) {
		Class<Integer> ki = Integer.class; 
		Number n = new Integer(42); 
		Class<? extends Number> kn = n.getClass(); 
		
		assert ki == kn;
		
		
		Class ki2 = Integer.class; 
		Number n2 = new Integer(42); 
		Class kn2 = n2.getClass(); 
		
		assert ki2 == kn2;
		
		
		List<Integer> ints = new ArrayList<Integer>();
		List<String> strs = new ArrayList<String>(); 
		assert ints.getClass() == strs.getClass(); 
		assert ints.getClass() == ArrayList.class;
		
		
		
		List<Integer> ints2 = new ArrayList<Integer>(); 
		Class<? extends List> k = ints2.getClass(); 
		assert k == ArrayList.class;
		
		//public Class<?> k = List<Integer>.class; 
		// syntax error 


	}

}

/*
A reflexão é o termo para um conjunto de recursos que permite que um programa examine sua própria definição. 
Reflexão em Java desempenha um papel em navegadores de classe, inspetores de objetos, depuradores, intérpretes, serviços como JavaBeansTM e
serialização de objetos, e qualquer ferramenta que crie, inspeciona ou manipule objetos Java arbitrários sobre a marcha.
A reflexão tem estado presente em Java desde o início, mas o advento dos genéricos altera a reflexão de duas maneiras importantes, 
introduzindo genéricos para reflexão e reflexão para genéricos.

class Class<T> {
    public T newInstance();
	public T cast(Object o);
	public Class<? super T> getSuperclass();
	public <U> Class<? extends U> asSubclass(Class<U> k);
	public <A extends Annotation> A getAnnotation(Class<A> k);
	public boolean isAnnotationPresent(Class<? extends Annotation> k);
	}
 **/

