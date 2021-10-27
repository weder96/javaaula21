package OCA07_Working_with_Inheritance.enum_01;

public class TestadoraEnum {
	public static void escolheOpcao(OpcoesMenu opcao){
		if(opcao == OpcoesMenu.SALVAR){
			System.out.println("Salvando o arquivo!");
		}
		else if(opcao == OpcoesMenu.ABRIR){
			System.out.println("Abrindo o arquivo!");
			System.out.println(opcao.getValor());
		}
	}

	public static void main(String[] args) {
		escolheOpcao(OpcoesMenu.ABRIR);	
	}
}