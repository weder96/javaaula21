package PackOCP12AdvancedJavaClassDesign.Bussines;

public class Diretor extends Funcionario {
	private String setor;
	private int senha;

	public Diretor(int matricula, String nome, String cpf, String setor,
			int senha) {
		super(matricula, nome, cpf);
		this.setor = setor;
		this.senha = senha;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Diretor [setor=" + setor + ", senha=" + senha + ", matricula="
				+ matricula + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
}
