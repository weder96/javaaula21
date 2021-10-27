package PackOCP16ExceptionsAndAssertions.Excption01;

public class Banco {
	public void realizarOperacao() throws Exception {
		ContaBancaria cb = new ContaBancaria(1000);

		cb.sacar(-100);
	}
}
