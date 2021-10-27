package PackOCP13GenericsAndCollections.projectGenerics.bookFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExecuteList {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        for(int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
        System.out.println();

        for(String name : friends) {
            System.out.println(name);
        }
        System.out.println();

        friends.forEach(new Consumer<String>() {
            public void accept(final String name) {
                System.out.println(name);
            }
        });
        System.out.println();

        friends.forEach((final String name) -> System.out.println(name));
        System.out.println();

        friends.forEach((name) -> System.out.println(name));
        System.out.println();

        friends.forEach(name -> System.out.println(name));
        System.out.println();

        friends.forEach(System.out::println);
        System.out.println();
    }
}
