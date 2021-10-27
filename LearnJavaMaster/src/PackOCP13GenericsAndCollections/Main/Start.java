package PackOCP13GenericsAndCollections.Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import PackOCP13GenericsAndCollections.Entity.Curso;
import PackOCP13GenericsAndCollections.Entity.Escola;

public class Start {

	public static void main(String[] args) {
	List<Curso> lista =  new ArrayList<Curso>(); //criar objeto eu que fiz
	
	Curso curso1 = new Curso();//objeto curso vou enfiar na lista
	curso1.setNome("COMPUTACAO");
	curso1.setDt_criacao(new Date());
	
	Curso curso2 = new Curso();//vai tbm pra lista
	curso2.setNome("NUTRICAO");
	curso2.setDt_criacao(new Date());
	
	lista.add(curso1); //introduzindo na currso na lista
	lista.add(curso2);
	
	Escola escola = new Escola(); //criando obj escola
	escola.setNome("escolinha do tio edmilson");
	escola.setDt_criacao(new Date());
	escola.setListaCurso(lista); 
	
	
	//System.out.println(escola.getListaCurso().get(1).getNome());
	
	for(Curso itens: escola.getListaCurso()){
		System.out.println(itens.getNome());	
	}
	System.out.println(escola.getListaCurso().contains(curso1));
	System.out.println(escola.getListaCurso().isEmpty());
	System.out.println(escola.getListaCurso().size());

	for(int i =0; i<escola.getListaCurso().size();i++){
		System.out.println(escola.getListaCurso().get(i).getNome());	
	}
	
	
	}

	
}
