package PackOCA08HandlingExceptions.StudyClass52Exception.labs;

public class AgendaCheiaExeption extends Exception {

    @Override
    public String getMessage() {
       return "Agenda já está cheia";
    }
 
}
