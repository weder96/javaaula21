package PackOCP12AdvancedJavaClassDesign.Bussines;

public class Fornecedor extends UsuarioAutenticavel {
	private String nome;
	private int senha;
	private String cidade;

	public Fornecedor(String nome, int senha, String cidade) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.cidade = cidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public boolean autentica(int senha) {
		return (senha == this.getSenha() && getCidade().toLowerCase().equals(
				"natal"));
	}
}
