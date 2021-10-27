package PackOCA05UsingLoopsContructs.StudyClassBreak;

/**
 * This program define use break
 * @version 0.01 2021-03-17
 * @author Weder Sousa
 */
import java.util.Scanner;
public class BreakControl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        read_data:
        while (true) { // this loop statement is tagged with the label
            for (int i = 0; i<10; i++) {// this inner loop is not labeled
                System.out.print("Enter a number >= 0: ");
                n = in.nextInt();
                if (n < 0) // should never happen—can't go on
                    break read_data; // break out of read_data loop
            }
        }
        // this statement is executed immediately after the labeled break
        if (n >= 0) { // check for bad situation
            System.out.println("n greater than zero");// deal with bad situation
        } else {
            System.out.println("n less than zero"); // carry out normal processing
        }
    }
}