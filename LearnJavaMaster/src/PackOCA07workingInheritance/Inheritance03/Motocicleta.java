package PackOCA07workingInheritance.Inheritance03;

public class Motocicleta extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Motocicleta ligada");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("Motocicleta desligada");
	}

}
