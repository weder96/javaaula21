package PackOCP16ExceptionsAndAssertions.Excption02;

public class Banco {
	public void realizarOperacao() throws SaldoInsuficienteException,
			ValorNegativoException {
		ContaBancaria cb = new ContaBancaria(1000);

		cb.sacar(-100);
	}
}
