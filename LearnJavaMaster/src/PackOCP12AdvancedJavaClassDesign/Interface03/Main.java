package PackOCP12AdvancedJavaClassDesign.Interface03;

public class Main {
	public static void main(String[] args) throws Exception {
		Porta p1 = new Porta(10.0, 20.0);
		p1.open();

		Porta p2 = (Porta) p1.clone();

		System.out.println("p1 data:");
		System.out.println("> Width: " + p1.getWidth());
		System.out.println("> Height: " + p1.getHeight());
		System.out.println("> Is opened? "
				+ (p1.isOpened() ? "opened" : "closed"));

		System.out.println("p2 data:");
		System.out.println("> Width: " + p2.getWidth());
		System.out.println("> Height: " + p2.getHeight());
		System.out.println("> Is opened? "
				+ (p2.isOpened() ? "opened" : "closed"));
	}
}
