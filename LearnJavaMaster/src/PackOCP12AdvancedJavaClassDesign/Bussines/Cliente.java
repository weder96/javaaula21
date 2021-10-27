package PackOCP12AdvancedJavaClassDesign.Bussines;

public class Cliente extends UsuarioAutenticavel {
	private String nome;
	private int senha;

	public Cliente(String nome, int senha) {
		super();
		this.nome = nome;
		this.senha = senha;
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

	@Override
	public boolean autentica(int senha) {
		return (senha == this.getSenha());
	}
}
