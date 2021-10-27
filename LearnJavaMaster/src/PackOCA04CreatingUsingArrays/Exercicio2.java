package OCA04_Creating_and_Using_Arrays;

import java.util.Scanner;

//09) Faça um programa que receba o valor do salário mínimo e o valor do salário 
//de um funcionário, calcule e mostre a quantidade de salários mínimos que 
//ganha esse funcionário

public class Exercicio2 {

	public static void main(String[] args) {
		 double salarioMinimo = 0.0;
		 double salarioFunc = 0.0;  
		 double qtdSalarioMin = 0.0;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("digite valor Salario Minimo");
		 salarioMinimo = sc.nextDouble();
		 System.out.println("digite valor  Salario Funcionario");
		 salarioFunc = sc.nextDouble();
		 
		 qtdSalarioMin = salarioFunc / salarioMinimo;
		 
		 System.out.println("a qtd salarios e"+qtdSalarioMin);
		 System.out.printf("a qtd salarios e %.2f \n",qtdSalarioMin);
	}

}
