package PackOCP12AdvancedJavaClassDesign.InterfaceStudy;

public class Application {
	public static void main(String[] args) {
		Ferrari f = new Ferrari();
		Route route = new Route();
		ShiningRing sr = new ShiningRing();

		Salesman sm = new Salesman();
		sm.showPrice(f);
		sm.showPrice(sr);

		// route.go(f);
	}
}
