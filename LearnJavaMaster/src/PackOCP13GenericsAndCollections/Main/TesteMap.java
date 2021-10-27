package PackOCP13GenericsAndCollections.Main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import PackOCP13GenericsAndCollections.Entity.Curso;

public class TesteMap {

	public static void main(String[] args) {

			
			Map<Integer, String> mapaNomes =  new HashMap<Integer, String>();
			Map<String, List<Curso>> mapa =  new HashMap<String,  List<Curso>>();
			
			List<Curso> lista =  new ArrayList<Curso>(); //criar objeto eu que fiz
			
			Curso curso1 = new Curso();//objeto curso vou enfiar na lista
			curso1.setNome("COMPUTACAO");
			curso1.setDt_criacao(new Date());
			
			Curso curso2 = new Curso();//vai tbm pra lista
			curso2.setNome("NUTRICAO");
			curso2.setDt_criacao(new Date());
			
			lista.add(curso1); //introduzindo na currso na lista
			lista.add(curso2);
			
			mapa.put("Curso", lista);

			//System.out.println(mapa);
			//resgatando o nome da posição 2
			//System.out.println(mapa.get("Curso").toString());
		
			
			for (Map.Entry<String, List<Curso>> entry : mapa.entrySet())
			{
			    System.out.println(entry.getKey() + "/" + entry.getValue());
			}
		}

}
