package PackOCP12AdvancedJavaClassDesign.InterfaceStudy;

public class Route {
	public void go(Automobile a) {
		a.accelerate();
		a.turnRight();
		a.turnLeft();
	}
}
