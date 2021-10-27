package OCA04_Creating_and_Using_Arrays;

import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		int num1=0;
		int num2=0;
		int $=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("digite Num1");
		 num1 = sc.nextInt();
		 System.out.println("digite Num2");
		 num2 = sc.nextInt();
		
		if(num1==num2){
			System.out.println("iguais");
		}else
		if(num1>num2){
			$ = num1-num2;
		} else{
			$ = num2-num1;
		}
		
		System.out.println($);
	}

}
