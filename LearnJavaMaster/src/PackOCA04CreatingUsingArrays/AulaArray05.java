package PackOCA04CreatingUsingArrays;

import java.util.Arrays;
public class AulaArray05 {
    public static void main(String[] args) {
        int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };
        for(int small: smallPrimes)
            System.out.println(small);

        System.out.println();
        Arrays.stream(smallPrimes).forEach(System.out::println);

        String[] authors = {"James Gosling", "Bill Joy", "Guy Steele"};
        int[] anonymous ;
        // You can declare an anonymous array:
        anonymous = new int[] { 17, 19, 23, 29, 31, 37 };
        Arrays.stream(anonymous).forEach(System.out::println);

        int[] a = new int[100];
        for (int i = 0; i < a.length; i++)
            a[i] = i; // fills the array with numbers 0 to 99

        Arrays.stream(a).forEach(System.out::println);

        String[] names = new String[10];
        // creates an array of ten strings, all of which are null. If you want the array to
        // hold empty strings, you must supply them:
        for (int i = 0; i < 10; i++) names[i] = "";
    }
}
