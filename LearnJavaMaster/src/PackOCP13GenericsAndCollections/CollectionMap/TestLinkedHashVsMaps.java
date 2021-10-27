package PackOCP13GenericsAndCollections.CollectionMap;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class TestLinkedHashVsMaps {
    public static void main(String[] args) {
        var staff = new LinkedHashMap<String, Employee>();
        staff.put("144-25-5464", new Employee("Amy Lee"));
        staff.put("567-24-2546", new Employee("Harry Hacker"));
        staff.put("157-62-7935", new Employee("Gary Cooper"));
        staff.put("456-62-5527", new Employee("Francesca Cruz"));

        Iterator iterKey = staff.keySet().iterator();
        Iterator iterValues = staff.values().iterator();
        while(iterKey.hasNext() && iterValues.hasNext()){
            System.out.println(iterKey.next() +"- "+ iterValues.next());
        }
    }
}
