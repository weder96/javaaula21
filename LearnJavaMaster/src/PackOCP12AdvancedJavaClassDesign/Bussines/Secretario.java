package PackOCP12AdvancedJavaClassDesign.Bussines;

public class Secretario extends Funcionario {
	public Secretario(int matricula, String nome, String cpf) {
		super(matricula, nome, cpf);
	}

	@Override
	public String toString() {
		return "Secretario [matricula=" + matricula + ", nome=" + nome
				+ ", cpf=" + cpf + "]";
	}
}
