package PackOCA07workingInheritance.Inheritance02;

public class Quadrado extends Figura {
	private double side;
	
	public Quadrado(double side) {
		super();
		this.side = side;
	}

	@Override
	public double calcularArea() {
		return this.side * this.side;
	}
}
