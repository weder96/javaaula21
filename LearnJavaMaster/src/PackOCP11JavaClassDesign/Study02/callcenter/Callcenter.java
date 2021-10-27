package PackOCP11JavaClassDesign.Study02.callcenter;

import java.util.HashMap;

public class Callcenter {
    HashMap<String, String> dictionary;

    public Callcenter() {
        this.dictionary = new HashMap<String, String>();
    }

    public void addNewEntry(String key, String val) {
        this.dictionary.put(key.toLowerCase(), val);
    }

    public boolean getAnswer(String question) {
        if (this.dictionary.get(question) != null) {
            System.out.println(this.dictionary.get(question.toLowerCase()));
            return true;
        } else {
            return false;
        }
    }
}
