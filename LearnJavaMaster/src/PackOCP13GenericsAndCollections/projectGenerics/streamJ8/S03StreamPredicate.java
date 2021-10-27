package PackOCP13GenericsAndCollections.projectGenerics.streamJ8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class S03StreamPredicate {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A1","B2","A3");
        List<String> list2 = Arrays.asList("B1","A2","B3");
        Stream<String> resStream = Stream.concat(list1.stream(), list2.stream());
        resStream.sorted().forEach(s->System.out.println(s));
        
        List<String> list = Arrays.asList("AA","AB","CC");
        Predicate<String> predicate = s-> s.startsWith("A");
        long l= list.stream().filter(predicate).count();
        System.out.println("Number of Matching Element:"+l);
        
        List<String> list3 = Arrays.asList("DC","CD","AD");
        list3.stream().sorted().forEach(s->System.out.println(s));
        
        List<String> list4 = Arrays.asList("AA","AA","BB","BB");
        long leng = list4.stream().distinct().count();
        System.out.println("Number of distinct element:"+leng);
        
	}

}
//http://www.concretepage.com/java/jdk-8/