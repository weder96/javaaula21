package PackOCP12AdvancedJavaClassDesign.Interface01;

public class Quadrado implements AreaCalculavel {
	private double side;

	public Quadrado(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calcularArea() {
		return side * side;
	}
}
