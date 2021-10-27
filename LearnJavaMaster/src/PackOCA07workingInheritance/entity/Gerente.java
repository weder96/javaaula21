package OCA07_Working_with_Inheritance.entity;

public class Gerente extends Funcionario {
	
	public double bonificacao(double salario){
		return (salario*1.20);
	}

	@Override
	public void trabalha() {
		System.out.println("gerente trabalhando");
	}

}
