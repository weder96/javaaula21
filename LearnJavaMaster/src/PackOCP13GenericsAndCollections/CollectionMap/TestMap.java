package PackOCP13GenericsAndCollections.CollectionMap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class TestMap {
    public static void main(String[] args) {
        var staff = new HashMap<String, Employee>(); // HashMap implements Map
        var harry = new Employee("Harry Hacker");
        staff.put("987-98-9996", harry);
        for (String key : staff.keySet()) { //Capturamos o valor a partir da chave
            Employee employee = staff.get(key);
            System.out.println(key + " = " + employee);
        }

        var id = "987-98-9996";
        Employee emp = staff.get(id); // gets harry
        System.out.println(emp);

        var scores = new HashMap<String, Integer>();
        int score = scores.getOrDefault(id, 0); // gets 0 if the id is not present
        System.out.println("teste int "+ score);

        scores.put("1", 2);
        scores.put("2", 3);
        scores.forEach((k, v) ->
                System.out.println("key=" + k + ", value=" + v));

        // remove an
         scores.remove("1");
        scores.forEach((k, v) ->
                System.out.println("key=" + k + ", value=" + v));

        for (Map.Entry<String, Employee> entry : staff.entrySet()) {
            String k = entry.getKey();
            Employee v = entry.getValue();
            // do something with k, v
        }

        for (var entry : staff.entrySet()) {
            String k = entry.getKey();
            Employee v = entry.getValue();
            System.out.println("k: "+k);
            System.out.println("v: "+v);
        }

        staff.forEach((k, v) -> {
            System.out.println("kFor: "+k);
            System.out.println("vFor: "+v);
        });

        WeakHashMap<UniqueImageName, BigImage> mapWeak = new WeakHashMap<>();
        BigImage bigImage = new BigImage("image_id");
        UniqueImageName imageName = new UniqueImageName("name_of_big_image");

        mapWeak.put(imageName, bigImage);
        System.out.println(mapWeak.containsKey(imageName));
        System.out.println(mapWeak.get(imageName));

        imageName = null;
        System.gc();
        System.out.println(mapWeak);
        System.out.println(mapWeak.isEmpty());
    }
}
