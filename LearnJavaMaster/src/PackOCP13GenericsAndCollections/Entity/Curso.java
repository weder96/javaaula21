package PackOCP13GenericsAndCollections.Entity;

import java.util.Date;

public class Curso {
	private String nome;
	private Date dt_criacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDt_criacao() {
		return dt_criacao;
	}
	public void setDt_criacao(Date dt_criacao) {
		this.dt_criacao = dt_criacao;
	}
	
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", dt_criacao=" + dt_criacao + "]";
	}
	
	

}
