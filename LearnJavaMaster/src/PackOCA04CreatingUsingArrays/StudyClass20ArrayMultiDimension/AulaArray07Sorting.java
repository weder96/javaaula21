package PackOCA04CreatingUsingArrays.StudyClass20ArrayMultiDimension;

import java.util.Arrays;

public class AulaArray07Sorting {
    public static void main(String[] args) {
        int[] a = {1,3,2};
        Arrays.sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}
