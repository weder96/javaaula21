package PackOCP13GenericsAndCollections.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Escola {
	private String nome;
	private Date dt_criacao;
	private List<Curso> listaCurso;
	
	public List<Curso> getListaCurso() {
		if(listaCurso == null){
			listaCurso = new ArrayList<Curso>();
		}
		return listaCurso;
	}
	public void setListaCurso(List<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}
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
	
	

}
