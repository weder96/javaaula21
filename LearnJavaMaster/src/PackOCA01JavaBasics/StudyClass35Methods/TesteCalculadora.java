package PackOCA01JavaBasics.StudyClass35Methods;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);

		int fatorialR = Calculadora.fatorial(5);
		System.out.println(fatorialR);
	}

}
