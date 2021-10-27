package PackOCP16ExceptionsAndAssertions.Excption02;

public class ContaBancaria {
	private double amount;

	public ContaBancaria(double _amount) {
		this.amount = _amount;
	}

	public void sacar(double _val) throws ValorNegativoException,
			SaldoInsuficienteException {
		if (_val < 0)
			throw new ValorNegativoException(_val);
		if (this.amount - _val < 0)
			throw new SaldoInsuficienteException(this.amount, _val);
		this.amount -= _val;
	}

	public double getAmount() {
		return amount;
	}
}
