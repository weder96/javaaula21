package PackOCP12AdvancedJavaClassDesign.Interface02;

public class ContaInvestimento extends ContaBancaria {
	public double calcularSaldo() {
		return super.amount * 1.05;
	}
}
