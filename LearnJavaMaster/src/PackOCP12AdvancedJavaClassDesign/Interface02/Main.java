package PackOCP12AdvancedJavaClassDesign.Interface02;

public class Main {
	public static void main(String[] args) {
		ContaBancaria cc = new ContaCorrente();
		ContaBancaria ci = new ContaInvestimento();

		// Deposito
		cc.depositar(200.00);
		ci.depositar(200.00);
		// cc must to have 200.00
		// ci must to have 200.00

		// Saque
		cc.sacar(50.00);
		ci.sacar(50.00);
		// cc must to have 150.00
		// ci must to have 150.00

		// Tranferencia
		cc.tranferir(10.00, ci);
		ci.tranferir(20.00, cc);
		// cc must to have 160.00
		// ci must to have 140.00

		System.out.println("Saldo conta corrente: " + cc.calcularSaldo());
		System.out.println("Saldo conta investimento: " + ci.calcularSaldo());
		// cc must to print 160.00 * 90% = 144.00
		// ci must to print 140.00 * 105% = 147.00
	}
}
