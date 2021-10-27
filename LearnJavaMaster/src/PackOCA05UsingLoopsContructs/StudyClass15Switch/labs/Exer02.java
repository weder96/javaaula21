package PackOCA05UsingLoopsContructs.StudyClass15Switch.labs;

import java.util.Scanner;

public class Exer02 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número:");
        int num = scan.nextInt();
        
        if (num >= 0){
            System.out.println("O número informado é positivo");
        } else {
            System.out.println("O número informado é negativo");
        }
    }
}
