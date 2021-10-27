package PackOCA01JavaBasics.StudyClass11Variables;

public class Variaveis {

	public static void main(String[] args) {
		
		//convenção Java
		int idade = 20;
		String nome = "Weder";
		String nomeDoMeuCachorro = "Au Au";
		String ano2020 = "2020";
		
		//aceito, mas não utilizado
		int __idade;
		int $idade;
		
		//não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 25;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		
		// má prática
		int a = 10;
		String b = "Weder";
	}

}
