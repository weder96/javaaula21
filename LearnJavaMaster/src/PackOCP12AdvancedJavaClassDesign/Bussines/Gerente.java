package PackOCP12AdvancedJavaClassDesign.Bussines;

public class Gerente extends Funcionario {
	private String setor;
	private int senha;

	public Gerente(int matricula, String nome, String cpf) {
		super(matricula, nome, cpf);
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
		return "Gerente [setor=" + setor + ", senha=" + senha + ", matricula="
				+ matricula + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
}
