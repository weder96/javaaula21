package PackOCA09SelectedClass;

public class MS01MethodStringBuilder {
	 public static void main(String[] args) {
         
	        StringBuilder buffer = new StringBuilder("João Silveira Batista");
	        System.out.printf(" buffer = %s\n "
	        		+ "tamanho = %d\n "
	        		+ "capacidade (%d (tamanho) + " 
	                + "16(valor inicial padrão)) = %d\n\n",
	                buffer.toString(),
	                buffer.length(),
	                buffer.length(),
	                buffer.capacity());
	         
	        //EXPANDE A CAPACIDADE P/ 75 CARACTERES
	        buffer.ensureCapacity(75);
	        System.out.printf("Nova Capacidade = %d\n\n", buffer.capacity());
	         
	        //REDEFINE O TAMANHO, NÃO APARECENDO OS CARACTERES 
	        // SE O ARGUMENTO FOR MENOR QUE A QUANTIDADE DE CARACTERES ORIGINAL
	        buffer.setLength(10);
	        System.out.printf("Novo tamanho = %d\n "
	        		+ "buffer = %s\n",
	        		buffer.length(), 
	                buffer.toString());
	    }
	}