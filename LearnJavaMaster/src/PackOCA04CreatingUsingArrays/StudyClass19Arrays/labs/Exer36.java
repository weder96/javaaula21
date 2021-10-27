package PackOCA04CreatingUsingArrays.StudyClass19Arrays.labs;

import java.util.Scanner;

public class Exer36 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double[] vetorA = new double[11];
        
        for (int i=0; i<vetorA.length; i++){
            
            vetorA[i] = Math.pow(2, i);
        }
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
    }    
}
