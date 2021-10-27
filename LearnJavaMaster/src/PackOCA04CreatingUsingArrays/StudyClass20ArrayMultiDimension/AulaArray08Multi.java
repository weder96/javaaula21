package PackOCA04CreatingUsingArrays.StudyClass20ArrayMultiDimension;

import java.util.Arrays;

public class AulaArray08Multi {
    public static void main(String[] args) {
        int[][] magicSquare =
                {
                        {16, 3, 2, 13},
                        {5, 10, 11, 8},
                        {9, 6, 7, 12},
                        {4, 15, 14, 1}
                };

        for (int i = 0; i < magicSquare.length; i++) {
            System.out.println();
            for (int j = 0; j < magicSquare[i].length; j++)
                System.out.printf(" " + magicSquare[i][j]);
        }
        System.out.println();
        Arrays.stream(magicSquare).forEach(line -> Arrays.stream(line).forEach(item -> System.out.printf(" "+item)));

        for (int[] row : magicSquare) {
            System.out.println();
            for (int value : row)
                System.out.printf(" " + value);
        }
    }
}
