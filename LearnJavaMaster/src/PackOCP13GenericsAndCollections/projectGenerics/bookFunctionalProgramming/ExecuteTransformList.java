package PackOCP13GenericsAndCollections.projectGenerics.bookFunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExecuteTransformList {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final List<String> uppercaseNames = new ArrayList<String>();
        for(String name : friends) {
            uppercaseNames.add(name.toUpperCase());
        }
        uppercaseNames.forEach(System.out::println);
        System.out.println();

        final List<String> uppercaseNames2 = new ArrayList<String>();
        friends.forEach(name -> uppercaseNames2.add(name.toUpperCase()));
        uppercaseNames2.forEach(System.out::println);
        System.out.println();

        System.out.println("Maps");
        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));

        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name));
    }
}
