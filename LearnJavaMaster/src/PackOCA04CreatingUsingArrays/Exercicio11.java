package OCA04_Creating_and_Using_Arrays;

import java.util.Scanner;

//11. Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três
//(imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,
//deveremos observar na tela a seguinte sequência: 5 15 45 135 (utiliza For).

public class Exercicio11 {
	public static void main(String[] args){
		int num=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("digite num");
        num = sc.nextInt();
        

		for(int i=0;;i++){
			if(i==0)
			System.out.println(num);
			
			num =(num*3);
			System.out.println(num);
			if(num>100)
				break;
			
		}
		
	}
}
