package PackOCA07workingInheritance.Inheritance03;

public class Main {

	public static void main(String[] args) {
		Veiculo carro = new Automovel();
		Veiculo busao = new Onibus();
		Veiculo moto = new Motocicleta();

		carro.ligar();
		System.out.println("O carro está: " + (carro.isLigado() ? "Ligado" : "Desligado"));
		carro.desligar();
		System.out.println("O carro está: " + (carro.isLigado() ? "Ligado" : "Desligado"));

		busao.ligar();
		System.out.println("O ônibus está: " + (busao.isLigado() ? "Ligado" : "Desligado"));
		busao.desligar();
		System.out.println("O ônibus está: " + (busao.isLigado() ? "Ligado" : "Desligado"));

		moto.ligar();
		System.out.println("A moto está: " + (moto.isLigado() ? "Ligada" : "Desligada"));
		moto.desligar();
		System.out.println("A moto está: " + (moto.isLigado() ? "Ligada" : "Desligada"));

	}

}
