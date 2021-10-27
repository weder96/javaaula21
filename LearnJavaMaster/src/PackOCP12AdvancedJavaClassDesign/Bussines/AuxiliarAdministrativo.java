package PackOCP12AdvancedJavaClassDesign.Bussines;

public class AuxiliarAdministrativo extends Funcionario {
	public AuxiliarAdministrativo(int matricula, String nome, String cpf) {
		super(matricula, nome, cpf);
	}

	@Override
	public String toString() {
		return "AuxiliarAdministrativo [matricula=" + matricula + ", nome="
				+ nome + ", cpf=" + cpf + "]";
	}
}
