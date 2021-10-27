package PackOCA07workingInheritance.Inheritance02;

import java.util.ArrayList;

public class FiguraComplexa extends Figura {
	private ArrayList<Figura> figuras;

	public FiguraComplexa(ArrayList<Figura> figuras) {
		this.figuras = figuras;
	}

	@Override
	public double calcularArea() {
		double sum_area = 0;

		for (Figura f : this.figuras) {
			sum_area += f.calcularArea();
		}

		return sum_area;
	}
}
