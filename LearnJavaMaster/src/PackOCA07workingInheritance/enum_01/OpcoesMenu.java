package OCA07_Working_with_Inheritance.enum_01;
	
	public enum OpcoesMenu {	
		SALVAR(1), 
		IMPRMIR(2), 
		ABRIR(3), 
		VISUALIZAR(4), 
		FECHAR(5);
		
		private final int valor;
		
	    OpcoesMenu(int valorOpcao){
			valor = valorOpcao;
		}
		public int getValor(){
			return valor;
		}
	}

