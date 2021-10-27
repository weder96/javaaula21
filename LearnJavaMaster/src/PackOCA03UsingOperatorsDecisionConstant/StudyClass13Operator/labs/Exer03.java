package PackOCA03UsingOperatorsDecisionConstant.StudyClass13Operator.labs;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número:");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com o segundo número:");
        int num2 = scan.nextInt();
        
        int resultado = num1 + num2;
        System.out.println("A soma dos números é: " + resultado);
    }
}
