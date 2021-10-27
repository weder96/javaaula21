package OCA04_Creating_and_Using_Arrays;
//5.Crie um programa em Linguagem C para fazer o aumento Salarial de funcionário. 
//Por padrão, o aumento será de 15%. Entretanto, deve ser aplicada uma regra 
//diferente para cada faixa salarial. Regras:
//para 1.500,00 <= salarioAtual < 1.750,00: aumento igual a 12%
//para 1.750,00 <= salarioAtual < 2.000,00: aumento igual a 10%
//para 2.000,00 <= salarioAtual < 3.000,00: aumento igual a 7%
//para acima de 3.000,00: aumento igual a 5%.

public class Exercicio5 {

	public static void main(String[] args) {
	   double salarioatual = 2000;
	   double salarioNovo = 0;
	   
	   if(salarioatual >= 3000){
		   salarioNovo = salarioatual * 1.05; 
	       System.out.println(salarioNovo);
	   }else
	   if(salarioatual >= 2000 && salarioatual < 3000){
		   salarioNovo = salarioatual * 1.07; 
		   System.out.println(salarioNovo);
	   }else
	   if(salarioatual >= 1750 && salarioatual < 2000){
		   salarioNovo = salarioatual * 1.10; 
		   System.out.println(salarioNovo);
	   }else
	   if(salarioatual >= 1500 && salarioatual < 1750){
		   salarioNovo = salarioatual * 1.12; System.out.println(salarioNovo);}
	   else{
		   salarioNovo = salarioatual * 1.15; System.out.println(salarioNovo);
	   }
	}

}
