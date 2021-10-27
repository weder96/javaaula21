package PackOCP13GenericsAndCollections.CollectionMap;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.Map.*;

public class SmallCollections {
    public static void main(String[] args) {
        List<String> names = List.of("Peter", "Paul", "Mary");
        Set<Integer> numbers = Set.of(2, 3, 5);
        numbers.stream().forEach(System.out::println);

        Map<String, Integer> scores = Map.of("Peter", 2, "Paul", 3, "Mary", 5);
        scores.forEach((k, v) -> System.out.println(k +" - "+ v.intValue()));

        Map<String, Integer> scores2 = ofEntries(
                entry("Peter", 2),
                entry("Paul", 3),
                entry("Mary", 5));

        scores2.forEach((k, v) -> System.out.println(k +" - "+ v.intValue()));
        List<String> settings = Collections.nCopies(100, "Java 11");
        settings.forEach(System.out::println);

        List<String> group2 = settings.subList(10, 20);
        group2.forEach(group -> System.out.println("gr :"+group));
    }
}
