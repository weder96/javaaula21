/* Challenge Activity 1 - Area of a triangle
 * 
 * The area of a triangle is (base * height) /2
 * 
 * Write a program to accept the base and height as integer values,
 * then calculate the area of the triangle, as a double..
 * 
 * Use either an explicit or implicit cast to obtain an accurate answer.
 * Remember to format the area output to 1 decimal place.
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter triangle base : 5
 *   Enter triangle height : 3
 *   Triangle area : 7.5
 */

package PackOCA03UsingOperatorsDecisionConstant;

import java.util.Scanner;

public class AreaOfATriangle {

    public static void main(String[] args) {
        int base, height;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter triangle base : ");
        base = input.nextInt();
        System.out.print("Enter triangle height : ");
        height = input.nextInt();
        area = (base * (double) height) / 2;
        System.out.printf("Triangle area : %.1f\n", area);
    }
}
