package PackOCP13GenericsAndCollections.iterators;

import java.util.*;

public class TestIterators {
    public static void main(String[] args) {
        // anonymous subclass                               // anonymous initializer
        Collection<Integer> c2 = new ArrayList<Integer>() {{ add(1); add(2); add(3); }};
        Collection<String> c3 = TestIterators.loadListL("1", "2", "3");

        Iterator<String> iter = c3.iterator();
        while (iter.hasNext())
        {
            String element = iter.next();
            System.out.println(element);
        }

        Collection<String> c = Arrays.asList("city", "state", "country", "continent");
        Iterator<String> iter1 = c.iterator();
        iter1.forEachRemaining(System.out::println);
    }

    @SafeVarargs
    public static <T> List<T> loadListL(T ... values) {
        return new ArrayList<T>(Arrays.asList(values));
    }
}
