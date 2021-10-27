package PackOCA01JavaBasics.JavaDocumentation;

/**
 * Classe que represente um contato
 * 
 * @author weder.sousa
 * @version 0.1
 */
public class Contato {
	/**
	 * Nome do contato
	 */
	private String nome;

	/**
	 * Email do contato
	 */
	private String email;

	/**
	 * Endereço do contato
	 * */
	private Endereco endereco = new Endereco();

	/**
	 * Construtor da classe Contato
	 * 
	 * @param nome Nome do Contato
	 * @param email  Email do Contato
	 *
	 */
	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	/**
	 * Define endereço do Contato
	 * 
	 * @param rua
	 *            Rua do Contato
	 * @param numero
	 *            Número do Endereço do Contato
	 */
	public void definirEndereco(String rua, int numero) {
		this.endereco.setRua(rua);
		this.endereco.setNumero(numero);
	}

	/**
	 * Retorna o nome do Contato
	 * 
	 * @return Nome do contato
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Retorna o email do Contato
	 * 
	 * @return Email do contato
	 */
	public String getEmail() {
		return email;
	}
}
