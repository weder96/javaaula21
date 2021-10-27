package PackOCP16ExceptionsAndAssertions.Excption02;

public class Application {
	public static void main(String[] args) {
		Banco b = new Banco();

		try {
			b.realizarOperacao();
		} catch (SaldoInsuficienteException e1) {
			System.out.println("Você tentou sacar: " + e1.getValue() + ", mas só tem " + e1.getAmount() + " de saldo!");
		} catch (ValorNegativoException e1) {
			System.out.println("Você tentou realizar um saque com valor negativo de " + e1.getValue());
		}
	}
}
