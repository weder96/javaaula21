package PackOCP13GenericsAndCollections.projectGenerics.bookFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExecuteReutilesStream {

    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
        final List<String> comrades =
                Arrays.asList("Kate", "Ken", "Nick", "Paula", "Zach");
        final List<String> editors =
                Arrays.asList("Brian", "Jackie", "John", "Mike");

        final long countFriendsStartN =
                friends.stream().filter(name -> name.startsWith("N")).count();
        final long countComradesStartN =
                comrades.stream().filter(name -> name.startsWith("N")).count();
        final long countEditorsStartN =
                editors.stream().filter(name -> name.startsWith("N")).count();

        final Predicate<String> startsWithN = name -> name.startsWith("N");
        final long countFriendsStartN2 =  friends.stream().filter(startsWithN).count();
        final long countComradesStartN2 = comrades.stream().filter(startsWithN).count();
        final long countEditorsStartN2 =  editors.stream().filter(startsWithN).count();


        final Predicate<String> startsWithN2 = name -> name.startsWith("N");
        final Predicate<String> startsWithB2 = name -> name.startsWith("B");
        final long countFriendsStartN4 = friends.stream().filter(startsWithN2).count();
        final long countFriendsStartB =  friends.stream().filter(startsWithB2).count();


        final long countFriendsStartNFun =  friends.stream().filter(checkIfStartsWith("N")).count();
        final long countFriendsStartBFun = friends.stream().filter(checkIfStartsWith("B")).count();


        final Function<String, Predicate<String>> startsWithLetter =
                (String letter) -> (String name) -> name.startsWith(letter);

        final long countFriendsStartN5 = friends.stream().filter(startsWithLetter.apply("N")).count();
        System.out.println(String.format("Found %d names", countFriendsStartN5));
    }


    public static Predicate<String> checkIfStartsWith(final String letter) {
        return name -> name.startsWith(letter);
    }
}
