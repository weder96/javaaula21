package PackOCP13GenericsAndCollections.projectGenerics.streamJ8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class S02StreamFilterMap {

	public static void main(String[] args) {
		List<Pessoa> listaPessoas = Arrays.asList(
				new Pessoa("Joao", 32),
                new Pessoa("Antonio", 20),     
                new Pessoa("Maria", 18),
                new Pessoa("Angela", 30));

				Stream<Pessoa> streamPessoas = listaPessoas.stream();

				Integer somaIdade = streamPessoas.filter(p -> p.getNome().startsWith("A")).mapToInt(p -> p.getIdade()).sum();
				System.out.println(somaIdade);
				assert somaIdade == 50;
				
				Stream<Pessoa> streamPessoas2 = listaPessoas.stream();
				Integer maiorIdadde = streamPessoas2.mapToInt(p-> p.getIdade()).max().getAsInt();
				System.out.println(maiorIdadde);
				assert maiorIdadde == 32;
				
				Stream<Pessoa> streamPessoas3 = listaPessoas.stream();
				Integer menorIdade = streamPessoas3.mapToInt(p -> p.getIdade()).min().getAsInt();
				System.out.println(menorIdade);
				assert menorIdade == 18;
				
				
				
				Stream<Pessoa> streamPessoas4 = listaPessoas.stream();
				 
				IntSummaryStatistics intSummStat  = streamPessoas4.filter(p -> p.getNome().startsWith("A"))
				                 .mapToInt(p -> p.getIdade()).summaryStatistics();
				         
				System.out.println(intSummStat.getSum());
				System.out.println(intSummStat.getMax());
				System.out.println(intSummStat.getMin());
				System.out.println(intSummStat.getAverage());
				System.out.println(intSummStat.getCount());
				
				
				
				IntStream intStream = listaPessoas.stream().mapToInt(p -> p.getIdade());
				Double mediaIdades = intStream.average().getAsDouble();
				
				System.out.println(mediaIdades);
				
				
				Stream<Pessoa> streamPessoas6 = listaPessoas.stream();
				List<Pessoa> listPessoas = streamPessoas6.filter(p -> p.getNome().startsWith("A")).collect(Collectors.toList());
       
				Stream<Pessoa> streamPessoas7 = listaPessoas.stream();
				Set<Pessoa> setPessoas = streamPessoas7.filter(p -> p.getNome().startsWith("A")).collect(Collectors.toSet());
				
				for(Pessoa pes: setPessoas){
					System.out.println("Set["+pes.toString()+"]");
				}
				
				for(Pessoa pes2: listPessoas){
					System.out.println("List["+pes2.toString()+"]");
				}
				
				
				Map<Integer, List<Pessoa>> map = listaPessoas.stream().collect(Collectors.groupingBy(Pessoa::getIdade));
				map.get(18).forEach(p -> System.out.println("Map["+p.getNome()+"]"));
				
				
				//há um novo tipo no Java 8 que é a classe Optional. Essa classe é um repositório que guarda um objeto e disponibiliza métodos 
				//capazes de lidar com esse objeto seja ele nulo ou não. Para termos um referência para uma classe 
				//Optional é necessário invocar uma Operação Terminal em um Stream
				
				Optional<Pessoa> optPessoa = listaPessoas.stream().filter(p -> p.getIdade() > 18).findAny();
				//.findAny();
				//.findFirst();
		         
				if (optPessoa.isPresent()) {
				    Pessoa p = optPessoa.get();
				    System.out.println(p.getNome() +"-"+ p.getIdade());
				}
				         
				optPessoa.ifPresent(p -> System.out.println(p.getNome() +"-"+ p.getIdade()));
				         
				optPessoa.orElseThrow(null);
				optPessoa.orElse(new Pessoa("Joao", 28));
				
				

	}

}
