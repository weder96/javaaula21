package PackOCA01JavaBasics.StudyClass34Methods.labs;

public class Exer01 {
    
    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    
    public static void main(String[] args) {
        
        imprimirValor();
        
        Contador.incrementar();
        
        imprimirValor();
        
        Contador.zerar();
        
        imprimirValor();
        
        Contador.incrementar();
        Contador.incrementar();
        Contador.incrementar();
        
        imprimirValor();
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        
        imprimirValor();
    }
}
