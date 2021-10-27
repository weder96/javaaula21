package PackOCA07workingInheritance.Inheritance02;

public class Retangulo extends Figura {
	private double height;
	private double width;

	public Retangulo(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public double calcularArea() {
		return this.height * this.width;
	}
}
