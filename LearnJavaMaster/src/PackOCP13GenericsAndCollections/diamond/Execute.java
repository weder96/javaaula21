package PackOCP13GenericsAndCollections.diamond;

public class Execute {

    public static void main(String[] args) {
        Pair<Integer>  pair = new Pair<>(20, 30);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        PairTwo<Integer, String>  pairTwo = new PairTwo<>(50, "Teste");
        System.out.println(pairTwo.getFirst());
        System.out.println(pairTwo.getSecond());

        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        String middle = ArrayAlg.<String>getMiddle("John", "Q.", "Public");
        System.out.println("middle = " + middle);
    }

}
