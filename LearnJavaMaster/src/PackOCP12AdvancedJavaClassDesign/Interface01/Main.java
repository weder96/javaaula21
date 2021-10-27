package PackOCP12AdvancedJavaClassDesign.Interface01;

public class Main {
	public static void main(String[] args) {
		Circulo c = new Circulo(5.0);
		Quadrado q = new Quadrado(10.0);
		Retangulo r = new Retangulo(5.0, 10.0);
		
		System.out.printf("Área do círculo: %.2f\n", c.calcularArea());
		System.out.printf("Área do quadrado: %.2f\n", q.calcularArea());
		System.out.printf("Área do retângulo: %.2f\n", r.calcularArea());
	}
}
