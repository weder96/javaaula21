package PackOCP12AdvancedJavaClassDesign.InterfaceStudy;

public class Ferrari implements Car, ExpensiveItem {
	@Override
	public void turnRight() {
		System.out.println("Ferrari turning on right...");
	}

	@Override
	public void turnLeft() {
		System.out.println("Ferrari turning on left...");
	}

	@Override
	public void accelerate() {
		System.out.println("Ferrari turning on accelerating...");
	}

	@Override
	public void openDoor() {
		System.out.println("Ferrari opening doors...");
	}

	@Override
	public double getPrice() {
		return 1000000.00;
	}
}
