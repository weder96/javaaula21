package PackOCA08HandlingExceptions.StudyClass48Exception;

public class MultiplosCatchJava7 {

	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};

		for (int i=0; i<numeros.length; i++){
			try{
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i]/demon[i]));
			}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException  e){
				System.out.println("Aconteceu um erro");
			}
		}

	}
}
