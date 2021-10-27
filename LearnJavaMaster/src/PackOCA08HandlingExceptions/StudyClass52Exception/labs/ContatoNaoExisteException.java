package PackOCA08HandlingExceptions.StudyClass52Exception.labs;

public class ContatoNaoExisteException extends Exception {
    
    private String nomeContato;

    public ContatoNaoExisteException(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    @Override
    public String getMessage() {
        return "Contato " + nomeContato + " não existe na agenda!";
    }
    
    
}
