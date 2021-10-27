package PackOCP11JavaClassDesign.Study02.proj_random;

import java.util.Random;
import java.util.HashSet;
// import java.util.List;
// import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        /*
        Random randomGenerator = new Random();
        List<Message> messages = new ArrayList<Message>();
        */

        Random randomGenerator = new Random();
        HashSet<Message> messages = new HashSet<Message>();

        messages.add(new Message("Bom dia!"));
        messages.add(new Message("Boa tarde!"));
        messages.add(new Message("Boa noite!"));
        messages.add(new Message("Seja bem vindo!"));
        messages.add(new Message("Se garantiu, gld!"));

        /*
        System.out.println(messages.get(randomGenerator.nextInt(messages.size())).getText());
        */

        for (Message msg : messages) {
            System.out.println(msg.getText());
        }
    }
}
