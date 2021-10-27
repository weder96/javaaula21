package PackOCP13GenericsAndCollections.projectGenerics.bookFunctionalProgramming;

import java.util.List;

public class Execute {
    public static void main(String[] args) {
        boolean found = false;
        List<String> cities = List.of("Boston", "Chicago", "New York");
        for(String city : cities) {
            if(city.equals("Chicago")) {
                found = true;
                break;
            }
        }
        System.out.println(found);

        System.out.println("Found chicago?:" + cities.contains("Chicago"));
    }
}
