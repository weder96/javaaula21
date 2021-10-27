package PackOCP16ExceptionsAndAssertions.Excption02;

public class SaldoInsuficienteException extends Exception {
	private double value;
	private double amount;

	public SaldoInsuficienteException(double value, double amount) {
		this.value = value;
		this.amount = amount;
	}

	public double getValue() {
		return value;
	}

	public double getAmount() {
		return amount;
	}
}
