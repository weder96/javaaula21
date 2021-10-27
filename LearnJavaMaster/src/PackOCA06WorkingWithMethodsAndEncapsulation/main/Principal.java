package OCA06_Working_with_Methods_and_Encapsulation.main;
import java.util.Scanner;

import OCA06_Working_with_Methods_and_Encapsulation.entity.Cliente;
import OCA06_Working_with_Methods_and_Encapsulation.entity.Conta;


public class Principal {

	public static void main(String[] args) {
	Conta conta1 = new Conta();
	Scanner sc = new Scanner(System.in);
	conta1.getCliente().setNome(sc.next());
	System.out.println(conta1.getCliente().getNome());
	
	Cliente cli1 = new Cliente();
	cli1.setNome("weder");
	
	Conta conta2 = new Conta(cli1,123);
	System.out.println(conta2.getCliente().getNome());
	}

}
