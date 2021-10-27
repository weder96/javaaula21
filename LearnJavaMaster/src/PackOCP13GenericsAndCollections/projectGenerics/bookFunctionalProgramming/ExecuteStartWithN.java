package PackOCP13GenericsAndCollections.projectGenerics.bookFunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExecuteStartWithN {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final List<String> startsWithN = new ArrayList<String>();
        for(String name : friends) {
            if(name.startsWith("N")) {
                startsWithN.add(name);
            }
        }

        startsWithN.forEach(System.out::println);
        System.out.println();

        final List<String> startsWithNStream = friends.stream()
                        .filter(name -> name.startsWith("N"))
                        .collect(Collectors.toList());

        startsWithNStream.forEach(System.out::println);
        System.out.println(String.format("Found %d names", startsWithNStream.size()));



    }
}
