package PackOCP12AdvancedJavaClassDesign.AbstractStudy01;

public class Application {
	public static void main(String[] args) {
		Item d = new Diamond();
		d.catch_me();
		
		Item m = new Mushroom();
		m.catch_me();
	}
}
