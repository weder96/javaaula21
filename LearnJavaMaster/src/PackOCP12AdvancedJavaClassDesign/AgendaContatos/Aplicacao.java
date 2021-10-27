package PackOCP12AdvancedJavaClassDesign.AgendaContatos;

public class Aplicacao {
	public static void main(String[] args) {
		ContatoPF c1 = new ContatoPF();

		c1.setNome("José");
		c1.setCpf("000.123.345-89");

		c1.getEndereco().setRua("R. Xavier");
		c1.getEndereco().setNumero("100");
		c1.getEndereco().setCidade("Natal");
		c1.getEndereco().setEstado("RN");

		Agenda a = new Agenda();
		a.setContato1(c1);

		imprimirNomes(a);
		// imprimirCnpj(a);
	}

	private static void imprimirNomes(Agenda a) {
		if (a.getContato1() != null)
			System.out.println(a.getContato1().getNome());
		if (a.getContato2() != null)
			System.out.println(a.getContato2().getNome());
		if (a.getContato2() != null)
			System.out.println(a.getContato3().getNome());
	}

	private static void imprimirCnpj(Agenda a) {
		ContatoPJ c = (ContatoPJ) a.getContato1();
		if (c != null)
			System.out.println(c.getCnpj());

		c = (ContatoPJ) a.getContato1();
		if (c != null)
			System.out.println(c.getCnpj());

		c = (ContatoPJ) a.getContato1();
		if (c != null)
			System.out.println(c.getCnpj());
	}
}
