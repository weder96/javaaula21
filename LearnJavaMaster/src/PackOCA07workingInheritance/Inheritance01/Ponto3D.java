package PackOCA07workingInheritance.Inheritance01;

public class Ponto3D extends Ponto2D {
	protected double c_z;
	
	public Ponto3D(double c_x, double c_y, double c_z) {
		super(c_x, c_y);
		this.c_z = c_z;
	}

	@Override
	public String toString() {
		return super.toString() + ", z = " + c_z;
	}
}
