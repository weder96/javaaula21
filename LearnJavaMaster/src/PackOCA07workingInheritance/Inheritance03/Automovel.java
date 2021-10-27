package PackOCA07workingInheritance.Inheritance03;

public class Automovel extends Veiculo {

	@Override
	public void ligar() {
		super.ligar();
		System.out.println("Automóvel ligado");
	}

	@Override
	public void desligar() {
		super.desligar();
		System.out.println("Automóvel desligado");
	}
	
}
