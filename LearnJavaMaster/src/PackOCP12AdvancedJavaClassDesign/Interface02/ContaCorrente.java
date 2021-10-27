package PackOCP12AdvancedJavaClassDesign.Interface02;

public class ContaCorrente extends ContaBancaria {
	public double calcularSaldo() {
		return super.amount * 0.9;
	}
}
