package PackOCA01JavaBasics.StudyClass46Interface;

public interface BancoDados extends SqlDCL, SqlDML, SqlDDL {

	void abrirConexao();
	void fecharConexao();
}
