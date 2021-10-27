package OCA04_Creating_and_Using_Arrays;
/*
    ****1
    ***22
    **333
    *4444
    55555
*/

public class Exercicio9 {
	
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j<=5){	
				 System.out.printf("*");
				}else{
				 System.out.printf("%d",i);	
				}
			}
			System.out.println("");	
		}
	}//fim do main

}//fimda classe
