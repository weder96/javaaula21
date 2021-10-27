package PackOCA07workingInheritance.Inheritance03;

public class Veiculo {
	private boolean ligado;
	
	public boolean isLigado() {
		return this.ligado;
	}

	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
}
