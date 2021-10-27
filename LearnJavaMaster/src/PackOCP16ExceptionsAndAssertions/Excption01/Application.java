package PackOCP16ExceptionsAndAssertions.Excption01;

public class Application {
	public static void main(String[] args) {
		Banco b = new Banco();

		try {
			b.realizarOperacao();
		} catch (Exception e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
		}
	}
}
