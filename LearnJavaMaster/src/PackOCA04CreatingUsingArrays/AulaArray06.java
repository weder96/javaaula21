package PackOCA04CreatingUsingArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AulaArray06 {
    public static void main(String[] args) {
        int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };
        int[] luckyNumbers = smallPrimes;
        luckyNumbers[5] = 12; // now smallPrimes[5] is also 12
        int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        Arrays.stream(copiedLuckyNumbers).forEach(System.out::println);

        System.out.println();
        luckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
        Arrays.stream(luckyNumbers).forEach(System.out::println);
    }
}
