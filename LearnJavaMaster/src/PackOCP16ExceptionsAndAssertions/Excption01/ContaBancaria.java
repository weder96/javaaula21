package PackOCP16ExceptionsAndAssertions.Excption01;

public class ContaBancaria {
	private double amount;

	public ContaBancaria(double _amount) {
		this.amount = _amount;
	}

	public void sacar(double _val) throws Exception {
		if (_val < 0)
			throw new Exception("O valor para saque não pode ser negativo!");
		if (this.amount - _val < 0)
			throw new Exception("O saldo é insuficiente!");
		this.amount -= _val;
	}

	public double getAmount() {
		return amount;
	}
}
