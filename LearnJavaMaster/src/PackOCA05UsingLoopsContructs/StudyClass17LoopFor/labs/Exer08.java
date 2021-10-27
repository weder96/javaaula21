package PackOCA05UsingLoopsContructs.StudyClass17LoopFor.labs;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num;
        double media;
        int soma = 0;
        
        for (int i=0; i<5; i++){
            
            System.out.println("Digite um número");
            num = scan.nextInt();
            
            soma += num;
        }
        
        media = soma / 5;
        
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
