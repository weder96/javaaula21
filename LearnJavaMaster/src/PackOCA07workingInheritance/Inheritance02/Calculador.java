package PackOCA07workingInheritance.Inheritance02;

import java.util.ArrayList;

public class Calculador {

	public static void main(String[] args) {
		ArrayList<Figura> f = new ArrayList<Figura>();
		
		f.add(new Quadrado(3.0));
		f.add(new Quadrado(10.0));
		f.add(new Retangulo(2.0, 7.0));
		f.add(new Retangulo(5.0, 3.0));
		
		FiguraComplexa fc = new FiguraComplexa(f);
		
		System.out.println("Área total = " + fc.calcularArea());
	}

}
