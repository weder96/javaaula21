package PackOCP12AdvancedJavaClassDesign.Interface01;

public class Retangulo implements AreaCalculavel {
	private double width;
	private double height;

	public Retangulo(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calcularArea() {
		return width*height;
	}
}
