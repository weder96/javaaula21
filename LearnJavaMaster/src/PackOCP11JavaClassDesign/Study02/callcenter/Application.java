package PackOCP11JavaClassDesign.Study02.callcenter;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Callcenter callcenter = new Callcenter();
        String line;

        callcenter.addNewEntry("tela", "Já tentou reiniciar o monitor?");
        callcenter.addNewEntry("monitor", "O cabo está conectado?");
        callcenter.addNewEntry("internet", "Você pagou a conta?");
        callcenter.addNewEntry("conexão", "Já tentou reiniciar o roteador?");
        callcenter.addNewEntry("teclado", "Já verificou se o teclado está conectado?");
        callcenter.addNewEntry("mouse", "Já verificou se o mouse está conectado?");

        System.out.println("Bem vindo ao callcenter automatizado!\nQual o seu problema?");
        while (reader.hasNextLine() && !((line = reader.nextLine().toLowerCase()).equals("y"))) {
            boolean found = false;
            if (line.equals("sim")) {
                System.out.println("Acredito que o seu problema já foi resolvido. Digite 'y' para sair...");
            } else {
                for (String key : line.split(" "))
                    found |= callcenter.getAnswer(key);
                if (!found)
                    System.out.println("Você poderia ser mais específico?");
            }
        }
        System.out.println("Programa encerrado. Até logo!");
    }
}
