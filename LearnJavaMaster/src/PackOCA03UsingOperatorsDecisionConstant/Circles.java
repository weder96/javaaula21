/*
 * DEBUG THIS! Exercise - Circles!
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will calculate the Area and Circumfrence of a circle 
 * using user-defined functions 
 
 *
 * Examples:    Enter Circle Radius : 1.0
 *              Circumference : 6.283185; Area : 3.141593
 * 
 */

package PackOCA03UsingOperatorsDecisionConstant;

import java.util.Scanner;

public class Circles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Circle Radius : ");
        double radius = input.nextDouble();
        double circ = circleCircumference(radius);
        double area = circleArea(radius);
        System.out.printf("Circumference : %f; Area : %f\n",circ, area);                
    }
    
    public static double circleCircumference(double radius) {
        return 2*Math.PI*radius;
    }
    
    public static double circleArea(double radius) {
        return Math.PI*radius*radius;  
    }
}
