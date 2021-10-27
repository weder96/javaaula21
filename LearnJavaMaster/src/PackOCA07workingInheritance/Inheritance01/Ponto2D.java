package PackOCA07workingInheritance.Inheritance01;

public class Ponto2D {
	protected double c_x;
	protected double c_y;

	public Ponto2D(double c_x, double c_y) {
		super();
		this.c_x = c_x;
		this.c_y = c_y;
	}

	@Override
	public String toString() {
		return "x = " + c_x + ", y = " + c_y;
	}
}
