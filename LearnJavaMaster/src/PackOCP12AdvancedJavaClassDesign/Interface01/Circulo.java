package PackOCP12AdvancedJavaClassDesign.Interface01;

public class Circulo implements AreaCalculavel {
	private double radius;

	public Circulo(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
