package OCA06_Working_with_Methods_and_Encapsulation.entity;

public class Conta {
	
    private int numero;
    private Cliente cliente;
    
    //construtor static
    static{
    	System.out.println("executando construtor static");
    }
    
	public Conta(){System.out.println("teste construtor");};
	
	public Conta(int numero){
		this.numero = numero;
	}  
	
	public Conta(Cliente cliente, int numero){
		this.cliente = cliente;
		this.numero = numero;
	}
	
	 public Cliente getCliente() {
		 if(cliente == null){
			this.cliente = new Cliente();
		 }
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}


	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
   
   
}
