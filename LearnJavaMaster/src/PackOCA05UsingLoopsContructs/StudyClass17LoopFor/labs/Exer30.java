package PackOCA05UsingLoopsContructs.StudyClass17LoopFor.labs;

import java.util.Scanner;

public class Exer30 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o número para gerar a tabuada:");
        int num = scan.nextInt();
        
        boolean invalido = true;
        int numFinal, numInicio;
        
        do {
            
            System.out.println("Entre com o início da tabuada");
            numInicio = scan.nextInt();

            System.out.println("Entre como final da tabuada");
            numFinal = scan.nextInt();

            if (numFinal > numInicio){
                invalido = false;
            }
            
        } while (invalido);
        
        
        System.out.println("Tabuada de " + num + ":");
        System.out.println("Começar por: " + numInicio);
        System.out.println("Terminar em: " + numFinal);
        System.out.println();
        
        for (int i=numInicio; i<=numFinal; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
