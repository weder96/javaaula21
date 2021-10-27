package PackOCP12AdvancedJavaClassDesign.Interface02;

public abstract class ContaBancaria {
	protected double amount;

	public void depositar(double amount) {
		this.amount += amount;
	}

	public void sacar(double amount) {
		this.amount -= amount;
	}

	public void tranferir(double amount, ContaBancaria cb) {
		this.sacar(amount);
		cb.depositar(amount);
	}

	public abstract double calcularSaldo();
}
