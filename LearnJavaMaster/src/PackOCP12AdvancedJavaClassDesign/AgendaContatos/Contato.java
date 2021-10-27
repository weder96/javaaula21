package PackOCP12AdvancedJavaClassDesign.AgendaContatos;

public abstract class Contato {

	private String nome;
	private Endereco endereco;
	
	public Contato() {
		this.endereco = new Endereco();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
	
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
