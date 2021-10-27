package OCA04_Creating_and_Using_Arrays;

import java.util.Scanner;


//Faça um algoritmo para calcular quantas ferraduras são necessárias para 
//equipar todos os cavalos comprados para um haras
public class Exercicio1 {

	public static void main(String[] args) {
		int ferradura = 4;
        int cavalo = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("digite GO Horse");
        cavalo = sc.nextInt();
        String nomeCavalo = sc.next();
       System.out.println(ferradura*cavalo);
       System.out.println(nomeCavalo);    
   
	}

}
